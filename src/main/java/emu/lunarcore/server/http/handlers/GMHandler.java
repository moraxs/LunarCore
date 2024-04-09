package emu.lunarcore.server.http.handlers;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.http.objects.JsonResponse;
import emu.lunarcore.util.Utils;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.bson.Document;
import org.jetbrains.annotations.NotNull;

public final class GMHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String ip_address = Utils.getClientIpAddress(ctx);

        var set_uid = ctx.queryParam("uid");
        var set_username = ctx.queryParam("username");
        var set_command = ctx.queryParam("command");
        var set_password = ctx.queryParam("password");

        if (set_uid == null || set_uid.isEmpty()) {
            ctx.json(new JsonResponse(404, "The player UID was not entered"));
            return;
        }

        if (set_username == null || set_username.isEmpty()) {
            ctx.json(new JsonResponse(404, "The username was not entered"));
            return;
        }

        if (set_password == null || set_password.isEmpty()) {
            ctx.json(new JsonResponse(404, "The password was not entered"));
            return;
        }

        if (set_command == null || set_command.isEmpty()) {
            ctx.json(new JsonResponse(404, "The command was not entered"));
            return;
        }

        int tmp_uid = 0;
        try {
            tmp_uid = Integer.parseInt(set_uid);
        } catch (Exception e) {
            ctx.json(new JsonResponse(403, "The UID format is incorrect"));
            return;
        }

        // Connect to MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("lunarcore");
            MongoCollection<Document> playersCollection = database.getCollection("players");
            MongoCollection<Document> accountsCollection = database.getCollection("accounts");

            // Query players collection to get accountUid
            Document playersQuery = new Document("_id", tmp_uid);
            Document playersResult = playersCollection.find(playersQuery).first();
            if (playersResult == null) {
                ctx.json(new JsonResponse(403, "User authentication failed"));
                return;
            }

            int accountUid = playersResult.getInteger("accountUid");

            // Query accounts collection to get username
            Document accountsQuery = new Document("_id", accountUid);
            Document accountsResult = accountsCollection.find(accountsQuery).first();
            if (accountsResult == null) {
                ctx.json(new JsonResponse(403, "User authentication failed"));
                return;
            }

            String actualUsername = accountsResult.getString("username");

            // Compare usernames
            if (!actualUsername.equals(set_username)) {
                ctx.json(new JsonResponse(403, "Username does not match UID"));
                return;
            }
        } catch (Exception e) {
            ctx.json(new JsonResponse(500, "Error connecting to MongoDB"));
            return;
        }

        LunarCore.getLogger().info("Execute commands remotely [" + ip_address + " | Uid " + tmp_uid + " | username: " + set_username + " | password: " + set_password + "]: " + set_command);

        try {
            Player sender = LunarCore.getGameServer().getOnlinePlayerByUid(tmp_uid);
            var configHttp = LunarCore.getConfig().getHttpServer();
            if (sender == null) {
                if (configHttp.getGm_private() != null && configHttp.getGm_private().contains(set_password)) {
                    // Execute command
                } else {
                    ctx.json(new JsonResponse(201, "The player is not online"));
                    return;
                }
            } else {
                if (configHttp.getGm_public() != null && configHttp.getGm_public().contains(set_password)) {
                    sender.sendMessage("Someone uses the public key to execute the command");
                } else {
                    ctx.json(new JsonResponse(403, "The key is not correct"));
                    return;
                }
            }

            // Execute command
            LunarCore.getCommandManager().invoke(sender, set_command);
        } catch (Exception e) {
            LunarCore.getLogger().info("error", e);
            ctx.json(new JsonResponse(403, "error"));
            return;
        }

        ctx.json(new JsonResponse());
    }
}
