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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * EphemeralStorageLocalSsdConfig contains configuration for the node ephemeral
 * storage using Local SSDs.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.EphemeralStorageLocalSsdConfig}
 */
public final class EphemeralStorageLocalSsdConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.EphemeralStorageLocalSsdConfig)
    EphemeralStorageLocalSsdConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EphemeralStorageLocalSsdConfig.newBuilder() to construct.
  private EphemeralStorageLocalSsdConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EphemeralStorageLocalSsdConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EphemeralStorageLocalSsdConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_EphemeralStorageLocalSsdConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_EphemeralStorageLocalSsdConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.class,
            com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.Builder.class);
  }

  public static final int LOCAL_SSD_COUNT_FIELD_NUMBER = 1;
  private int localSsdCount_;
  /**
   *
   *
   * <pre>
   * Number of local SSDs to use to back ephemeral storage. Uses NVMe
   * interfaces. Each local SSD is 375 GB in size.
   * If zero, it means to disable using local SSDs as ephemeral storage.
   * The limit for this value is dependent upon the maximum number of
   * disks available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   * </pre>
   *
   * <code>int32 local_ssd_count = 1;</code>
   *
   * @return The localSsdCount.
   */
  @java.lang.Override
  public int getLocalSsdCount() {
    return localSsdCount_;
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
    if (localSsdCount_ != 0) {
      output.writeInt32(1, localSsdCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localSsdCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, localSsdCount_);
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
    if (!(obj instanceof com.google.container.v1beta1.EphemeralStorageLocalSsdConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.EphemeralStorageLocalSsdConfig other =
        (com.google.container.v1beta1.EphemeralStorageLocalSsdConfig) obj;

    if (getLocalSsdCount() != other.getLocalSsdCount()) return false;
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
    hash = (37 * hash) + LOCAL_SSD_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getLocalSsdCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig parseFrom(
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
      com.google.container.v1beta1.EphemeralStorageLocalSsdConfig prototype) {
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
   * EphemeralStorageLocalSsdConfig contains configuration for the node ephemeral
   * storage using Local SSDs.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.EphemeralStorageLocalSsdConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.EphemeralStorageLocalSsdConfig)
      com.google.container.v1beta1.EphemeralStorageLocalSsdConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageLocalSsdConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageLocalSsdConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.class,
              com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      localSsdCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageLocalSsdConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageLocalSsdConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageLocalSsdConfig build() {
      com.google.container.v1beta1.EphemeralStorageLocalSsdConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageLocalSsdConfig buildPartial() {
      com.google.container.v1beta1.EphemeralStorageLocalSsdConfig result =
          new com.google.container.v1beta1.EphemeralStorageLocalSsdConfig(this);
      result.localSsdCount_ = localSsdCount_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.container.v1beta1.EphemeralStorageLocalSsdConfig) {
        return mergeFrom((com.google.container.v1beta1.EphemeralStorageLocalSsdConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.EphemeralStorageLocalSsdConfig other) {
      if (other == com.google.container.v1beta1.EphemeralStorageLocalSsdConfig.getDefaultInstance())
        return this;
      if (other.getLocalSsdCount() != 0) {
        setLocalSsdCount(other.getLocalSsdCount());
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
                localSsdCount_ = input.readInt32();

                break;
              } // case 8
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

    private int localSsdCount_;
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. Each local SSD is 375 GB in size.
     * If zero, it means to disable using local SSDs as ephemeral storage.
     * The limit for this value is dependent upon the maximum number of
     * disks available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @return The localSsdCount.
     */
    @java.lang.Override
    public int getLocalSsdCount() {
      return localSsdCount_;
    }
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. Each local SSD is 375 GB in size.
     * If zero, it means to disable using local SSDs as ephemeral storage.
     * The limit for this value is dependent upon the maximum number of
     * disks available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @param value The localSsdCount to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdCount(int value) {

      localSsdCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. Each local SSD is 375 GB in size.
     * If zero, it means to disable using local SSDs as ephemeral storage.
     * The limit for this value is dependent upon the maximum number of
     * disks available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalSsdCount() {

      localSsdCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.EphemeralStorageLocalSsdConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.EphemeralStorageLocalSsdConfig)
  private static final com.google.container.v1beta1.EphemeralStorageLocalSsdConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.EphemeralStorageLocalSsdConfig();
  }

  public static com.google.container.v1beta1.EphemeralStorageLocalSsdConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EphemeralStorageLocalSsdConfig> PARSER =
      new com.google.protobuf.AbstractParser<EphemeralStorageLocalSsdConfig>() {
        @java.lang.Override
        public EphemeralStorageLocalSsdConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EphemeralStorageLocalSsdConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EphemeralStorageLocalSsdConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.EphemeralStorageLocalSsdConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
