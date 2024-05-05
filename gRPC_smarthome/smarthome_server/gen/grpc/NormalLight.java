// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: light.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

/**
 * Protobuf type {@code gen.grpc.NormalLight}
 */
public final class NormalLight extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:gen.grpc.NormalLight)
    NormalLightOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      NormalLight.class.getName());
  }
  // Use NormalLight.newBuilder() to construct.
  private NormalLight(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NormalLight() {
    room_ = 0;
    state_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gen.grpc.LightOuterClass.internal_static_gen_grpc_NormalLight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gen.grpc.LightOuterClass.internal_static_gen_grpc_NormalLight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gen.grpc.NormalLight.class, gen.grpc.NormalLight.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int ROOM_FIELD_NUMBER = 2;
  private int room_ = 0;
  /**
   * <code>.gen.grpc.Room room = 2;</code>
   * @return The enum numeric value on the wire for room.
   */
  @java.lang.Override public int getRoomValue() {
    return room_;
  }
  /**
   * <code>.gen.grpc.Room room = 2;</code>
   * @return The room.
   */
  @java.lang.Override public gen.grpc.Room getRoom() {
    gen.grpc.Room result = gen.grpc.Room.forNumber(room_);
    return result == null ? gen.grpc.Room.UNRECOGNIZED : result;
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_ = 0;
  /**
   * <code>.gen.grpc.LightState state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.gen.grpc.LightState state = 3;</code>
   * @return The state.
   */
  @java.lang.Override public gen.grpc.LightState getState() {
    gen.grpc.LightState result = gen.grpc.LightState.forNumber(state_);
    return result == null ? gen.grpc.LightState.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (room_ != gen.grpc.Room.DEFAULT.getNumber()) {
      output.writeEnum(2, room_);
    }
    if (state_ != gen.grpc.LightState.OFF.getNumber()) {
      output.writeEnum(3, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (room_ != gen.grpc.Room.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, room_);
    }
    if (state_ != gen.grpc.LightState.OFF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, state_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof gen.grpc.NormalLight)) {
      return super.equals(obj);
    }
    gen.grpc.NormalLight other = (gen.grpc.NormalLight) obj;

    if (getId()
        != other.getId()) return false;
    if (room_ != other.room_) return false;
    if (state_ != other.state_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ROOM_FIELD_NUMBER;
    hash = (53 * hash) + room_;
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gen.grpc.NormalLight parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.NormalLight parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.NormalLight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.NormalLight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.NormalLight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.NormalLight parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.NormalLight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.NormalLight parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static gen.grpc.NormalLight parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static gen.grpc.NormalLight parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.NormalLight parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.NormalLight parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(gen.grpc.NormalLight prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code gen.grpc.NormalLight}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gen.grpc.NormalLight)
      gen.grpc.NormalLightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_NormalLight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_NormalLight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gen.grpc.NormalLight.class, gen.grpc.NormalLight.Builder.class);
    }

    // Construct using gen.grpc.NormalLight.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0L;
      room_ = 0;
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_NormalLight_descriptor;
    }

    @java.lang.Override
    public gen.grpc.NormalLight getDefaultInstanceForType() {
      return gen.grpc.NormalLight.getDefaultInstance();
    }

    @java.lang.Override
    public gen.grpc.NormalLight build() {
      gen.grpc.NormalLight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gen.grpc.NormalLight buildPartial() {
      gen.grpc.NormalLight result = new gen.grpc.NormalLight(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(gen.grpc.NormalLight result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.room_ = room_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.state_ = state_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gen.grpc.NormalLight) {
        return mergeFrom((gen.grpc.NormalLight)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gen.grpc.NormalLight other) {
      if (other == gen.grpc.NormalLight.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.room_ != 0) {
        setRoomValue(other.getRoomValue());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              room_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private int room_ = 0;
    /**
     * <code>.gen.grpc.Room room = 2;</code>
     * @return The enum numeric value on the wire for room.
     */
    @java.lang.Override public int getRoomValue() {
      return room_;
    }
    /**
     * <code>.gen.grpc.Room room = 2;</code>
     * @param value The enum numeric value on the wire for room to set.
     * @return This builder for chaining.
     */
    public Builder setRoomValue(int value) {
      room_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.gen.grpc.Room room = 2;</code>
     * @return The room.
     */
    @java.lang.Override
    public gen.grpc.Room getRoom() {
      gen.grpc.Room result = gen.grpc.Room.forNumber(room_);
      return result == null ? gen.grpc.Room.UNRECOGNIZED : result;
    }
    /**
     * <code>.gen.grpc.Room room = 2;</code>
     * @param value The room to set.
     * @return This builder for chaining.
     */
    public Builder setRoom(gen.grpc.Room value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      room_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gen.grpc.Room room = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoom() {
      bitField0_ = (bitField0_ & ~0x00000002);
      room_ = 0;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.gen.grpc.LightState state = 3;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.gen.grpc.LightState state = 3;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.gen.grpc.LightState state = 3;</code>
     * @return The state.
     */
    @java.lang.Override
    public gen.grpc.LightState getState() {
      gen.grpc.LightState result = gen.grpc.LightState.forNumber(state_);
      return result == null ? gen.grpc.LightState.UNRECOGNIZED : result;
    }
    /**
     * <code>.gen.grpc.LightState state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(gen.grpc.LightState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gen.grpc.LightState state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      state_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:gen.grpc.NormalLight)
  }

  // @@protoc_insertion_point(class_scope:gen.grpc.NormalLight)
  private static final gen.grpc.NormalLight DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gen.grpc.NormalLight();
  }

  public static gen.grpc.NormalLight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalLight>
      PARSER = new com.google.protobuf.AbstractParser<NormalLight>() {
    @java.lang.Override
    public NormalLight parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NormalLight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalLight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gen.grpc.NormalLight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

