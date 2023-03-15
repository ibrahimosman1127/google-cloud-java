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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification that applies to
 * entries that are part `SQL_DATABASE` system
 * (user_specified_type)
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.SqlDatabaseSystemSpec}
 */
public final class SqlDatabaseSystemSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)
    SqlDatabaseSystemSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SqlDatabaseSystemSpec.newBuilder() to construct.
  private SqlDatabaseSystemSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SqlDatabaseSystemSpec() {
    sqlEngine_ = "";
    databaseVersion_ = "";
    instanceHost_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SqlDatabaseSystemSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_SqlDatabaseSystemSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_SqlDatabaseSystemSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.class,
            com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.Builder.class);
  }

  public static final int SQL_ENGINE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sqlEngine_ = "";
  /**
   *
   *
   * <pre>
   * SQL Database Engine.
   * enum SqlEngine {
   *  UNDEFINED = 0;
   *  MY_SQL = 1;
   *  POSTGRE_SQL = 2;
   *  SQL_SERVER = 3;
   * }
   * Engine of the enclosing database instance.
   * </pre>
   *
   * <code>string sql_engine = 1;</code>
   *
   * @return The sqlEngine.
   */
  @java.lang.Override
  public java.lang.String getSqlEngine() {
    java.lang.Object ref = sqlEngine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sqlEngine_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * SQL Database Engine.
   * enum SqlEngine {
   *  UNDEFINED = 0;
   *  MY_SQL = 1;
   *  POSTGRE_SQL = 2;
   *  SQL_SERVER = 3;
   * }
   * Engine of the enclosing database instance.
   * </pre>
   *
   * <code>string sql_engine = 1;</code>
   *
   * @return The bytes for sqlEngine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSqlEngineBytes() {
    java.lang.Object ref = sqlEngine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sqlEngine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATABASE_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object databaseVersion_ = "";
  /**
   *
   *
   * <pre>
   * Version of the database engine.
   * </pre>
   *
   * <code>string database_version = 2;</code>
   *
   * @return The databaseVersion.
   */
  @java.lang.Override
  public java.lang.String getDatabaseVersion() {
    java.lang.Object ref = databaseVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Version of the database engine.
   * </pre>
   *
   * <code>string database_version = 2;</code>
   *
   * @return The bytes for databaseVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseVersionBytes() {
    java.lang.Object ref = databaseVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      databaseVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_HOST_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceHost_ = "";
  /**
   *
   *
   * <pre>
   * Host of the SQL database
   * enum InstanceHost {
   *  UNDEFINED = 0;
   *  SELF_HOSTED = 1;
   *  CLOUD_SQL = 2;
   *  AMAZON_RDS = 3;
   *  AZURE_SQL = 4;
   * }
   * Host of the enclousing database instance.
   * </pre>
   *
   * <code>string instance_host = 3;</code>
   *
   * @return The instanceHost.
   */
  @java.lang.Override
  public java.lang.String getInstanceHost() {
    java.lang.Object ref = instanceHost_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceHost_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Host of the SQL database
   * enum InstanceHost {
   *  UNDEFINED = 0;
   *  SELF_HOSTED = 1;
   *  CLOUD_SQL = 2;
   *  AMAZON_RDS = 3;
   *  AZURE_SQL = 4;
   * }
   * Host of the enclousing database instance.
   * </pre>
   *
   * <code>string instance_host = 3;</code>
   *
   * @return The bytes for instanceHost.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceHostBytes() {
    java.lang.Object ref = instanceHost_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceHost_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sqlEngine_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sqlEngine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, databaseVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceHost_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, instanceHost_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sqlEngine_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sqlEngine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, databaseVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceHost_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, instanceHost_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec other =
        (com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec) obj;

    if (!getSqlEngine().equals(other.getSqlEngine())) return false;
    if (!getDatabaseVersion().equals(other.getDatabaseVersion())) return false;
    if (!getInstanceHost().equals(other.getInstanceHost())) return false;
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
    hash = (37 * hash) + SQL_ENGINE_FIELD_NUMBER;
    hash = (53 * hash) + getSqlEngine().hashCode();
    hash = (37 * hash) + DATABASE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseVersion().hashCode();
    hash = (37 * hash) + INSTANCE_HOST_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceHost().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec prototype) {
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
   * Specification that applies to
   * entries that are part `SQL_DATABASE` system
   * (user_specified_type)
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.SqlDatabaseSystemSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)
      com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_SqlDatabaseSystemSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_SqlDatabaseSystemSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.class,
              com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sqlEngine_ = "";
      databaseVersion_ = "";
      instanceHost_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_SqlDatabaseSystemSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec build() {
      com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec buildPartial() {
      com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec result =
          new com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sqlEngine_ = sqlEngine_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.databaseVersion_ = databaseVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.instanceHost_ = instanceHost_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec other) {
      if (other == com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec.getDefaultInstance())
        return this;
      if (!other.getSqlEngine().isEmpty()) {
        sqlEngine_ = other.sqlEngine_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDatabaseVersion().isEmpty()) {
        databaseVersion_ = other.databaseVersion_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getInstanceHost().isEmpty()) {
        instanceHost_ = other.instanceHost_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                sqlEngine_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                databaseVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                instanceHost_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object sqlEngine_ = "";
    /**
     *
     *
     * <pre>
     * SQL Database Engine.
     * enum SqlEngine {
     *  UNDEFINED = 0;
     *  MY_SQL = 1;
     *  POSTGRE_SQL = 2;
     *  SQL_SERVER = 3;
     * }
     * Engine of the enclosing database instance.
     * </pre>
     *
     * <code>string sql_engine = 1;</code>
     *
     * @return The sqlEngine.
     */
    public java.lang.String getSqlEngine() {
      java.lang.Object ref = sqlEngine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sqlEngine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * SQL Database Engine.
     * enum SqlEngine {
     *  UNDEFINED = 0;
     *  MY_SQL = 1;
     *  POSTGRE_SQL = 2;
     *  SQL_SERVER = 3;
     * }
     * Engine of the enclosing database instance.
     * </pre>
     *
     * <code>string sql_engine = 1;</code>
     *
     * @return The bytes for sqlEngine.
     */
    public com.google.protobuf.ByteString getSqlEngineBytes() {
      java.lang.Object ref = sqlEngine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sqlEngine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * SQL Database Engine.
     * enum SqlEngine {
     *  UNDEFINED = 0;
     *  MY_SQL = 1;
     *  POSTGRE_SQL = 2;
     *  SQL_SERVER = 3;
     * }
     * Engine of the enclosing database instance.
     * </pre>
     *
     * <code>string sql_engine = 1;</code>
     *
     * @param value The sqlEngine to set.
     * @return This builder for chaining.
     */
    public Builder setSqlEngine(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sqlEngine_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * SQL Database Engine.
     * enum SqlEngine {
     *  UNDEFINED = 0;
     *  MY_SQL = 1;
     *  POSTGRE_SQL = 2;
     *  SQL_SERVER = 3;
     * }
     * Engine of the enclosing database instance.
     * </pre>
     *
     * <code>string sql_engine = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSqlEngine() {
      sqlEngine_ = getDefaultInstance().getSqlEngine();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * SQL Database Engine.
     * enum SqlEngine {
     *  UNDEFINED = 0;
     *  MY_SQL = 1;
     *  POSTGRE_SQL = 2;
     *  SQL_SERVER = 3;
     * }
     * Engine of the enclosing database instance.
     * </pre>
     *
     * <code>string sql_engine = 1;</code>
     *
     * @param value The bytes for sqlEngine to set.
     * @return This builder for chaining.
     */
    public Builder setSqlEngineBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sqlEngine_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object databaseVersion_ = "";
    /**
     *
     *
     * <pre>
     * Version of the database engine.
     * </pre>
     *
     * <code>string database_version = 2;</code>
     *
     * @return The databaseVersion.
     */
    public java.lang.String getDatabaseVersion() {
      java.lang.Object ref = databaseVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the database engine.
     * </pre>
     *
     * <code>string database_version = 2;</code>
     *
     * @return The bytes for databaseVersion.
     */
    public com.google.protobuf.ByteString getDatabaseVersionBytes() {
      java.lang.Object ref = databaseVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        databaseVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the database engine.
     * </pre>
     *
     * <code>string database_version = 2;</code>
     *
     * @param value The databaseVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      databaseVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the database engine.
     * </pre>
     *
     * <code>string database_version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabaseVersion() {
      databaseVersion_ = getDefaultInstance().getDatabaseVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the database engine.
     * </pre>
     *
     * <code>string database_version = 2;</code>
     *
     * @param value The bytes for databaseVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      databaseVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object instanceHost_ = "";
    /**
     *
     *
     * <pre>
     * Host of the SQL database
     * enum InstanceHost {
     *  UNDEFINED = 0;
     *  SELF_HOSTED = 1;
     *  CLOUD_SQL = 2;
     *  AMAZON_RDS = 3;
     *  AZURE_SQL = 4;
     * }
     * Host of the enclousing database instance.
     * </pre>
     *
     * <code>string instance_host = 3;</code>
     *
     * @return The instanceHost.
     */
    public java.lang.String getInstanceHost() {
      java.lang.Object ref = instanceHost_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceHost_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Host of the SQL database
     * enum InstanceHost {
     *  UNDEFINED = 0;
     *  SELF_HOSTED = 1;
     *  CLOUD_SQL = 2;
     *  AMAZON_RDS = 3;
     *  AZURE_SQL = 4;
     * }
     * Host of the enclousing database instance.
     * </pre>
     *
     * <code>string instance_host = 3;</code>
     *
     * @return The bytes for instanceHost.
     */
    public com.google.protobuf.ByteString getInstanceHostBytes() {
      java.lang.Object ref = instanceHost_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceHost_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Host of the SQL database
     * enum InstanceHost {
     *  UNDEFINED = 0;
     *  SELF_HOSTED = 1;
     *  CLOUD_SQL = 2;
     *  AMAZON_RDS = 3;
     *  AZURE_SQL = 4;
     * }
     * Host of the enclousing database instance.
     * </pre>
     *
     * <code>string instance_host = 3;</code>
     *
     * @param value The instanceHost to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceHost(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceHost_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Host of the SQL database
     * enum InstanceHost {
     *  UNDEFINED = 0;
     *  SELF_HOSTED = 1;
     *  CLOUD_SQL = 2;
     *  AMAZON_RDS = 3;
     *  AZURE_SQL = 4;
     * }
     * Host of the enclousing database instance.
     * </pre>
     *
     * <code>string instance_host = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceHost() {
      instanceHost_ = getDefaultInstance().getInstanceHost();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Host of the SQL database
     * enum InstanceHost {
     *  UNDEFINED = 0;
     *  SELF_HOSTED = 1;
     *  CLOUD_SQL = 2;
     *  AMAZON_RDS = 3;
     *  AZURE_SQL = 4;
     * }
     * Host of the enclousing database instance.
     * </pre>
     *
     * <code>string instance_host = 3;</code>
     *
     * @param value The bytes for instanceHost to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceHostBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceHost_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)
  private static final com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec();
  }

  public static com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlDatabaseSystemSpec> PARSER =
      new com.google.protobuf.AbstractParser<SqlDatabaseSystemSpec>() {
        @java.lang.Override
        public SqlDatabaseSystemSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlDatabaseSystemSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlDatabaseSystemSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SqlDatabaseSystemSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
