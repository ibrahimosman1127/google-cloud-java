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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Metadata includes information associated with a `Rollout`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.Metadata}
 */
public final class Metadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.Metadata)
    MetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Metadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Metadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Metadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.Metadata.class,
            com.google.cloud.deploy.v1.Metadata.Builder.class);
  }

  public static final int CLOUD_RUN_FIELD_NUMBER = 1;
  private com.google.cloud.deploy.v1.CloudRunMetadata cloudRun_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the cloudRun field is set.
   */
  @java.lang.Override
  public boolean hasCloudRun() {
    return cloudRun_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The cloudRun.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.CloudRunMetadata getCloudRun() {
    return cloudRun_ == null
        ? com.google.cloud.deploy.v1.CloudRunMetadata.getDefaultInstance()
        : cloudRun_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder getCloudRunOrBuilder() {
    return cloudRun_ == null
        ? com.google.cloud.deploy.v1.CloudRunMetadata.getDefaultInstance()
        : cloudRun_;
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
    if (cloudRun_ != null) {
      output.writeMessage(1, getCloudRun());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cloudRun_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCloudRun());
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
    if (!(obj instanceof com.google.cloud.deploy.v1.Metadata)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.Metadata other = (com.google.cloud.deploy.v1.Metadata) obj;

    if (hasCloudRun() != other.hasCloudRun()) return false;
    if (hasCloudRun()) {
      if (!getCloudRun().equals(other.getCloudRun())) return false;
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
    if (hasCloudRun()) {
      hash = (37 * hash) + CLOUD_RUN_FIELD_NUMBER;
      hash = (53 * hash) + getCloudRun().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Metadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Metadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.Metadata prototype) {
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
   * Metadata includes information associated with a `Rollout`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.Metadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.Metadata)
      com.google.cloud.deploy.v1.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Metadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.Metadata.class,
              com.google.cloud.deploy.v1.Metadata.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.Metadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cloudRun_ = null;
      if (cloudRunBuilder_ != null) {
        cloudRunBuilder_.dispose();
        cloudRunBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Metadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Metadata getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Metadata build() {
      com.google.cloud.deploy.v1.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Metadata buildPartial() {
      com.google.cloud.deploy.v1.Metadata result = new com.google.cloud.deploy.v1.Metadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.Metadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudRun_ = cloudRunBuilder_ == null ? cloudRun_ : cloudRunBuilder_.build();
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
      if (other instanceof com.google.cloud.deploy.v1.Metadata) {
        return mergeFrom((com.google.cloud.deploy.v1.Metadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.Metadata other) {
      if (other == com.google.cloud.deploy.v1.Metadata.getDefaultInstance()) return this;
      if (other.hasCloudRun()) {
        mergeCloudRun(other.getCloudRun());
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
                input.readMessage(getCloudRunFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.deploy.v1.CloudRunMetadata cloudRun_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.CloudRunMetadata,
            com.google.cloud.deploy.v1.CloudRunMetadata.Builder,
            com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder>
        cloudRunBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the cloudRun field is set.
     */
    public boolean hasCloudRun() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The cloudRun.
     */
    public com.google.cloud.deploy.v1.CloudRunMetadata getCloudRun() {
      if (cloudRunBuilder_ == null) {
        return cloudRun_ == null
            ? com.google.cloud.deploy.v1.CloudRunMetadata.getDefaultInstance()
            : cloudRun_;
      } else {
        return cloudRunBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCloudRun(com.google.cloud.deploy.v1.CloudRunMetadata value) {
      if (cloudRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cloudRun_ = value;
      } else {
        cloudRunBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCloudRun(
        com.google.cloud.deploy.v1.CloudRunMetadata.Builder builderForValue) {
      if (cloudRunBuilder_ == null) {
        cloudRun_ = builderForValue.build();
      } else {
        cloudRunBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeCloudRun(com.google.cloud.deploy.v1.CloudRunMetadata value) {
      if (cloudRunBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && cloudRun_ != null
            && cloudRun_ != com.google.cloud.deploy.v1.CloudRunMetadata.getDefaultInstance()) {
          getCloudRunBuilder().mergeFrom(value);
        } else {
          cloudRun_ = value;
        }
      } else {
        cloudRunBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearCloudRun() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cloudRun_ = null;
      if (cloudRunBuilder_ != null) {
        cloudRunBuilder_.dispose();
        cloudRunBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.deploy.v1.CloudRunMetadata.Builder getCloudRunBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCloudRunFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder getCloudRunOrBuilder() {
      if (cloudRunBuilder_ != null) {
        return cloudRunBuilder_.getMessageOrBuilder();
      } else {
        return cloudRun_ == null
            ? com.google.cloud.deploy.v1.CloudRunMetadata.getDefaultInstance()
            : cloudRun_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the Cloud Run Service that is associated with a
     * `Rollout`.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.CloudRunMetadata,
            com.google.cloud.deploy.v1.CloudRunMetadata.Builder,
            com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder>
        getCloudRunFieldBuilder() {
      if (cloudRunBuilder_ == null) {
        cloudRunBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.deploy.v1.CloudRunMetadata,
                com.google.cloud.deploy.v1.CloudRunMetadata.Builder,
                com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder>(
                getCloudRun(), getParentForChildren(), isClean());
        cloudRun_ = null;
      }
      return cloudRunBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.Metadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.Metadata)
  private static final com.google.cloud.deploy.v1.Metadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.Metadata();
  }

  public static com.google.cloud.deploy.v1.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata> PARSER =
      new com.google.protobuf.AbstractParser<Metadata>() {
        @java.lang.Override
        public Metadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
