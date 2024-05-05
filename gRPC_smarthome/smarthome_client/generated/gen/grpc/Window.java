// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: window.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

/**
 * Protobuf type {@code gen.grpc.Window}
 */
public final class Window extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:gen.grpc.Window)
    WindowOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Window.class.getName());
  }
  // Use Window.newBuilder() to construct.
  private Window(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Window() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gen.grpc.WindowOuterClass.internal_static_gen_grpc_Window_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gen.grpc.WindowOuterClass.internal_static_gen_grpc_Window_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gen.grpc.Window.class, gen.grpc.Window.Builder.class);
  }

  private int windowTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object windowType_;
  public enum WindowTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STANDARD(1),
    ROOF(2),
    BALCONY(3),
    WINDOWTYPE_NOT_SET(0);
    private final int value;
    private WindowTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WindowTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static WindowTypeCase forNumber(int value) {
      switch (value) {
        case 1: return STANDARD;
        case 2: return ROOF;
        case 3: return BALCONY;
        case 0: return WINDOWTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public WindowTypeCase
  getWindowTypeCase() {
    return WindowTypeCase.forNumber(
        windowTypeCase_);
  }

  public static final int STANDARD_FIELD_NUMBER = 1;
  /**
   * <code>.gen.grpc.StandardWindow standard = 1;</code>
   * @return Whether the standard field is set.
   */
  @java.lang.Override
  public boolean hasStandard() {
    return windowTypeCase_ == 1;
  }
  /**
   * <code>.gen.grpc.StandardWindow standard = 1;</code>
   * @return The standard.
   */
  @java.lang.Override
  public gen.grpc.StandardWindow getStandard() {
    if (windowTypeCase_ == 1) {
       return (gen.grpc.StandardWindow) windowType_;
    }
    return gen.grpc.StandardWindow.getDefaultInstance();
  }
  /**
   * <code>.gen.grpc.StandardWindow standard = 1;</code>
   */
  @java.lang.Override
  public gen.grpc.StandardWindowOrBuilder getStandardOrBuilder() {
    if (windowTypeCase_ == 1) {
       return (gen.grpc.StandardWindow) windowType_;
    }
    return gen.grpc.StandardWindow.getDefaultInstance();
  }

  public static final int ROOF_FIELD_NUMBER = 2;
  /**
   * <code>.gen.grpc.RoofWindow roof = 2;</code>
   * @return Whether the roof field is set.
   */
  @java.lang.Override
  public boolean hasRoof() {
    return windowTypeCase_ == 2;
  }
  /**
   * <code>.gen.grpc.RoofWindow roof = 2;</code>
   * @return The roof.
   */
  @java.lang.Override
  public gen.grpc.RoofWindow getRoof() {
    if (windowTypeCase_ == 2) {
       return (gen.grpc.RoofWindow) windowType_;
    }
    return gen.grpc.RoofWindow.getDefaultInstance();
  }
  /**
   * <code>.gen.grpc.RoofWindow roof = 2;</code>
   */
  @java.lang.Override
  public gen.grpc.RoofWindowOrBuilder getRoofOrBuilder() {
    if (windowTypeCase_ == 2) {
       return (gen.grpc.RoofWindow) windowType_;
    }
    return gen.grpc.RoofWindow.getDefaultInstance();
  }

  public static final int BALCONY_FIELD_NUMBER = 3;
  /**
   * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
   * @return Whether the balcony field is set.
   */
  @java.lang.Override
  public boolean hasBalcony() {
    return windowTypeCase_ == 3;
  }
  /**
   * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
   * @return The balcony.
   */
  @java.lang.Override
  public gen.grpc.BalconyWindow getBalcony() {
    if (windowTypeCase_ == 3) {
       return (gen.grpc.BalconyWindow) windowType_;
    }
    return gen.grpc.BalconyWindow.getDefaultInstance();
  }
  /**
   * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
   */
  @java.lang.Override
  public gen.grpc.BalconyWindowOrBuilder getBalconyOrBuilder() {
    if (windowTypeCase_ == 3) {
       return (gen.grpc.BalconyWindow) windowType_;
    }
    return gen.grpc.BalconyWindow.getDefaultInstance();
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
    if (windowTypeCase_ == 1) {
      output.writeMessage(1, (gen.grpc.StandardWindow) windowType_);
    }
    if (windowTypeCase_ == 2) {
      output.writeMessage(2, (gen.grpc.RoofWindow) windowType_);
    }
    if (windowTypeCase_ == 3) {
      output.writeMessage(3, (gen.grpc.BalconyWindow) windowType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (gen.grpc.StandardWindow) windowType_);
    }
    if (windowTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (gen.grpc.RoofWindow) windowType_);
    }
    if (windowTypeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (gen.grpc.BalconyWindow) windowType_);
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
    if (!(obj instanceof gen.grpc.Window)) {
      return super.equals(obj);
    }
    gen.grpc.Window other = (gen.grpc.Window) obj;

    if (!getWindowTypeCase().equals(other.getWindowTypeCase())) return false;
    switch (windowTypeCase_) {
      case 1:
        if (!getStandard()
            .equals(other.getStandard())) return false;
        break;
      case 2:
        if (!getRoof()
            .equals(other.getRoof())) return false;
        break;
      case 3:
        if (!getBalcony()
            .equals(other.getBalcony())) return false;
        break;
      case 0:
      default:
    }
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
    switch (windowTypeCase_) {
      case 1:
        hash = (37 * hash) + STANDARD_FIELD_NUMBER;
        hash = (53 * hash) + getStandard().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ROOF_FIELD_NUMBER;
        hash = (53 * hash) + getRoof().hashCode();
        break;
      case 3:
        hash = (37 * hash) + BALCONY_FIELD_NUMBER;
        hash = (53 * hash) + getBalcony().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gen.grpc.Window parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.Window parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.Window parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.Window parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.Window parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.Window parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.Window parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.Window parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static gen.grpc.Window parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static gen.grpc.Window parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.Window parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.Window parseFrom(
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
  public static Builder newBuilder(gen.grpc.Window prototype) {
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
   * Protobuf type {@code gen.grpc.Window}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gen.grpc.Window)
      gen.grpc.WindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gen.grpc.WindowOuterClass.internal_static_gen_grpc_Window_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gen.grpc.WindowOuterClass.internal_static_gen_grpc_Window_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gen.grpc.Window.class, gen.grpc.Window.Builder.class);
    }

    // Construct using gen.grpc.Window.newBuilder()
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
      if (standardBuilder_ != null) {
        standardBuilder_.clear();
      }
      if (roofBuilder_ != null) {
        roofBuilder_.clear();
      }
      if (balconyBuilder_ != null) {
        balconyBuilder_.clear();
      }
      windowTypeCase_ = 0;
      windowType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gen.grpc.WindowOuterClass.internal_static_gen_grpc_Window_descriptor;
    }

    @java.lang.Override
    public gen.grpc.Window getDefaultInstanceForType() {
      return gen.grpc.Window.getDefaultInstance();
    }

    @java.lang.Override
    public gen.grpc.Window build() {
      gen.grpc.Window result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gen.grpc.Window buildPartial() {
      gen.grpc.Window result = new gen.grpc.Window(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(gen.grpc.Window result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(gen.grpc.Window result) {
      result.windowTypeCase_ = windowTypeCase_;
      result.windowType_ = this.windowType_;
      if (windowTypeCase_ == 1 &&
          standardBuilder_ != null) {
        result.windowType_ = standardBuilder_.build();
      }
      if (windowTypeCase_ == 2 &&
          roofBuilder_ != null) {
        result.windowType_ = roofBuilder_.build();
      }
      if (windowTypeCase_ == 3 &&
          balconyBuilder_ != null) {
        result.windowType_ = balconyBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gen.grpc.Window) {
        return mergeFrom((gen.grpc.Window)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gen.grpc.Window other) {
      if (other == gen.grpc.Window.getDefaultInstance()) return this;
      switch (other.getWindowTypeCase()) {
        case STANDARD: {
          mergeStandard(other.getStandard());
          break;
        }
        case ROOF: {
          mergeRoof(other.getRoof());
          break;
        }
        case BALCONY: {
          mergeBalcony(other.getBalcony());
          break;
        }
        case WINDOWTYPE_NOT_SET: {
          break;
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
              input.readMessage(
                  getStandardFieldBuilder().getBuilder(),
                  extensionRegistry);
              windowTypeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRoofFieldBuilder().getBuilder(),
                  extensionRegistry);
              windowTypeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getBalconyFieldBuilder().getBuilder(),
                  extensionRegistry);
              windowTypeCase_ = 3;
              break;
            } // case 26
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
    private int windowTypeCase_ = 0;
    private java.lang.Object windowType_;
    public WindowTypeCase
        getWindowTypeCase() {
      return WindowTypeCase.forNumber(
          windowTypeCase_);
    }

    public Builder clearWindowType() {
      windowTypeCase_ = 0;
      windowType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.StandardWindow, gen.grpc.StandardWindow.Builder, gen.grpc.StandardWindowOrBuilder> standardBuilder_;
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     * @return Whether the standard field is set.
     */
    @java.lang.Override
    public boolean hasStandard() {
      return windowTypeCase_ == 1;
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     * @return The standard.
     */
    @java.lang.Override
    public gen.grpc.StandardWindow getStandard() {
      if (standardBuilder_ == null) {
        if (windowTypeCase_ == 1) {
          return (gen.grpc.StandardWindow) windowType_;
        }
        return gen.grpc.StandardWindow.getDefaultInstance();
      } else {
        if (windowTypeCase_ == 1) {
          return standardBuilder_.getMessage();
        }
        return gen.grpc.StandardWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    public Builder setStandard(gen.grpc.StandardWindow value) {
      if (standardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowType_ = value;
        onChanged();
      } else {
        standardBuilder_.setMessage(value);
      }
      windowTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    public Builder setStandard(
        gen.grpc.StandardWindow.Builder builderForValue) {
      if (standardBuilder_ == null) {
        windowType_ = builderForValue.build();
        onChanged();
      } else {
        standardBuilder_.setMessage(builderForValue.build());
      }
      windowTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    public Builder mergeStandard(gen.grpc.StandardWindow value) {
      if (standardBuilder_ == null) {
        if (windowTypeCase_ == 1 &&
            windowType_ != gen.grpc.StandardWindow.getDefaultInstance()) {
          windowType_ = gen.grpc.StandardWindow.newBuilder((gen.grpc.StandardWindow) windowType_)
              .mergeFrom(value).buildPartial();
        } else {
          windowType_ = value;
        }
        onChanged();
      } else {
        if (windowTypeCase_ == 1) {
          standardBuilder_.mergeFrom(value);
        } else {
          standardBuilder_.setMessage(value);
        }
      }
      windowTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    public Builder clearStandard() {
      if (standardBuilder_ == null) {
        if (windowTypeCase_ == 1) {
          windowTypeCase_ = 0;
          windowType_ = null;
          onChanged();
        }
      } else {
        if (windowTypeCase_ == 1) {
          windowTypeCase_ = 0;
          windowType_ = null;
        }
        standardBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    public gen.grpc.StandardWindow.Builder getStandardBuilder() {
      return getStandardFieldBuilder().getBuilder();
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    @java.lang.Override
    public gen.grpc.StandardWindowOrBuilder getStandardOrBuilder() {
      if ((windowTypeCase_ == 1) && (standardBuilder_ != null)) {
        return standardBuilder_.getMessageOrBuilder();
      } else {
        if (windowTypeCase_ == 1) {
          return (gen.grpc.StandardWindow) windowType_;
        }
        return gen.grpc.StandardWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.StandardWindow standard = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.StandardWindow, gen.grpc.StandardWindow.Builder, gen.grpc.StandardWindowOrBuilder> 
        getStandardFieldBuilder() {
      if (standardBuilder_ == null) {
        if (!(windowTypeCase_ == 1)) {
          windowType_ = gen.grpc.StandardWindow.getDefaultInstance();
        }
        standardBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            gen.grpc.StandardWindow, gen.grpc.StandardWindow.Builder, gen.grpc.StandardWindowOrBuilder>(
                (gen.grpc.StandardWindow) windowType_,
                getParentForChildren(),
                isClean());
        windowType_ = null;
      }
      windowTypeCase_ = 1;
      onChanged();
      return standardBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.RoofWindow, gen.grpc.RoofWindow.Builder, gen.grpc.RoofWindowOrBuilder> roofBuilder_;
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     * @return Whether the roof field is set.
     */
    @java.lang.Override
    public boolean hasRoof() {
      return windowTypeCase_ == 2;
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     * @return The roof.
     */
    @java.lang.Override
    public gen.grpc.RoofWindow getRoof() {
      if (roofBuilder_ == null) {
        if (windowTypeCase_ == 2) {
          return (gen.grpc.RoofWindow) windowType_;
        }
        return gen.grpc.RoofWindow.getDefaultInstance();
      } else {
        if (windowTypeCase_ == 2) {
          return roofBuilder_.getMessage();
        }
        return gen.grpc.RoofWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    public Builder setRoof(gen.grpc.RoofWindow value) {
      if (roofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowType_ = value;
        onChanged();
      } else {
        roofBuilder_.setMessage(value);
      }
      windowTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    public Builder setRoof(
        gen.grpc.RoofWindow.Builder builderForValue) {
      if (roofBuilder_ == null) {
        windowType_ = builderForValue.build();
        onChanged();
      } else {
        roofBuilder_.setMessage(builderForValue.build());
      }
      windowTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    public Builder mergeRoof(gen.grpc.RoofWindow value) {
      if (roofBuilder_ == null) {
        if (windowTypeCase_ == 2 &&
            windowType_ != gen.grpc.RoofWindow.getDefaultInstance()) {
          windowType_ = gen.grpc.RoofWindow.newBuilder((gen.grpc.RoofWindow) windowType_)
              .mergeFrom(value).buildPartial();
        } else {
          windowType_ = value;
        }
        onChanged();
      } else {
        if (windowTypeCase_ == 2) {
          roofBuilder_.mergeFrom(value);
        } else {
          roofBuilder_.setMessage(value);
        }
      }
      windowTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    public Builder clearRoof() {
      if (roofBuilder_ == null) {
        if (windowTypeCase_ == 2) {
          windowTypeCase_ = 0;
          windowType_ = null;
          onChanged();
        }
      } else {
        if (windowTypeCase_ == 2) {
          windowTypeCase_ = 0;
          windowType_ = null;
        }
        roofBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    public gen.grpc.RoofWindow.Builder getRoofBuilder() {
      return getRoofFieldBuilder().getBuilder();
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    @java.lang.Override
    public gen.grpc.RoofWindowOrBuilder getRoofOrBuilder() {
      if ((windowTypeCase_ == 2) && (roofBuilder_ != null)) {
        return roofBuilder_.getMessageOrBuilder();
      } else {
        if (windowTypeCase_ == 2) {
          return (gen.grpc.RoofWindow) windowType_;
        }
        return gen.grpc.RoofWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.RoofWindow roof = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.RoofWindow, gen.grpc.RoofWindow.Builder, gen.grpc.RoofWindowOrBuilder> 
        getRoofFieldBuilder() {
      if (roofBuilder_ == null) {
        if (!(windowTypeCase_ == 2)) {
          windowType_ = gen.grpc.RoofWindow.getDefaultInstance();
        }
        roofBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            gen.grpc.RoofWindow, gen.grpc.RoofWindow.Builder, gen.grpc.RoofWindowOrBuilder>(
                (gen.grpc.RoofWindow) windowType_,
                getParentForChildren(),
                isClean());
        windowType_ = null;
      }
      windowTypeCase_ = 2;
      onChanged();
      return roofBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.BalconyWindow, gen.grpc.BalconyWindow.Builder, gen.grpc.BalconyWindowOrBuilder> balconyBuilder_;
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     * @return Whether the balcony field is set.
     */
    @java.lang.Override
    public boolean hasBalcony() {
      return windowTypeCase_ == 3;
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     * @return The balcony.
     */
    @java.lang.Override
    public gen.grpc.BalconyWindow getBalcony() {
      if (balconyBuilder_ == null) {
        if (windowTypeCase_ == 3) {
          return (gen.grpc.BalconyWindow) windowType_;
        }
        return gen.grpc.BalconyWindow.getDefaultInstance();
      } else {
        if (windowTypeCase_ == 3) {
          return balconyBuilder_.getMessage();
        }
        return gen.grpc.BalconyWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    public Builder setBalcony(gen.grpc.BalconyWindow value) {
      if (balconyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowType_ = value;
        onChanged();
      } else {
        balconyBuilder_.setMessage(value);
      }
      windowTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    public Builder setBalcony(
        gen.grpc.BalconyWindow.Builder builderForValue) {
      if (balconyBuilder_ == null) {
        windowType_ = builderForValue.build();
        onChanged();
      } else {
        balconyBuilder_.setMessage(builderForValue.build());
      }
      windowTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    public Builder mergeBalcony(gen.grpc.BalconyWindow value) {
      if (balconyBuilder_ == null) {
        if (windowTypeCase_ == 3 &&
            windowType_ != gen.grpc.BalconyWindow.getDefaultInstance()) {
          windowType_ = gen.grpc.BalconyWindow.newBuilder((gen.grpc.BalconyWindow) windowType_)
              .mergeFrom(value).buildPartial();
        } else {
          windowType_ = value;
        }
        onChanged();
      } else {
        if (windowTypeCase_ == 3) {
          balconyBuilder_.mergeFrom(value);
        } else {
          balconyBuilder_.setMessage(value);
        }
      }
      windowTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    public Builder clearBalcony() {
      if (balconyBuilder_ == null) {
        if (windowTypeCase_ == 3) {
          windowTypeCase_ = 0;
          windowType_ = null;
          onChanged();
        }
      } else {
        if (windowTypeCase_ == 3) {
          windowTypeCase_ = 0;
          windowType_ = null;
        }
        balconyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    public gen.grpc.BalconyWindow.Builder getBalconyBuilder() {
      return getBalconyFieldBuilder().getBuilder();
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    @java.lang.Override
    public gen.grpc.BalconyWindowOrBuilder getBalconyOrBuilder() {
      if ((windowTypeCase_ == 3) && (balconyBuilder_ != null)) {
        return balconyBuilder_.getMessageOrBuilder();
      } else {
        if (windowTypeCase_ == 3) {
          return (gen.grpc.BalconyWindow) windowType_;
        }
        return gen.grpc.BalconyWindow.getDefaultInstance();
      }
    }
    /**
     * <code>.gen.grpc.BalconyWindow balcony = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        gen.grpc.BalconyWindow, gen.grpc.BalconyWindow.Builder, gen.grpc.BalconyWindowOrBuilder> 
        getBalconyFieldBuilder() {
      if (balconyBuilder_ == null) {
        if (!(windowTypeCase_ == 3)) {
          windowType_ = gen.grpc.BalconyWindow.getDefaultInstance();
        }
        balconyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            gen.grpc.BalconyWindow, gen.grpc.BalconyWindow.Builder, gen.grpc.BalconyWindowOrBuilder>(
                (gen.grpc.BalconyWindow) windowType_,
                getParentForChildren(),
                isClean());
        windowType_ = null;
      }
      windowTypeCase_ = 3;
      onChanged();
      return balconyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:gen.grpc.Window)
  }

  // @@protoc_insertion_point(class_scope:gen.grpc.Window)
  private static final gen.grpc.Window DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gen.grpc.Window();
  }

  public static gen.grpc.Window getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Window>
      PARSER = new com.google.protobuf.AbstractParser<Window>() {
    @java.lang.Override
    public Window parsePartialFrom(
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

  public static com.google.protobuf.Parser<Window> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Window> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gen.grpc.Window getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
