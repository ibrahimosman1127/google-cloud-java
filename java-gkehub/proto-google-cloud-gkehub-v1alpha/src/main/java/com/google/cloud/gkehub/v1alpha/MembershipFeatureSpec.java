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
// source: google/cloud/gkehub/v1alpha/feature.proto

package com.google.cloud.gkehub.v1alpha;

/**
 *
 *
 * <pre>
 * MembershipFeatureSpec contains configuration information for a single
 * Membership.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1alpha.MembershipFeatureSpec}
 */
public final class MembershipFeatureSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1alpha.MembershipFeatureSpec)
    MembershipFeatureSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MembershipFeatureSpec.newBuilder() to construct.
  private MembershipFeatureSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MembershipFeatureSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MembershipFeatureSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MembershipFeatureSpec(
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
          case 850:
            {
              com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder subBuilder =
                  null;
              if (featureSpecCase_ == 106) {
                subBuilder =
                    ((com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_)
                        .toBuilder();
              }
              featureSpec_ =
                  input.readMessage(
                      com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_);
                featureSpec_ = subBuilder.buildPartial();
              }
              featureSpecCase_ = 106;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1alpha.FeatureProto
        .internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1alpha.FeatureProto
        .internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.class,
            com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.Builder.class);
  }

  private int featureSpecCase_ = 0;
  private java.lang.Object featureSpec_;

  public enum FeatureSpecCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIGMANAGEMENT(106),
    FEATURESPEC_NOT_SET(0);
    private final int value;

    private FeatureSpecCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FeatureSpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static FeatureSpecCase forNumber(int value) {
      switch (value) {
        case 106:
          return CONFIGMANAGEMENT;
        case 0:
          return FEATURESPEC_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FeatureSpecCase getFeatureSpecCase() {
    return FeatureSpecCase.forNumber(featureSpecCase_);
  }

  public static final int CONFIGMANAGEMENT_FIELD_NUMBER = 106;
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
   * </code>
   *
   * @return Whether the configmanagement field is set.
   */
  @java.lang.Override
  public boolean hasConfigmanagement() {
    return featureSpecCase_ == 106;
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
   * </code>
   *
   * @return The configmanagement.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec getConfigmanagement() {
    if (featureSpecCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecOrBuilder
      getConfigmanagementOrBuilder() {
    if (featureSpecCase_ == 106) {
      return (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_;
    }
    return com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
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
    if (featureSpecCase_ == 106) {
      output.writeMessage(
          106, (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureSpecCase_ == 106) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              106, (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec other =
        (com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec) obj;

    if (!getFeatureSpecCase().equals(other.getFeatureSpecCase())) return false;
    switch (featureSpecCase_) {
      case 106:
        if (!getConfigmanagement().equals(other.getConfigmanagement())) return false;
        break;
      case 0:
      default:
    }
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
    switch (featureSpecCase_) {
      case 106:
        hash = (37 * hash) + CONFIGMANAGEMENT_FIELD_NUMBER;
        hash = (53 * hash) + getConfigmanagement().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parseFrom(
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
      com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec prototype) {
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
   * MembershipFeatureSpec contains configuration information for a single
   * Membership.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1alpha.MembershipFeatureSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1alpha.MembershipFeatureSpec)
      com.google.cloud.gkehub.v1alpha.MembershipFeatureSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto
          .internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto
          .internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.class,
              com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      featureSpecCase_ = 0;
      featureSpec_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1alpha.FeatureProto
          .internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec build() {
      com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec buildPartial() {
      com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec result =
          new com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec(this);
      if (featureSpecCase_ == 106) {
        if (configmanagementBuilder_ == null) {
          result.featureSpec_ = featureSpec_;
        } else {
          result.featureSpec_ = configmanagementBuilder_.build();
        }
      }
      result.featureSpecCase_ = featureSpecCase_;
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
      if (other instanceof com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec) {
        return mergeFrom((com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec other) {
      if (other == com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec.getDefaultInstance())
        return this;
      switch (other.getFeatureSpecCase()) {
        case CONFIGMANAGEMENT:
          {
            mergeConfigmanagement(other.getConfigmanagement());
            break;
          }
        case FEATURESPEC_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int featureSpecCase_ = 0;
    private java.lang.Object featureSpec_;

    public FeatureSpecCase getFeatureSpecCase() {
      return FeatureSpecCase.forNumber(featureSpecCase_);
    }

    public Builder clearFeatureSpec() {
      featureSpecCase_ = 0;
      featureSpec_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec,
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecOrBuilder>
        configmanagementBuilder_;
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     *
     * @return Whether the configmanagement field is set.
     */
    @java.lang.Override
    public boolean hasConfigmanagement() {
      return featureSpecCase_ == 106;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     *
     * @return The configmanagement.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec getConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
      } else {
        if (featureSpecCase_ == 106) {
          return configmanagementBuilder_.getMessage();
        }
        return com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec value) {
      if (configmanagementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureSpec_ = value;
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(value);
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    public Builder setConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder builderForValue) {
      if (configmanagementBuilder_ == null) {
        featureSpec_ = builderForValue.build();
        onChanged();
      } else {
        configmanagementBuilder_.setMessage(builderForValue.build());
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    public Builder mergeConfigmanagement(
        com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec value) {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106
            && featureSpec_
                != com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec
                    .getDefaultInstance()) {
          featureSpec_ =
              com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.newBuilder(
                      (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec)
                          featureSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          featureSpec_ = value;
        }
        onChanged();
      } else {
        if (featureSpecCase_ == 106) {
          configmanagementBuilder_.mergeFrom(value);
        } else {
          configmanagementBuilder_.setMessage(value);
        }
      }
      featureSpecCase_ = 106;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    public Builder clearConfigmanagement() {
      if (configmanagementBuilder_ == null) {
        if (featureSpecCase_ == 106) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
          onChanged();
        }
      } else {
        if (featureSpecCase_ == 106) {
          featureSpecCase_ = 0;
          featureSpec_ = null;
        }
        configmanagementBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder
        getConfigmanagementBuilder() {
      return getConfigmanagementFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecOrBuilder
        getConfigmanagementOrBuilder() {
      if ((featureSpecCase_ == 106) && (configmanagementBuilder_ != null)) {
        return configmanagementBuilder_.getMessageOrBuilder();
      } else {
        if (featureSpecCase_ == 106) {
          return (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_;
        }
        return com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Config Management-specific spec.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec configmanagement = 106;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec,
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecOrBuilder>
        getConfigmanagementFieldBuilder() {
      if (configmanagementBuilder_ == null) {
        if (!(featureSpecCase_ == 106)) {
          featureSpec_ =
              com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.getDefaultInstance();
        }
        configmanagementBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec,
                com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec.Builder,
                com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpecOrBuilder>(
                (com.google.cloud.gkehub.configmanagement.v1alpha.MembershipSpec) featureSpec_,
                getParentForChildren(),
                isClean());
        featureSpec_ = null;
      }
      featureSpecCase_ = 106;
      onChanged();
      ;
      return configmanagementBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1alpha.MembershipFeatureSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.MembershipFeatureSpec)
  private static final com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec();
  }

  public static com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipFeatureSpec> PARSER =
      new com.google.protobuf.AbstractParser<MembershipFeatureSpec>() {
        @java.lang.Override
        public MembershipFeatureSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MembershipFeatureSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MembershipFeatureSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipFeatureSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}