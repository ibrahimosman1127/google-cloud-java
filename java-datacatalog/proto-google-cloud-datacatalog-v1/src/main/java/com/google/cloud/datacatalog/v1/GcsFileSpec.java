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
// source: google/cloud/datacatalog/v1/gcs_fileset_spec.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification of a single file in Cloud Storage.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.GcsFileSpec}
 */
public final class GcsFileSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.GcsFileSpec)
    GcsFileSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcsFileSpec.newBuilder() to construct.
  private GcsFileSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsFileSpec() {
    filePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcsFileSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.GcsFilesetSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1_GcsFileSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.GcsFilesetSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1_GcsFileSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.GcsFileSpec.class,
            com.google.cloud.datacatalog.v1.GcsFileSpec.Builder.class);
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filePath_ = "";
  /**
   *
   *
   * <pre>
   * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filePath.
   */
  @java.lang.Override
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_TIMESTAMPS_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.SystemTimestamps gcsTimestamps_;
  /**
   *
   *
   * <pre>
   * Output only. Creation, modification, and expiration timestamps of a Cloud
   * Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the gcsTimestamps field is set.
   */
  @java.lang.Override
  public boolean hasGcsTimestamps() {
    return gcsTimestamps_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Creation, modification, and expiration timestamps of a Cloud
   * Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The gcsTimestamps.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SystemTimestamps getGcsTimestamps() {
    return gcsTimestamps_ == null
        ? com.google.cloud.datacatalog.v1.SystemTimestamps.getDefaultInstance()
        : gcsTimestamps_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Creation, modification, and expiration timestamps of a Cloud
   * Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder getGcsTimestampsOrBuilder() {
    return gcsTimestamps_ == null
        ? com.google.cloud.datacatalog.v1.SystemTimestamps.getDefaultInstance()
        : gcsTimestamps_;
  }

  public static final int SIZE_BYTES_FIELD_NUMBER = 4;
  private long sizeBytes_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. File size in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  @java.lang.Override
  public long getSizeBytes() {
    return sizeBytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (gcsTimestamps_ != null) {
      output.writeMessage(2, getGcsTimestamps());
    }
    if (sizeBytes_ != 0L) {
      output.writeInt64(4, sizeBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (gcsTimestamps_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGcsTimestamps());
    }
    if (sizeBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, sizeBytes_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.GcsFileSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.GcsFileSpec other =
        (com.google.cloud.datacatalog.v1.GcsFileSpec) obj;

    if (!getFilePath().equals(other.getFilePath())) return false;
    if (hasGcsTimestamps() != other.hasGcsTimestamps()) return false;
    if (hasGcsTimestamps()) {
      if (!getGcsTimestamps().equals(other.getGcsTimestamps())) return false;
    }
    if (getSizeBytes() != other.getSizeBytes()) return false;
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    if (hasGcsTimestamps()) {
      hash = (37 * hash) + GCS_TIMESTAMPS_FIELD_NUMBER;
      hash = (53 * hash) + getGcsTimestamps().hashCode();
    }
    hash = (37 * hash) + SIZE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSizeBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.GcsFileSpec prototype) {
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
   * Specification of a single file in Cloud Storage.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.GcsFileSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.GcsFileSpec)
      com.google.cloud.datacatalog.v1.GcsFileSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_GcsFileSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_GcsFileSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.GcsFileSpec.class,
              com.google.cloud.datacatalog.v1.GcsFileSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.GcsFileSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filePath_ = "";
      gcsTimestamps_ = null;
      if (gcsTimestampsBuilder_ != null) {
        gcsTimestampsBuilder_.dispose();
        gcsTimestampsBuilder_ = null;
      }
      sizeBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1_GcsFileSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.GcsFileSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.GcsFileSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.GcsFileSpec build() {
      com.google.cloud.datacatalog.v1.GcsFileSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.GcsFileSpec buildPartial() {
      com.google.cloud.datacatalog.v1.GcsFileSpec result =
          new com.google.cloud.datacatalog.v1.GcsFileSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.GcsFileSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filePath_ = filePath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gcsTimestamps_ =
            gcsTimestampsBuilder_ == null ? gcsTimestamps_ : gcsTimestampsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sizeBytes_ = sizeBytes_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.GcsFileSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.GcsFileSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.GcsFileSpec other) {
      if (other == com.google.cloud.datacatalog.v1.GcsFileSpec.getDefaultInstance()) return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGcsTimestamps()) {
        mergeGcsTimestamps(other.getGcsTimestamps());
      }
      if (other.getSizeBytes() != 0L) {
        setSizeBytes(other.getSizeBytes());
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
                filePath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getGcsTimestampsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 32:
              {
                sizeBytes_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private java.lang.Object filePath_ = "";
    /**
     *
     *
     * <pre>
     * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The filePath.
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for filePath.
     */
    public com.google.protobuf.ByteString getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilePath() {
      filePath_ = getDefaultInstance().getFilePath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.SystemTimestamps gcsTimestamps_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SystemTimestamps,
            com.google.cloud.datacatalog.v1.SystemTimestamps.Builder,
            com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder>
        gcsTimestampsBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the gcsTimestamps field is set.
     */
    public boolean hasGcsTimestamps() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The gcsTimestamps.
     */
    public com.google.cloud.datacatalog.v1.SystemTimestamps getGcsTimestamps() {
      if (gcsTimestampsBuilder_ == null) {
        return gcsTimestamps_ == null
            ? com.google.cloud.datacatalog.v1.SystemTimestamps.getDefaultInstance()
            : gcsTimestamps_;
      } else {
        return gcsTimestampsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGcsTimestamps(com.google.cloud.datacatalog.v1.SystemTimestamps value) {
      if (gcsTimestampsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsTimestamps_ = value;
      } else {
        gcsTimestampsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGcsTimestamps(
        com.google.cloud.datacatalog.v1.SystemTimestamps.Builder builderForValue) {
      if (gcsTimestampsBuilder_ == null) {
        gcsTimestamps_ = builderForValue.build();
      } else {
        gcsTimestampsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeGcsTimestamps(com.google.cloud.datacatalog.v1.SystemTimestamps value) {
      if (gcsTimestampsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && gcsTimestamps_ != null
            && gcsTimestamps_
                != com.google.cloud.datacatalog.v1.SystemTimestamps.getDefaultInstance()) {
          getGcsTimestampsBuilder().mergeFrom(value);
        } else {
          gcsTimestamps_ = value;
        }
      } else {
        gcsTimestampsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearGcsTimestamps() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gcsTimestamps_ = null;
      if (gcsTimestampsBuilder_ != null) {
        gcsTimestampsBuilder_.dispose();
        gcsTimestampsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SystemTimestamps.Builder getGcsTimestampsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGcsTimestampsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder getGcsTimestampsOrBuilder() {
      if (gcsTimestampsBuilder_ != null) {
        return gcsTimestampsBuilder_.getMessageOrBuilder();
      } else {
        return gcsTimestamps_ == null
            ? com.google.cloud.datacatalog.v1.SystemTimestamps.getDefaultInstance()
            : gcsTimestamps_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Creation, modification, and expiration timestamps of a Cloud
     * Storage file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.SystemTimestamps,
            com.google.cloud.datacatalog.v1.SystemTimestamps.Builder,
            com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder>
        getGcsTimestampsFieldBuilder() {
      if (gcsTimestampsBuilder_ == null) {
        gcsTimestampsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.SystemTimestamps,
                com.google.cloud.datacatalog.v1.SystemTimestamps.Builder,
                com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder>(
                getGcsTimestamps(), getParentForChildren(), isClean());
        gcsTimestamps_ = null;
      }
      return gcsTimestampsBuilder_;
    }

    private long sizeBytes_;
    /**
     *
     *
     * <pre>
     * Output only. File size in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The sizeBytes.
     */
    @java.lang.Override
    public long getSizeBytes() {
      return sizeBytes_;
    }
    /**
     *
     *
     * <pre>
     * Output only. File size in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The sizeBytes to set.
     * @return This builder for chaining.
     */
    public Builder setSizeBytes(long value) {

      sizeBytes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. File size in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSizeBytes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sizeBytes_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.GcsFileSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.GcsFileSpec)
  private static final com.google.cloud.datacatalog.v1.GcsFileSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.GcsFileSpec();
  }

  public static com.google.cloud.datacatalog.v1.GcsFileSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsFileSpec> PARSER =
      new com.google.protobuf.AbstractParser<GcsFileSpec>() {
        @java.lang.Override
        public GcsFileSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsFileSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsFileSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.GcsFileSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
