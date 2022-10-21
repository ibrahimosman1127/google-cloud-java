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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1;

/**
 *
 *
 * <pre>
 * Request for acknowledging the violation
 * Next Id: 4
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest}
 */
public final class AcknowledgeViolationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)
    AcknowledgeViolationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcknowledgeViolationRequest.newBuilder() to construct.
  private AcknowledgeViolationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcknowledgeViolationRequest() {
    name_ = "";
    comment_ = "";
    nonCompliantOrgPolicy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcknowledgeViolationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1_AcknowledgeViolationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1_AcknowledgeViolationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.class,
            com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Violation to acknowledge.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Violation to acknowledge.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object comment_;
  /**
   *
   *
   * <pre>
   * Required. Business justification explaining the need for violation acknowledgement
   * </pre>
   *
   * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The comment.
   */
  @java.lang.Override
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Business justification explaining the need for violation acknowledgement
   * </pre>
   *
   * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for comment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      comment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NON_COMPLIANT_ORG_POLICY_FIELD_NUMBER = 3;
  private volatile java.lang.Object nonCompliantOrgPolicy_;
  /**
   *
   *
   * <pre>
   * Optional. This field is deprecated and will be removed in future version of the API.
   * Name of the OrgPolicy which was modified with non-compliant change and
   * resulted in this violation.
   * Format:
   * projects/{project_number}/policies/{constraint_name}
   * folders/{folder_id}/policies/{constraint_name}
   * organizations/{organization_id}/policies/{constraint_name}
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated
   *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
   *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
   * @return The nonCompliantOrgPolicy.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getNonCompliantOrgPolicy() {
    java.lang.Object ref = nonCompliantOrgPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nonCompliantOrgPolicy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. This field is deprecated and will be removed in future version of the API.
   * Name of the OrgPolicy which was modified with non-compliant change and
   * resulted in this violation.
   * Format:
   * projects/{project_number}/policies/{constraint_name}
   * folders/{folder_id}/policies/{constraint_name}
   * organizations/{organization_id}/policies/{constraint_name}
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated
   *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
   *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
   * @return The bytes for nonCompliantOrgPolicy.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getNonCompliantOrgPolicyBytes() {
    java.lang.Object ref = nonCompliantOrgPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nonCompliantOrgPolicy_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, comment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonCompliantOrgPolicy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nonCompliantOrgPolicy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, comment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nonCompliantOrgPolicy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nonCompliantOrgPolicy_);
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest other =
        (com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getComment().equals(other.getComment())) return false;
    if (!getNonCompliantOrgPolicy().equals(other.getNonCompliantOrgPolicy())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    hash = (37 * hash) + NON_COMPLIANT_ORG_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + getNonCompliantOrgPolicy().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest parseFrom(
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
      com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest prototype) {
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
   * Request for acknowledging the violation
   * Next Id: 4
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)
      com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_AcknowledgeViolationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_AcknowledgeViolationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.class,
              com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.Builder.class);
    }

    // Construct using com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      comment_ = "";

      nonCompliantOrgPolicy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1_AcknowledgeViolationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest build() {
      com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest buildPartial() {
      com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest result =
          new com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest(this);
      result.name_ = name_;
      result.comment_ = comment_;
      result.nonCompliantOrgPolicy_ = nonCompliantOrgPolicy_;
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
      if (other instanceof com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest) {
        return mergeFrom((com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest other) {
      if (other
          == com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
        onChanged();
      }
      if (!other.getNonCompliantOrgPolicy().isEmpty()) {
        nonCompliantOrgPolicy_ = other.nonCompliantOrgPolicy_;
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
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                comment_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                nonCompliantOrgPolicy_ = input.readStringRequireUtf8();

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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Violation to acknowledge.
     * Format:
     * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Violation to acknowledge.
     * Format:
     * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Violation to acknowledge.
     * Format:
     * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Violation to acknowledge.
     * Format:
     * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Violation to acknowledge.
     * Format:
     * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object comment_ = "";
    /**
     *
     *
     * <pre>
     * Required. Business justification explaining the need for violation acknowledgement
     * </pre>
     *
     * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The comment.
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Business justification explaining the need for violation acknowledgement
     * </pre>
     *
     * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for comment.
     */
    public com.google.protobuf.ByteString getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Business justification explaining the need for violation acknowledgement
     * </pre>
     *
     * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The comment to set.
     * @return This builder for chaining.
     */
    public Builder setComment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      comment_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Business justification explaining the need for violation acknowledgement
     * </pre>
     *
     * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComment() {

      comment_ = getDefaultInstance().getComment();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Business justification explaining the need for violation acknowledgement
     * </pre>
     *
     * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for comment to set.
     * @return This builder for chaining.
     */
    public Builder setCommentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      comment_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nonCompliantOrgPolicy_ = "";
    /**
     *
     *
     * <pre>
     * Optional. This field is deprecated and will be removed in future version of the API.
     * Name of the OrgPolicy which was modified with non-compliant change and
     * resulted in this violation.
     * Format:
     * projects/{project_number}/policies/{constraint_name}
     * folders/{folder_id}/policies/{constraint_name}
     * organizations/{organization_id}/policies/{constraint_name}
     * </pre>
     *
     * <code>
     * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated
     *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
     *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
     * @return The nonCompliantOrgPolicy.
     */
    @java.lang.Deprecated
    public java.lang.String getNonCompliantOrgPolicy() {
      java.lang.Object ref = nonCompliantOrgPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nonCompliantOrgPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. This field is deprecated and will be removed in future version of the API.
     * Name of the OrgPolicy which was modified with non-compliant change and
     * resulted in this violation.
     * Format:
     * projects/{project_number}/policies/{constraint_name}
     * folders/{folder_id}/policies/{constraint_name}
     * organizations/{organization_id}/policies/{constraint_name}
     * </pre>
     *
     * <code>
     * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated
     *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
     *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
     * @return The bytes for nonCompliantOrgPolicy.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getNonCompliantOrgPolicyBytes() {
      java.lang.Object ref = nonCompliantOrgPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nonCompliantOrgPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. This field is deprecated and will be removed in future version of the API.
     * Name of the OrgPolicy which was modified with non-compliant change and
     * resulted in this violation.
     * Format:
     * projects/{project_number}/policies/{constraint_name}
     * folders/{folder_id}/policies/{constraint_name}
     * organizations/{organization_id}/policies/{constraint_name}
     * </pre>
     *
     * <code>
     * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated
     *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
     *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
     * @param value The nonCompliantOrgPolicy to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNonCompliantOrgPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nonCompliantOrgPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This field is deprecated and will be removed in future version of the API.
     * Name of the OrgPolicy which was modified with non-compliant change and
     * resulted in this violation.
     * Format:
     * projects/{project_number}/policies/{constraint_name}
     * folders/{folder_id}/policies/{constraint_name}
     * organizations/{organization_id}/policies/{constraint_name}
     * </pre>
     *
     * <code>
     * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated
     *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
     *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearNonCompliantOrgPolicy() {

      nonCompliantOrgPolicy_ = getDefaultInstance().getNonCompliantOrgPolicy();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This field is deprecated and will be removed in future version of the API.
     * Name of the OrgPolicy which was modified with non-compliant change and
     * resulted in this violation.
     * Format:
     * projects/{project_number}/policies/{constraint_name}
     * folders/{folder_id}/policies/{constraint_name}
     * organizations/{organization_id}/policies/{constraint_name}
     * </pre>
     *
     * <code>
     * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @deprecated
     *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
     *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
     * @param value The bytes for nonCompliantOrgPolicy to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNonCompliantOrgPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nonCompliantOrgPolicy_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)
  private static final com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest();
  }

  public static com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeViolationRequest> PARSER =
      new com.google.protobuf.AbstractParser<AcknowledgeViolationRequest>() {
        @java.lang.Override
        public AcknowledgeViolationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcknowledgeViolationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeViolationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
