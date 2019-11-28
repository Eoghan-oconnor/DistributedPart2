// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: password.proto

package ie.gmit.ds;

/**
 * Protobuf type {@code ie.gmit.ds.ValidateRequest}
 */
public  final class ValidateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ie.gmit.ds.ValidateRequest)
    ValidateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateRequest.newBuilder() to construct.
  private ValidateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateRequest() {
    password_ = "";
    hashedPassword_ = com.google.protobuf.ByteString.EMPTY;
    salt_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 18: {

            hashedPassword_ = input.readBytes();
            break;
          }
          case 26: {

            salt_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ie.gmit.ds.Password.internal_static_ie_gmit_ds_ValidateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ie.gmit.ds.Password.internal_static_ie_gmit_ds_ValidateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ie.gmit.ds.ValidateRequest.class, ie.gmit.ds.ValidateRequest.Builder.class);
  }

  public static final int PASSWORD_FIELD_NUMBER = 1;
  private volatile java.lang.Object password_;
  /**
   * <code>string password = 1;</code>
   */
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASHEDPASSWORD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString hashedPassword_;
  /**
   * <code>bytes hashedPassword = 2;</code>
   */
  public com.google.protobuf.ByteString getHashedPassword() {
    return hashedPassword_;
  }

  public static final int SALT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString salt_;
  /**
   * <code>bytes salt = 3;</code>
   */
  public com.google.protobuf.ByteString getSalt() {
    return salt_;
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
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, password_);
    }
    if (!hashedPassword_.isEmpty()) {
      output.writeBytes(2, hashedPassword_);
    }
    if (!salt_.isEmpty()) {
      output.writeBytes(3, salt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, password_);
    }
    if (!hashedPassword_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, hashedPassword_);
    }
    if (!salt_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, salt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ie.gmit.ds.ValidateRequest)) {
      return super.equals(obj);
    }
    ie.gmit.ds.ValidateRequest other = (ie.gmit.ds.ValidateRequest) obj;

    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getHashedPassword()
        .equals(other.getHashedPassword())) return false;
    if (!getSalt()
        .equals(other.getSalt())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + HASHEDPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getHashedPassword().hashCode();
    hash = (37 * hash) + SALT_FIELD_NUMBER;
    hash = (53 * hash) + getSalt().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ie.gmit.ds.ValidateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ie.gmit.ds.ValidateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ie.gmit.ds.ValidateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ie.gmit.ds.ValidateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ie.gmit.ds.ValidateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ie.gmit.ds.ValidateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ie.gmit.ds.ValidateRequest)
      ie.gmit.ds.ValidateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ie.gmit.ds.Password.internal_static_ie_gmit_ds_ValidateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ie.gmit.ds.Password.internal_static_ie_gmit_ds_ValidateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ie.gmit.ds.ValidateRequest.class, ie.gmit.ds.ValidateRequest.Builder.class);
    }

    // Construct using ie.gmit.ds.ValidateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      password_ = "";

      hashedPassword_ = com.google.protobuf.ByteString.EMPTY;

      salt_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ie.gmit.ds.Password.internal_static_ie_gmit_ds_ValidateRequest_descriptor;
    }

    @java.lang.Override
    public ie.gmit.ds.ValidateRequest getDefaultInstanceForType() {
      return ie.gmit.ds.ValidateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ie.gmit.ds.ValidateRequest build() {
      ie.gmit.ds.ValidateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ie.gmit.ds.ValidateRequest buildPartial() {
      ie.gmit.ds.ValidateRequest result = new ie.gmit.ds.ValidateRequest(this);
      result.password_ = password_;
      result.hashedPassword_ = hashedPassword_;
      result.salt_ = salt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ie.gmit.ds.ValidateRequest) {
        return mergeFrom((ie.gmit.ds.ValidateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ie.gmit.ds.ValidateRequest other) {
      if (other == ie.gmit.ds.ValidateRequest.getDefaultInstance()) return this;
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (other.getHashedPassword() != com.google.protobuf.ByteString.EMPTY) {
        setHashedPassword(other.getHashedPassword());
      }
      if (other.getSalt() != com.google.protobuf.ByteString.EMPTY) {
        setSalt(other.getSalt());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ie.gmit.ds.ValidateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ie.gmit.ds.ValidateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 1;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hashedPassword_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hashedPassword = 2;</code>
     */
    public com.google.protobuf.ByteString getHashedPassword() {
      return hashedPassword_;
    }
    /**
     * <code>bytes hashedPassword = 2;</code>
     */
    public Builder setHashedPassword(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hashedPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hashedPassword = 2;</code>
     */
    public Builder clearHashedPassword() {
      
      hashedPassword_ = getDefaultInstance().getHashedPassword();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString salt_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes salt = 3;</code>
     */
    public com.google.protobuf.ByteString getSalt() {
      return salt_;
    }
    /**
     * <code>bytes salt = 3;</code>
     */
    public Builder setSalt(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      salt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes salt = 3;</code>
     */
    public Builder clearSalt() {
      
      salt_ = getDefaultInstance().getSalt();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ie.gmit.ds.ValidateRequest)
  }

  // @@protoc_insertion_point(class_scope:ie.gmit.ds.ValidateRequest)
  private static final ie.gmit.ds.ValidateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ie.gmit.ds.ValidateRequest();
  }

  public static ie.gmit.ds.ValidateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateRequest>
      PARSER = new com.google.protobuf.AbstractParser<ValidateRequest>() {
    @java.lang.Override
    public ValidateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ie.gmit.ds.ValidateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

