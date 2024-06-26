// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

/**
 * Protobuf type {@code gen.grpc.StringMessage}
 */
public final class StringMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:gen.grpc.StringMessage)
    StringMessageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      StringMessage.class.getName());
  }
  // Use StringMessage.newBuilder() to construct.
  private StringMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StringMessage() {
    arg1_ = "";
    arg2_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gen.grpc.Demo.internal_static_gen_grpc_StringMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gen.grpc.Demo.internal_static_gen_grpc_StringMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gen.grpc.StringMessage.class, gen.grpc.StringMessage.Builder.class);
  }

  public static final int ARG1_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object arg1_ = "";
  /**
   * <code>string arg1 = 1;</code>
   * @return The arg1.
   */
  @java.lang.Override
  public java.lang.String getArg1() {
    java.lang.Object ref = arg1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arg1_ = s;
      return s;
    }
  }
  /**
   * <code>string arg1 = 1;</code>
   * @return The bytes for arg1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArg1Bytes() {
    java.lang.Object ref = arg1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arg1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARG2_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object arg2_ = "";
  /**
   * <code>string arg2 = 2;</code>
   * @return The arg2.
   */
  @java.lang.Override
  public java.lang.String getArg2() {
    java.lang.Object ref = arg2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arg2_ = s;
      return s;
    }
  }
  /**
   * <code>string arg2 = 2;</code>
   * @return The bytes for arg2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArg2Bytes() {
    java.lang.Object ref = arg2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arg2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(arg1_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, arg1_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(arg2_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, arg2_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(arg1_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, arg1_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(arg2_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, arg2_);
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
    if (!(obj instanceof gen.grpc.StringMessage)) {
      return super.equals(obj);
    }
    gen.grpc.StringMessage other = (gen.grpc.StringMessage) obj;

    if (!getArg1()
        .equals(other.getArg1())) return false;
    if (!getArg2()
        .equals(other.getArg2())) return false;
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
    hash = (37 * hash) + ARG1_FIELD_NUMBER;
    hash = (53 * hash) + getArg1().hashCode();
    hash = (37 * hash) + ARG2_FIELD_NUMBER;
    hash = (53 * hash) + getArg2().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gen.grpc.StringMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.StringMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.StringMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.StringMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.StringMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.StringMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.StringMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.StringMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static gen.grpc.StringMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static gen.grpc.StringMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.StringMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.StringMessage parseFrom(
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
  public static Builder newBuilder(gen.grpc.StringMessage prototype) {
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
   * Protobuf type {@code gen.grpc.StringMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gen.grpc.StringMessage)
      gen.grpc.StringMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gen.grpc.Demo.internal_static_gen_grpc_StringMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gen.grpc.Demo.internal_static_gen_grpc_StringMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gen.grpc.StringMessage.class, gen.grpc.StringMessage.Builder.class);
    }

    // Construct using gen.grpc.StringMessage.newBuilder()
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
      arg1_ = "";
      arg2_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gen.grpc.Demo.internal_static_gen_grpc_StringMessage_descriptor;
    }

    @java.lang.Override
    public gen.grpc.StringMessage getDefaultInstanceForType() {
      return gen.grpc.StringMessage.getDefaultInstance();
    }

    @java.lang.Override
    public gen.grpc.StringMessage build() {
      gen.grpc.StringMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gen.grpc.StringMessage buildPartial() {
      gen.grpc.StringMessage result = new gen.grpc.StringMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(gen.grpc.StringMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.arg1_ = arg1_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.arg2_ = arg2_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gen.grpc.StringMessage) {
        return mergeFrom((gen.grpc.StringMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gen.grpc.StringMessage other) {
      if (other == gen.grpc.StringMessage.getDefaultInstance()) return this;
      if (!other.getArg1().isEmpty()) {
        arg1_ = other.arg1_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getArg2().isEmpty()) {
        arg2_ = other.arg2_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              arg1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              arg2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object arg1_ = "";
    /**
     * <code>string arg1 = 1;</code>
     * @return The arg1.
     */
    public java.lang.String getArg1() {
      java.lang.Object ref = arg1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arg1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string arg1 = 1;</code>
     * @return The bytes for arg1.
     */
    public com.google.protobuf.ByteString
        getArg1Bytes() {
      java.lang.Object ref = arg1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arg1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string arg1 = 1;</code>
     * @param value The arg1 to set.
     * @return This builder for chaining.
     */
    public Builder setArg1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      arg1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string arg1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArg1() {
      arg1_ = getDefaultInstance().getArg1();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string arg1 = 1;</code>
     * @param value The bytes for arg1 to set.
     * @return This builder for chaining.
     */
    public Builder setArg1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      arg1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object arg2_ = "";
    /**
     * <code>string arg2 = 2;</code>
     * @return The arg2.
     */
    public java.lang.String getArg2() {
      java.lang.Object ref = arg2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arg2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string arg2 = 2;</code>
     * @return The bytes for arg2.
     */
    public com.google.protobuf.ByteString
        getArg2Bytes() {
      java.lang.Object ref = arg2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arg2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string arg2 = 2;</code>
     * @param value The arg2 to set.
     * @return This builder for chaining.
     */
    public Builder setArg2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      arg2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string arg2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArg2() {
      arg2_ = getDefaultInstance().getArg2();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string arg2 = 2;</code>
     * @param value The bytes for arg2 to set.
     * @return This builder for chaining.
     */
    public Builder setArg2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      arg2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:gen.grpc.StringMessage)
  }

  // @@protoc_insertion_point(class_scope:gen.grpc.StringMessage)
  private static final gen.grpc.StringMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gen.grpc.StringMessage();
  }

  public static gen.grpc.StringMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringMessage>
      PARSER = new com.google.protobuf.AbstractParser<StringMessage>() {
    @java.lang.Override
    public StringMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<StringMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gen.grpc.StringMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

