// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: light.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

/**
 * Protobuf type {@code gen.grpc.ListLightsResponse}
 */
public final class ListLightsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:gen.grpc.ListLightsResponse)
    ListLightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ListLightsResponse.class.getName());
  }
  // Use ListLightsResponse.newBuilder() to construct.
  private ListLightsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListLightsResponse() {
    lights_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gen.grpc.LightOuterClass.internal_static_gen_grpc_ListLightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gen.grpc.LightOuterClass.internal_static_gen_grpc_ListLightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gen.grpc.ListLightsResponse.class, gen.grpc.ListLightsResponse.Builder.class);
  }

  public static final int LIGHTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<gen.grpc.Light> lights_;
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<gen.grpc.Light> getLightsList() {
    return lights_;
  }
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends gen.grpc.LightOrBuilder> 
      getLightsOrBuilderList() {
    return lights_;
  }
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  @java.lang.Override
  public int getLightsCount() {
    return lights_.size();
  }
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  @java.lang.Override
  public gen.grpc.Light getLights(int index) {
    return lights_.get(index);
  }
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  @java.lang.Override
  public gen.grpc.LightOrBuilder getLightsOrBuilder(
      int index) {
    return lights_.get(index);
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
    for (int i = 0; i < lights_.size(); i++) {
      output.writeMessage(1, lights_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lights_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lights_.get(i));
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
    if (!(obj instanceof gen.grpc.ListLightsResponse)) {
      return super.equals(obj);
    }
    gen.grpc.ListLightsResponse other = (gen.grpc.ListLightsResponse) obj;

    if (!getLightsList()
        .equals(other.getLightsList())) return false;
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
    if (getLightsCount() > 0) {
      hash = (37 * hash) + LIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getLightsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gen.grpc.ListLightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.ListLightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.ListLightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static gen.grpc.ListLightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static gen.grpc.ListLightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.ListLightsResponse parseFrom(
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
  public static Builder newBuilder(gen.grpc.ListLightsResponse prototype) {
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
   * Protobuf type {@code gen.grpc.ListLightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gen.grpc.ListLightsResponse)
      gen.grpc.ListLightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_ListLightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_ListLightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gen.grpc.ListLightsResponse.class, gen.grpc.ListLightsResponse.Builder.class);
    }

    // Construct using gen.grpc.ListLightsResponse.newBuilder()
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
      if (lightsBuilder_ == null) {
        lights_ = java.util.Collections.emptyList();
      } else {
        lights_ = null;
        lightsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gen.grpc.LightOuterClass.internal_static_gen_grpc_ListLightsResponse_descriptor;
    }

    @java.lang.Override
    public gen.grpc.ListLightsResponse getDefaultInstanceForType() {
      return gen.grpc.ListLightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public gen.grpc.ListLightsResponse build() {
      gen.grpc.ListLightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gen.grpc.ListLightsResponse buildPartial() {
      gen.grpc.ListLightsResponse result = new gen.grpc.ListLightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(gen.grpc.ListLightsResponse result) {
      if (lightsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lights_ = java.util.Collections.unmodifiableList(lights_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lights_ = lights_;
      } else {
        result.lights_ = lightsBuilder_.build();
      }
    }

    private void buildPartial0(gen.grpc.ListLightsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gen.grpc.ListLightsResponse) {
        return mergeFrom((gen.grpc.ListLightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gen.grpc.ListLightsResponse other) {
      if (other == gen.grpc.ListLightsResponse.getDefaultInstance()) return this;
      if (lightsBuilder_ == null) {
        if (!other.lights_.isEmpty()) {
          if (lights_.isEmpty()) {
            lights_ = other.lights_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLightsIsMutable();
            lights_.addAll(other.lights_);
          }
          onChanged();
        }
      } else {
        if (!other.lights_.isEmpty()) {
          if (lightsBuilder_.isEmpty()) {
            lightsBuilder_.dispose();
            lightsBuilder_ = null;
            lights_ = other.lights_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lightsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getLightsFieldBuilder() : null;
          } else {
            lightsBuilder_.addAllMessages(other.lights_);
          }
        }
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
              gen.grpc.Light m =
                  input.readMessage(
                      gen.grpc.Light.parser(),
                      extensionRegistry);
              if (lightsBuilder_ == null) {
                ensureLightsIsMutable();
                lights_.add(m);
              } else {
                lightsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<gen.grpc.Light> lights_ =
      java.util.Collections.emptyList();
    private void ensureLightsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lights_ = new java.util.ArrayList<gen.grpc.Light>(lights_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        gen.grpc.Light, gen.grpc.Light.Builder, gen.grpc.LightOrBuilder> lightsBuilder_;

    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public java.util.List<gen.grpc.Light> getLightsList() {
      if (lightsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lights_);
      } else {
        return lightsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public int getLightsCount() {
      if (lightsBuilder_ == null) {
        return lights_.size();
      } else {
        return lightsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public gen.grpc.Light getLights(int index) {
      if (lightsBuilder_ == null) {
        return lights_.get(index);
      } else {
        return lightsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder setLights(
        int index, gen.grpc.Light value) {
      if (lightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightsIsMutable();
        lights_.set(index, value);
        onChanged();
      } else {
        lightsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder setLights(
        int index, gen.grpc.Light.Builder builderForValue) {
      if (lightsBuilder_ == null) {
        ensureLightsIsMutable();
        lights_.set(index, builderForValue.build());
        onChanged();
      } else {
        lightsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder addLights(gen.grpc.Light value) {
      if (lightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightsIsMutable();
        lights_.add(value);
        onChanged();
      } else {
        lightsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder addLights(
        int index, gen.grpc.Light value) {
      if (lightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLightsIsMutable();
        lights_.add(index, value);
        onChanged();
      } else {
        lightsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder addLights(
        gen.grpc.Light.Builder builderForValue) {
      if (lightsBuilder_ == null) {
        ensureLightsIsMutable();
        lights_.add(builderForValue.build());
        onChanged();
      } else {
        lightsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder addLights(
        int index, gen.grpc.Light.Builder builderForValue) {
      if (lightsBuilder_ == null) {
        ensureLightsIsMutable();
        lights_.add(index, builderForValue.build());
        onChanged();
      } else {
        lightsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder addAllLights(
        java.lang.Iterable<? extends gen.grpc.Light> values) {
      if (lightsBuilder_ == null) {
        ensureLightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lights_);
        onChanged();
      } else {
        lightsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder clearLights() {
      if (lightsBuilder_ == null) {
        lights_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lightsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public Builder removeLights(int index) {
      if (lightsBuilder_ == null) {
        ensureLightsIsMutable();
        lights_.remove(index);
        onChanged();
      } else {
        lightsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public gen.grpc.Light.Builder getLightsBuilder(
        int index) {
      return getLightsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public gen.grpc.LightOrBuilder getLightsOrBuilder(
        int index) {
      if (lightsBuilder_ == null) {
        return lights_.get(index);  } else {
        return lightsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public java.util.List<? extends gen.grpc.LightOrBuilder> 
         getLightsOrBuilderList() {
      if (lightsBuilder_ != null) {
        return lightsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lights_);
      }
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public gen.grpc.Light.Builder addLightsBuilder() {
      return getLightsFieldBuilder().addBuilder(
          gen.grpc.Light.getDefaultInstance());
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public gen.grpc.Light.Builder addLightsBuilder(
        int index) {
      return getLightsFieldBuilder().addBuilder(
          index, gen.grpc.Light.getDefaultInstance());
    }
    /**
     * <code>repeated .gen.grpc.Light lights = 1;</code>
     */
    public java.util.List<gen.grpc.Light.Builder> 
         getLightsBuilderList() {
      return getLightsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        gen.grpc.Light, gen.grpc.Light.Builder, gen.grpc.LightOrBuilder> 
        getLightsFieldBuilder() {
      if (lightsBuilder_ == null) {
        lightsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            gen.grpc.Light, gen.grpc.Light.Builder, gen.grpc.LightOrBuilder>(
                lights_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lights_ = null;
      }
      return lightsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:gen.grpc.ListLightsResponse)
  }

  // @@protoc_insertion_point(class_scope:gen.grpc.ListLightsResponse)
  private static final gen.grpc.ListLightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gen.grpc.ListLightsResponse();
  }

  public static gen.grpc.ListLightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLightsResponse>() {
    @java.lang.Override
    public ListLightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gen.grpc.ListLightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
