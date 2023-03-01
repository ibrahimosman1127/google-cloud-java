/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/alloydb/v1/resources.proto

package com.google.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * SSL configuration for an AlloyDB Cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1.SslConfig}
 */
public final class SslConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1.SslConfig)
    SslConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SslConfig.newBuilder() to construct.
  private SslConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SslConfig() {
    sslMode_ = 0;
    caSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SslConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_SslConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_SslConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1.SslConfig.class,
            com.google.cloud.alloydb.v1.SslConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * SSL mode options.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.alloydb.v1.SslConfig.SslMode}
   */
  public enum SslMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * SSL mode not specified. Defaults to SSL_MODE_ALLOW.
     * </pre>
     *
     * <code>SSL_MODE_UNSPECIFIED = 0;</code>
     */
    SSL_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * SSL connections are optional. CA verification not enforced.
     * </pre>
     *
     * <code>SSL_MODE_ALLOW = 1;</code>
     */
    SSL_MODE_ALLOW(1),
    /**
     *
     *
     * <pre>
     * SSL connections are required. CA verification not enforced.
     * Clients may use locally self-signed certificates (default psql client
     * behavior).
     * </pre>
     *
     * <code>SSL_MODE_REQUIRE = 2;</code>
     */
    SSL_MODE_REQUIRE(2),
    /**
     *
     *
     * <pre>
     * SSL connections are required. CA verification enforced.
     * Clients must have certificates signed by a Cluster CA, e.g. via
     * GenerateClientCertificate.
     * </pre>
     *
     * <code>SSL_MODE_VERIFY_CA = 3;</code>
     */
    SSL_MODE_VERIFY_CA(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * SSL mode not specified. Defaults to SSL_MODE_ALLOW.
     * </pre>
     *
     * <code>SSL_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int SSL_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * SSL connections are optional. CA verification not enforced.
     * </pre>
     *
     * <code>SSL_MODE_ALLOW = 1;</code>
     */
    public static final int SSL_MODE_ALLOW_VALUE = 1;
    /**
     *
     *
     * <pre>
     * SSL connections are required. CA verification not enforced.
     * Clients may use locally self-signed certificates (default psql client
     * behavior).
     * </pre>
     *
     * <code>SSL_MODE_REQUIRE = 2;</code>
     */
    public static final int SSL_MODE_REQUIRE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * SSL connections are required. CA verification enforced.
     * Clients must have certificates signed by a Cluster CA, e.g. via
     * GenerateClientCertificate.
     * </pre>
     *
     * <code>SSL_MODE_VERIFY_CA = 3;</code>
     */
    public static final int SSL_MODE_VERIFY_CA_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SslMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SslMode forNumber(int value) {
      switch (value) {
        case 0:
          return SSL_MODE_UNSPECIFIED;
        case 1:
          return SSL_MODE_ALLOW;
        case 2:
          return SSL_MODE_REQUIRE;
        case 3:
          return SSL_MODE_VERIFY_CA;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SslMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SslMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SslMode>() {
          public SslMode findValueByNumber(int number) {
            return SslMode.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.alloydb.v1.SslConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final SslMode[] VALUES = values();

    public static SslMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SslMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.v1.SslConfig.SslMode)
  }

  /**
   *
   *
   * <pre>
   * Certificate Authority (CA) source for SSL/TLS certificates.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.alloydb.v1.SslConfig.CaSource}
   */
  public enum CaSource implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Certificate Authority (CA) source not specified. Defaults to
     * CA_SOURCE_MANAGED.
     * </pre>
     *
     * <code>CA_SOURCE_UNSPECIFIED = 0;</code>
     */
    CA_SOURCE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Certificate Authority (CA) managed by the AlloyDB Cluster.
     * </pre>
     *
     * <code>CA_SOURCE_MANAGED = 1;</code>
     */
    CA_SOURCE_MANAGED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Certificate Authority (CA) source not specified. Defaults to
     * CA_SOURCE_MANAGED.
     * </pre>
     *
     * <code>CA_SOURCE_UNSPECIFIED = 0;</code>
     */
    public static final int CA_SOURCE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Certificate Authority (CA) managed by the AlloyDB Cluster.
     * </pre>
     *
     * <code>CA_SOURCE_MANAGED = 1;</code>
     */
    public static final int CA_SOURCE_MANAGED_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CaSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CaSource forNumber(int value) {
      switch (value) {
        case 0:
          return CA_SOURCE_UNSPECIFIED;
        case 1:
          return CA_SOURCE_MANAGED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CaSource> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CaSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CaSource>() {
          public CaSource findValueByNumber(int number) {
            return CaSource.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.alloydb.v1.SslConfig.getDescriptor().getEnumTypes().get(1);
    }

    private static final CaSource[] VALUES = values();

    public static CaSource valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CaSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.v1.SslConfig.CaSource)
  }

  public static final int SSL_MODE_FIELD_NUMBER = 1;
  private int sslMode_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for sslMode.
   */
  @java.lang.Override
  public int getSslModeValue() {
    return sslMode_;
  }
  /**
   *
   *
   * <pre>
   * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sslMode.
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1.SslConfig.SslMode getSslMode() {
    com.google.cloud.alloydb.v1.SslConfig.SslMode result =
        com.google.cloud.alloydb.v1.SslConfig.SslMode.forNumber(sslMode_);
    return result == null ? com.google.cloud.alloydb.v1.SslConfig.SslMode.UNRECOGNIZED : result;
  }

  public static final int CA_SOURCE_FIELD_NUMBER = 2;
  private int caSource_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
   * supported currently, and is the default value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for caSource.
   */
  @java.lang.Override
  public int getCaSourceValue() {
    return caSource_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
   * supported currently, and is the default value.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The caSource.
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1.SslConfig.CaSource getCaSource() {
    com.google.cloud.alloydb.v1.SslConfig.CaSource result =
        com.google.cloud.alloydb.v1.SslConfig.CaSource.forNumber(caSource_);
    return result == null ? com.google.cloud.alloydb.v1.SslConfig.CaSource.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (sslMode_
        != com.google.cloud.alloydb.v1.SslConfig.SslMode.SSL_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, sslMode_);
    }
    if (caSource_
        != com.google.cloud.alloydb.v1.SslConfig.CaSource.CA_SOURCE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, caSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sslMode_
        != com.google.cloud.alloydb.v1.SslConfig.SslMode.SSL_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, sslMode_);
    }
    if (caSource_
        != com.google.cloud.alloydb.v1.SslConfig.CaSource.CA_SOURCE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, caSource_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1.SslConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1.SslConfig other = (com.google.cloud.alloydb.v1.SslConfig) obj;

    if (sslMode_ != other.sslMode_) return false;
    if (caSource_ != other.caSource_) return false;
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
    hash = (37 * hash) + SSL_MODE_FIELD_NUMBER;
    hash = (53 * hash) + sslMode_;
    hash = (37 * hash) + CA_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + caSource_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.SslConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.alloydb.v1.SslConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * SSL configuration for an AlloyDB Cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1.SslConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1.SslConfig)
      com.google.cloud.alloydb.v1.SslConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_SslConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_SslConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1.SslConfig.class,
              com.google.cloud.alloydb.v1.SslConfig.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1.SslConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sslMode_ = 0;
      caSource_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_SslConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.SslConfig getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1.SslConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.SslConfig build() {
      com.google.cloud.alloydb.v1.SslConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.SslConfig buildPartial() {
      com.google.cloud.alloydb.v1.SslConfig result =
          new com.google.cloud.alloydb.v1.SslConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1.SslConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sslMode_ = sslMode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.caSource_ = caSource_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.alloydb.v1.SslConfig) {
        return mergeFrom((com.google.cloud.alloydb.v1.SslConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1.SslConfig other) {
      if (other == com.google.cloud.alloydb.v1.SslConfig.getDefaultInstance()) return this;
      if (other.sslMode_ != 0) {
        setSslModeValue(other.getSslModeValue());
      }
      if (other.caSource_ != 0) {
        setCaSourceValue(other.getCaSourceValue());
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
            case 8:
              {
                sslMode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                caSource_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
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

    private int sslMode_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for sslMode.
     */
    @java.lang.Override
    public int getSslModeValue() {
      return sslMode_;
    }
    /**
     *
     *
     * <pre>
     * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for sslMode to set.
     * @return This builder for chaining.
     */
    public Builder setSslModeValue(int value) {
      sslMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sslMode.
     */
    @java.lang.Override
    public com.google.cloud.alloydb.v1.SslConfig.SslMode getSslMode() {
      com.google.cloud.alloydb.v1.SslConfig.SslMode result =
          com.google.cloud.alloydb.v1.SslConfig.SslMode.forNumber(sslMode_);
      return result == null ? com.google.cloud.alloydb.v1.SslConfig.SslMode.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The sslMode to set.
     * @return This builder for chaining.
     */
    public Builder setSslMode(com.google.cloud.alloydb.v1.SslConfig.SslMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      sslMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. SSL mode. Specifies client-server SSL/TLS connection behavior.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.SslMode ssl_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSslMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sslMode_ = 0;
      onChanged();
      return this;
    }

    private int caSource_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
     * supported currently, and is the default value.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for caSource.
     */
    @java.lang.Override
    public int getCaSourceValue() {
      return caSource_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
     * supported currently, and is the default value.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for caSource to set.
     * @return This builder for chaining.
     */
    public Builder setCaSourceValue(int value) {
      caSource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
     * supported currently, and is the default value.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The caSource.
     */
    @java.lang.Override
    public com.google.cloud.alloydb.v1.SslConfig.CaSource getCaSource() {
      com.google.cloud.alloydb.v1.SslConfig.CaSource result =
          com.google.cloud.alloydb.v1.SslConfig.CaSource.forNumber(caSource_);
      return result == null ? com.google.cloud.alloydb.v1.SslConfig.CaSource.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
     * supported currently, and is the default value.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The caSource to set.
     * @return This builder for chaining.
     */
    public Builder setCaSource(com.google.cloud.alloydb.v1.SslConfig.CaSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      caSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Certificate Authority (CA) source. Only CA_SOURCE_MANAGED is
     * supported currently, and is the default value.
     * </pre>
     *
     * <code>
     * .google.cloud.alloydb.v1.SslConfig.CaSource ca_source = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCaSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      caSource_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1.SslConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1.SslConfig)
  private static final com.google.cloud.alloydb.v1.SslConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1.SslConfig();
  }

  public static com.google.cloud.alloydb.v1.SslConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SslConfig> PARSER =
      new com.google.protobuf.AbstractParser<SslConfig>() {
        @java.lang.Override
        public SslConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SslConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SslConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1.SslConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
