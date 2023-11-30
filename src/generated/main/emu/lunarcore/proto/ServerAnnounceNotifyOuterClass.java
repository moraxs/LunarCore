// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class ServerAnnounceNotifyOuterClass {
  /**
   * Protobuf type {@code ServerAnnounceNotify}
   */
  public static final class ServerAnnounceNotify extends ProtoMessage<ServerAnnounceNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     */
    private final RepeatedMessage<AnnounceData> announceDataList = RepeatedMessage.newEmptyInstance(AnnounceData.getFactory());

    private ServerAnnounceNotify() {
    }

    /**
     * @return a new empty instance of {@code ServerAnnounceNotify}
     */
    public static ServerAnnounceNotify newInstance() {
      return new ServerAnnounceNotify();
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     * @return whether the announceDataList field is set
     */
    public boolean hasAnnounceDataList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     * @return this
     */
    public ServerAnnounceNotify clearAnnounceDataList() {
      bitField0_ &= ~0x00000001;
      announceDataList.clear();
      return this;
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAnnounceDataList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AnnounceData> getAnnounceDataList() {
      return announceDataList;
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AnnounceData> getMutableAnnounceDataList() {
      bitField0_ |= 0x00000001;
      return announceDataList;
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     * @param value the announceDataList to add
     * @return this
     */
    public ServerAnnounceNotify addAnnounceDataList(final AnnounceData value) {
      bitField0_ |= 0x00000001;
      announceDataList.add(value);
      return this;
    }

    /**
     * <code>repeated .ServerAnnounceNotify.AnnounceData announce_data_list = 2;</code>
     * @param values the announceDataList to add
     * @return this
     */
    public ServerAnnounceNotify addAllAnnounceDataList(final AnnounceData... values) {
      bitField0_ |= 0x00000001;
      announceDataList.addAll(values);
      return this;
    }

    @Override
    public ServerAnnounceNotify copyFrom(final ServerAnnounceNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        announceDataList.copyFrom(other.announceDataList);
      }
      return this;
    }

    @Override
    public ServerAnnounceNotify mergeFrom(final ServerAnnounceNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAnnounceDataList()) {
        getMutableAnnounceDataList().addAll(other.announceDataList);
      }
      return this;
    }

    @Override
    public ServerAnnounceNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      announceDataList.clear();
      return this;
    }

    @Override
    public ServerAnnounceNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      announceDataList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ServerAnnounceNotify)) {
        return false;
      }
      ServerAnnounceNotify other = (ServerAnnounceNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasAnnounceDataList() || announceDataList.equals(other.announceDataList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < announceDataList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(announceDataList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * announceDataList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(announceDataList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ServerAnnounceNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // announceDataList
            tag = input.readRepeatedMessage(announceDataList, tag);
            bitField0_ |= 0x00000001;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedMessage(FieldNames.announceDataList, announceDataList);
      }
      output.endObject();
    }

    @Override
    public ServerAnnounceNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1895739121:
          case 121672637: {
            if (input.isAtField(FieldNames.announceDataList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(announceDataList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ServerAnnounceNotify clone() {
      return new ServerAnnounceNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ServerAnnounceNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), data).checkInitialized();
    }

    public static ServerAnnounceNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input).checkInitialized();
    }

    public static ServerAnnounceNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ServerAnnounceNotify messages
     */
    public static MessageFactory<ServerAnnounceNotify> getFactory() {
      return ServerAnnounceNotifyFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code AnnounceData}
     */
    public static final class AnnounceData extends ProtoMessage<AnnounceData> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional int64 begin_time = 1;</code>
       */
      private long beginTime;

      /**
       * <code>optional int64 end_time = 4;</code>
       */
      private long endTime;

      /**
       * <code>optional uint32 config_id = 6;</code>
       */
      private int configId;

      /**
       * <code>optional uint32 center_system_frequency = 7;</code>
       */
      private int centerSystemFrequency;

      /**
       * <code>optional uint32 count_down_frequency = 9;</code>
       */
      private int countDownFrequency;

      /**
       * <code>optional bool is_center_system_last_5_every_minutes = 11;</code>
       */
      private boolean isCenterSystemLast5EveryMinutes;

      /**
       * <code>optional string count_down_text = 5;</code>
       */
      private final Utf8String countDownText = Utf8String.newEmptyInstance();

      /**
       * <code>optional string center_system_text = 8;</code>
       */
      private final Utf8String centerSystemText = Utf8String.newEmptyInstance();

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       */
      private final Utf8String dungeonConfirmText = Utf8String.newEmptyInstance();

      private AnnounceData() {
      }

      /**
       * @return a new empty instance of {@code AnnounceData}
       */
      public static AnnounceData newInstance() {
        return new AnnounceData();
      }

      /**
       * <code>optional int64 begin_time = 1;</code>
       * @return whether the beginTime field is set
       */
      public boolean hasBeginTime() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional int64 begin_time = 1;</code>
       * @return this
       */
      public AnnounceData clearBeginTime() {
        bitField0_ &= ~0x00000001;
        beginTime = 0L;
        return this;
      }

      /**
       * <code>optional int64 begin_time = 1;</code>
       * @return the beginTime
       */
      public long getBeginTime() {
        return beginTime;
      }

      /**
       * <code>optional int64 begin_time = 1;</code>
       * @param value the beginTime to set
       * @return this
       */
      public AnnounceData setBeginTime(final long value) {
        bitField0_ |= 0x00000001;
        beginTime = value;
        return this;
      }

      /**
       * <code>optional int64 end_time = 4;</code>
       * @return whether the endTime field is set
       */
      public boolean hasEndTime() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional int64 end_time = 4;</code>
       * @return this
       */
      public AnnounceData clearEndTime() {
        bitField0_ &= ~0x00000002;
        endTime = 0L;
        return this;
      }

      /**
       * <code>optional int64 end_time = 4;</code>
       * @return the endTime
       */
      public long getEndTime() {
        return endTime;
      }

      /**
       * <code>optional int64 end_time = 4;</code>
       * @param value the endTime to set
       * @return this
       */
      public AnnounceData setEndTime(final long value) {
        bitField0_ |= 0x00000002;
        endTime = value;
        return this;
      }

      /**
       * <code>optional uint32 config_id = 6;</code>
       * @return whether the configId field is set
       */
      public boolean hasConfigId() {
        return (bitField0_ & 0x00000004) != 0;
      }

      /**
       * <code>optional uint32 config_id = 6;</code>
       * @return this
       */
      public AnnounceData clearConfigId() {
        bitField0_ &= ~0x00000004;
        configId = 0;
        return this;
      }

      /**
       * <code>optional uint32 config_id = 6;</code>
       * @return the configId
       */
      public int getConfigId() {
        return configId;
      }

      /**
       * <code>optional uint32 config_id = 6;</code>
       * @param value the configId to set
       * @return this
       */
      public AnnounceData setConfigId(final int value) {
        bitField0_ |= 0x00000004;
        configId = value;
        return this;
      }

      /**
       * <code>optional uint32 center_system_frequency = 7;</code>
       * @return whether the centerSystemFrequency field is set
       */
      public boolean hasCenterSystemFrequency() {
        return (bitField0_ & 0x00000008) != 0;
      }

      /**
       * <code>optional uint32 center_system_frequency = 7;</code>
       * @return this
       */
      public AnnounceData clearCenterSystemFrequency() {
        bitField0_ &= ~0x00000008;
        centerSystemFrequency = 0;
        return this;
      }

      /**
       * <code>optional uint32 center_system_frequency = 7;</code>
       * @return the centerSystemFrequency
       */
      public int getCenterSystemFrequency() {
        return centerSystemFrequency;
      }

      /**
       * <code>optional uint32 center_system_frequency = 7;</code>
       * @param value the centerSystemFrequency to set
       * @return this
       */
      public AnnounceData setCenterSystemFrequency(final int value) {
        bitField0_ |= 0x00000008;
        centerSystemFrequency = value;
        return this;
      }

      /**
       * <code>optional uint32 count_down_frequency = 9;</code>
       * @return whether the countDownFrequency field is set
       */
      public boolean hasCountDownFrequency() {
        return (bitField0_ & 0x00000010) != 0;
      }

      /**
       * <code>optional uint32 count_down_frequency = 9;</code>
       * @return this
       */
      public AnnounceData clearCountDownFrequency() {
        bitField0_ &= ~0x00000010;
        countDownFrequency = 0;
        return this;
      }

      /**
       * <code>optional uint32 count_down_frequency = 9;</code>
       * @return the countDownFrequency
       */
      public int getCountDownFrequency() {
        return countDownFrequency;
      }

      /**
       * <code>optional uint32 count_down_frequency = 9;</code>
       * @param value the countDownFrequency to set
       * @return this
       */
      public AnnounceData setCountDownFrequency(final int value) {
        bitField0_ |= 0x00000010;
        countDownFrequency = value;
        return this;
      }

      /**
       * <code>optional bool is_center_system_last_5_every_minutes = 11;</code>
       * @return whether the isCenterSystemLast5EveryMinutes field is set
       */
      public boolean hasIsCenterSystemLast5EveryMinutes() {
        return (bitField0_ & 0x00000020) != 0;
      }

      /**
       * <code>optional bool is_center_system_last_5_every_minutes = 11;</code>
       * @return this
       */
      public AnnounceData clearIsCenterSystemLast5EveryMinutes() {
        bitField0_ &= ~0x00000020;
        isCenterSystemLast5EveryMinutes = false;
        return this;
      }

      /**
       * <code>optional bool is_center_system_last_5_every_minutes = 11;</code>
       * @return the isCenterSystemLast5EveryMinutes
       */
      public boolean getIsCenterSystemLast5EveryMinutes() {
        return isCenterSystemLast5EveryMinutes;
      }

      /**
       * <code>optional bool is_center_system_last_5_every_minutes = 11;</code>
       * @param value the isCenterSystemLast5EveryMinutes to set
       * @return this
       */
      public AnnounceData setIsCenterSystemLast5EveryMinutes(final boolean value) {
        bitField0_ |= 0x00000020;
        isCenterSystemLast5EveryMinutes = value;
        return this;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @return whether the countDownText field is set
       */
      public boolean hasCountDownText() {
        return (bitField0_ & 0x00000040) != 0;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @return this
       */
      public AnnounceData clearCountDownText() {
        bitField0_ &= ~0x00000040;
        countDownText.clear();
        return this;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @return the countDownText
       */
      public String getCountDownText() {
        return countDownText.getString();
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @return internal {@code Utf8String} representation of countDownText for reading
       */
      public Utf8String getCountDownTextBytes() {
        return this.countDownText;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @return internal {@code Utf8String} representation of countDownText for modifications
       */
      public Utf8String getMutableCountDownTextBytes() {
        bitField0_ |= 0x00000040;
        return this.countDownText;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @param value the countDownText to set
       * @return this
       */
      public AnnounceData setCountDownText(final CharSequence value) {
        bitField0_ |= 0x00000040;
        countDownText.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string count_down_text = 5;</code>
       * @param value the countDownText to set
       * @return this
       */
      public AnnounceData setCountDownText(final Utf8String value) {
        bitField0_ |= 0x00000040;
        countDownText.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @return whether the centerSystemText field is set
       */
      public boolean hasCenterSystemText() {
        return (bitField0_ & 0x00000080) != 0;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @return this
       */
      public AnnounceData clearCenterSystemText() {
        bitField0_ &= ~0x00000080;
        centerSystemText.clear();
        return this;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @return the centerSystemText
       */
      public String getCenterSystemText() {
        return centerSystemText.getString();
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @return internal {@code Utf8String} representation of centerSystemText for reading
       */
      public Utf8String getCenterSystemTextBytes() {
        return this.centerSystemText;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @return internal {@code Utf8String} representation of centerSystemText for modifications
       */
      public Utf8String getMutableCenterSystemTextBytes() {
        bitField0_ |= 0x00000080;
        return this.centerSystemText;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @param value the centerSystemText to set
       * @return this
       */
      public AnnounceData setCenterSystemText(final CharSequence value) {
        bitField0_ |= 0x00000080;
        centerSystemText.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string center_system_text = 8;</code>
       * @param value the centerSystemText to set
       * @return this
       */
      public AnnounceData setCenterSystemText(final Utf8String value) {
        bitField0_ |= 0x00000080;
        centerSystemText.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @return whether the dungeonConfirmText field is set
       */
      public boolean hasDungeonConfirmText() {
        return (bitField0_ & 0x00000100) != 0;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @return this
       */
      public AnnounceData clearDungeonConfirmText() {
        bitField0_ &= ~0x00000100;
        dungeonConfirmText.clear();
        return this;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @return the dungeonConfirmText
       */
      public String getDungeonConfirmText() {
        return dungeonConfirmText.getString();
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @return internal {@code Utf8String} representation of dungeonConfirmText for reading
       */
      public Utf8String getDungeonConfirmTextBytes() {
        return this.dungeonConfirmText;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @return internal {@code Utf8String} representation of dungeonConfirmText for modifications
       */
      public Utf8String getMutableDungeonConfirmTextBytes() {
        bitField0_ |= 0x00000100;
        return this.dungeonConfirmText;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @param value the dungeonConfirmText to set
       * @return this
       */
      public AnnounceData setDungeonConfirmText(final CharSequence value) {
        bitField0_ |= 0x00000100;
        dungeonConfirmText.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string dungeon_confirm_text = 14;</code>
       * @param value the dungeonConfirmText to set
       * @return this
       */
      public AnnounceData setDungeonConfirmText(final Utf8String value) {
        bitField0_ |= 0x00000100;
        dungeonConfirmText.copyFrom(value);
        return this;
      }

      @Override
      public AnnounceData copyFrom(final AnnounceData other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          beginTime = other.beginTime;
          endTime = other.endTime;
          configId = other.configId;
          centerSystemFrequency = other.centerSystemFrequency;
          countDownFrequency = other.countDownFrequency;
          isCenterSystemLast5EveryMinutes = other.isCenterSystemLast5EveryMinutes;
          countDownText.copyFrom(other.countDownText);
          centerSystemText.copyFrom(other.centerSystemText);
          dungeonConfirmText.copyFrom(other.dungeonConfirmText);
        }
        return this;
      }

      @Override
      public AnnounceData mergeFrom(final AnnounceData other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasBeginTime()) {
          setBeginTime(other.beginTime);
        }
        if (other.hasEndTime()) {
          setEndTime(other.endTime);
        }
        if (other.hasConfigId()) {
          setConfigId(other.configId);
        }
        if (other.hasCenterSystemFrequency()) {
          setCenterSystemFrequency(other.centerSystemFrequency);
        }
        if (other.hasCountDownFrequency()) {
          setCountDownFrequency(other.countDownFrequency);
        }
        if (other.hasIsCenterSystemLast5EveryMinutes()) {
          setIsCenterSystemLast5EveryMinutes(other.isCenterSystemLast5EveryMinutes);
        }
        if (other.hasCountDownText()) {
          getMutableCountDownTextBytes().copyFrom(other.countDownText);
        }
        if (other.hasCenterSystemText()) {
          getMutableCenterSystemTextBytes().copyFrom(other.centerSystemText);
        }
        if (other.hasDungeonConfirmText()) {
          getMutableDungeonConfirmTextBytes().copyFrom(other.dungeonConfirmText);
        }
        return this;
      }

      @Override
      public AnnounceData clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        beginTime = 0L;
        endTime = 0L;
        configId = 0;
        centerSystemFrequency = 0;
        countDownFrequency = 0;
        isCenterSystemLast5EveryMinutes = false;
        countDownText.clear();
        centerSystemText.clear();
        dungeonConfirmText.clear();
        return this;
      }

      @Override
      public AnnounceData clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        countDownText.clear();
        centerSystemText.clear();
        dungeonConfirmText.clear();
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof AnnounceData)) {
          return false;
        }
        AnnounceData other = (AnnounceData) o;
        return bitField0_ == other.bitField0_
          && (!hasBeginTime() || beginTime == other.beginTime)
          && (!hasEndTime() || endTime == other.endTime)
          && (!hasConfigId() || configId == other.configId)
          && (!hasCenterSystemFrequency() || centerSystemFrequency == other.centerSystemFrequency)
          && (!hasCountDownFrequency() || countDownFrequency == other.countDownFrequency)
          && (!hasIsCenterSystemLast5EveryMinutes() || isCenterSystemLast5EveryMinutes == other.isCenterSystemLast5EveryMinutes)
          && (!hasCountDownText() || countDownText.equals(other.countDownText))
          && (!hasCenterSystemText() || centerSystemText.equals(other.centerSystemText))
          && (!hasDungeonConfirmText() || dungeonConfirmText.equals(other.dungeonConfirmText));
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeInt64NoTag(beginTime);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 32);
          output.writeInt64NoTag(endTime);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(configId);
        }
        if ((bitField0_ & 0x00000008) != 0) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(centerSystemFrequency);
        }
        if ((bitField0_ & 0x00000010) != 0) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(countDownFrequency);
        }
        if ((bitField0_ & 0x00000020) != 0) {
          output.writeRawByte((byte) 88);
          output.writeBoolNoTag(isCenterSystemLast5EveryMinutes);
        }
        if ((bitField0_ & 0x00000040) != 0) {
          output.writeRawByte((byte) 42);
          output.writeStringNoTag(countDownText);
        }
        if ((bitField0_ & 0x00000080) != 0) {
          output.writeRawByte((byte) 66);
          output.writeStringNoTag(centerSystemText);
        }
        if ((bitField0_ & 0x00000100) != 0) {
          output.writeRawByte((byte) 114);
          output.writeStringNoTag(dungeonConfirmText);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(configId);
        }
        if ((bitField0_ & 0x00000008) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(centerSystemFrequency);
        }
        if ((bitField0_ & 0x00000010) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(countDownFrequency);
        }
        if ((bitField0_ & 0x00000020) != 0) {
          size += 2;
        }
        if ((bitField0_ & 0x00000040) != 0) {
          size += 1 + ProtoSink.computeStringSizeNoTag(countDownText);
        }
        if ((bitField0_ & 0x00000080) != 0) {
          size += 1 + ProtoSink.computeStringSizeNoTag(centerSystemText);
        }
        if ((bitField0_ & 0x00000100) != 0) {
          size += 1 + ProtoSink.computeStringSizeNoTag(dungeonConfirmText);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public AnnounceData mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // beginTime
              beginTime = input.readInt64();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 32) {
                break;
              }
            }
            case 32: {
              // endTime
              endTime = input.readInt64();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 48) {
                break;
              }
            }
            case 48: {
              // configId
              configId = input.readUInt32();
              bitField0_ |= 0x00000004;
              tag = input.readTag();
              if (tag != 56) {
                break;
              }
            }
            case 56: {
              // centerSystemFrequency
              centerSystemFrequency = input.readUInt32();
              bitField0_ |= 0x00000008;
              tag = input.readTag();
              if (tag != 72) {
                break;
              }
            }
            case 72: {
              // countDownFrequency
              countDownFrequency = input.readUInt32();
              bitField0_ |= 0x00000010;
              tag = input.readTag();
              if (tag != 88) {
                break;
              }
            }
            case 88: {
              // isCenterSystemLast5EveryMinutes
              isCenterSystemLast5EveryMinutes = input.readBool();
              bitField0_ |= 0x00000020;
              tag = input.readTag();
              if (tag != 42) {
                break;
              }
            }
            case 42: {
              // countDownText
              input.readString(countDownText);
              bitField0_ |= 0x00000040;
              tag = input.readTag();
              if (tag != 66) {
                break;
              }
            }
            case 66: {
              // centerSystemText
              input.readString(centerSystemText);
              bitField0_ |= 0x00000080;
              tag = input.readTag();
              if (tag != 114) {
                break;
              }
            }
            case 114: {
              // dungeonConfirmText
              input.readString(dungeonConfirmText);
              bitField0_ |= 0x00000100;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeInt64(FieldNames.beginTime, beginTime);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeInt64(FieldNames.endTime, endTime);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeUInt32(FieldNames.configId, configId);
        }
        if ((bitField0_ & 0x00000008) != 0) {
          output.writeUInt32(FieldNames.centerSystemFrequency, centerSystemFrequency);
        }
        if ((bitField0_ & 0x00000010) != 0) {
          output.writeUInt32(FieldNames.countDownFrequency, countDownFrequency);
        }
        if ((bitField0_ & 0x00000020) != 0) {
          output.writeBool(FieldNames.isCenterSystemLast5EveryMinutes, isCenterSystemLast5EveryMinutes);
        }
        if ((bitField0_ & 0x00000040) != 0) {
          output.writeString(FieldNames.countDownText, countDownText);
        }
        if ((bitField0_ & 0x00000080) != 0) {
          output.writeString(FieldNames.centerSystemText, centerSystemText);
        }
        if ((bitField0_ & 0x00000100) != 0) {
          output.writeString(FieldNames.dungeonConfirmText, dungeonConfirmText);
        }
        output.endObject();
      }

      @Override
      public AnnounceData mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case -1072839914:
            case 1112183971: {
              if (input.isAtField(FieldNames.beginTime)) {
                if (!input.trySkipNullValue()) {
                  beginTime = input.readInt64();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -1607243192:
            case 1725551537: {
              if (input.isAtField(FieldNames.endTime)) {
                if (!input.trySkipNullValue()) {
                  endTime = input.readInt64();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -580140035:
            case -804450504: {
              if (input.isAtField(FieldNames.configId)) {
                if (!input.trySkipNullValue()) {
                  configId = input.readUInt32();
                  bitField0_ |= 0x00000004;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -1285402920:
            case 671051254: {
              if (input.isAtField(FieldNames.centerSystemFrequency)) {
                if (!input.trySkipNullValue()) {
                  centerSystemFrequency = input.readUInt32();
                  bitField0_ |= 0x00000008;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 1551558155:
            case -1526415569: {
              if (input.isAtField(FieldNames.countDownFrequency)) {
                if (!input.trySkipNullValue()) {
                  countDownFrequency = input.readUInt32();
                  bitField0_ |= 0x00000010;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -68660299:
            case -630028317: {
              if (input.isAtField(FieldNames.isCenterSystemLast5EveryMinutes)) {
                if (!input.trySkipNullValue()) {
                  isCenterSystemLast5EveryMinutes = input.readBool();
                  bitField0_ |= 0x00000020;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 515044126:
            case 1806103418: {
              if (input.isAtField(FieldNames.countDownText)) {
                if (!input.trySkipNullValue()) {
                  input.readString(countDownText);
                  bitField0_ |= 0x00000040;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -1011450319:
            case 1305338963: {
              if (input.isAtField(FieldNames.centerSystemText)) {
                if (!input.trySkipNullValue()) {
                  input.readString(centerSystemText);
                  bitField0_ |= 0x00000080;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 136983795:
            case 1723587761: {
              if (input.isAtField(FieldNames.dungeonConfirmText)) {
                if (!input.trySkipNullValue()) {
                  input.readString(dungeonConfirmText);
                  bitField0_ |= 0x00000100;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public AnnounceData clone() {
        return new AnnounceData().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static AnnounceData parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new AnnounceData(), data).checkInitialized();
      }

      public static AnnounceData parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
      }

      public static AnnounceData parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
      }

      /**
       * @return factory for creating AnnounceData messages
       */
      public static MessageFactory<AnnounceData> getFactory() {
        return AnnounceDataFactory.INSTANCE;
      }

      private enum AnnounceDataFactory implements MessageFactory<AnnounceData> {
        INSTANCE;

        @Override
        public AnnounceData create() {
          return AnnounceData.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

        static final FieldName endTime = FieldName.forField("endTime", "end_time");

        static final FieldName configId = FieldName.forField("configId", "config_id");

        static final FieldName centerSystemFrequency = FieldName.forField("centerSystemFrequency", "center_system_frequency");

        static final FieldName countDownFrequency = FieldName.forField("countDownFrequency", "count_down_frequency");

        static final FieldName isCenterSystemLast5EveryMinutes = FieldName.forField("isCenterSystemLast5EveryMinutes", "is_center_system_last_5_every_minutes");

        static final FieldName countDownText = FieldName.forField("countDownText", "count_down_text");

        static final FieldName centerSystemText = FieldName.forField("centerSystemText", "center_system_text");

        static final FieldName dungeonConfirmText = FieldName.forField("dungeonConfirmText", "dungeon_confirm_text");
      }
    }

    private enum ServerAnnounceNotifyFactory implements MessageFactory<ServerAnnounceNotify> {
      INSTANCE;

      @Override
      public ServerAnnounceNotify create() {
        return ServerAnnounceNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName announceDataList = FieldName.forField("announceDataList", "announce_data_list");
    }
  }
}
