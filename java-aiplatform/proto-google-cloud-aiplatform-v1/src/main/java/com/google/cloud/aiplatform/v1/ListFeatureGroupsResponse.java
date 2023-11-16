/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1/feature_registry_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [FeatureRegistryService.ListFeatureGroups][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatureGroups].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListFeatureGroupsResponse}
 */
public final class ListFeatureGroupsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListFeatureGroupsResponse)
    ListFeatureGroupsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFeatureGroupsResponse.newBuilder() to construct.
  private ListFeatureGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFeatureGroupsResponse() {
    featureGroups_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFeatureGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeatureRegistryServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeatureRegistryServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.class,
            com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.Builder.class);
  }

  public static final int FEATURE_GROUPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.FeatureGroup> featureGroups_;
  /**
   *
   *
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.FeatureGroup> getFeatureGroupsList() {
    return featureGroups_;
  }
  /**
   *
   *
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder>
      getFeatureGroupsOrBuilderList() {
    return featureGroups_;
  }
  /**
   *
   *
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
   */
  @java.lang.Override
  public int getFeatureGroupsCount() {
    return featureGroups_.size();
  }
  /**
   *
   *
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureGroup getFeatureGroups(int index) {
    return featureGroups_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The FeatureGroups matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder getFeatureGroupsOrBuilder(int index) {
    return featureGroups_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < featureGroups_.size(); i++) {
      output.writeMessage(1, featureGroups_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < featureGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, featureGroups_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse other =
        (com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse) obj;

    if (!getFeatureGroupsList().equals(other.getFeatureGroupsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getFeatureGroupsCount() > 0) {
      hash = (37 * hash) + FEATURE_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureGroupsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse prototype) {
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
   * Response message for
   * [FeatureRegistryService.ListFeatureGroups][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatureGroups].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListFeatureGroupsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListFeatureGroupsResponse)
      com.google.cloud.aiplatform.v1.ListFeatureGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.class,
              com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (featureGroupsBuilder_ == null) {
        featureGroups_ = java.util.Collections.emptyList();
      } else {
        featureGroups_ = null;
        featureGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListFeatureGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse build() {
      com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse result =
          new com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse result) {
      if (featureGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          featureGroups_ = java.util.Collections.unmodifiableList(featureGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.featureGroups_ = featureGroups_;
      } else {
        result.featureGroups_ = featureGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse.getDefaultInstance())
        return this;
      if (featureGroupsBuilder_ == null) {
        if (!other.featureGroups_.isEmpty()) {
          if (featureGroups_.isEmpty()) {
            featureGroups_ = other.featureGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeatureGroupsIsMutable();
            featureGroups_.addAll(other.featureGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.featureGroups_.isEmpty()) {
          if (featureGroupsBuilder_.isEmpty()) {
            featureGroupsBuilder_.dispose();
            featureGroupsBuilder_ = null;
            featureGroups_ = other.featureGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            featureGroupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFeatureGroupsFieldBuilder()
                    : null;
          } else {
            featureGroupsBuilder_.addAllMessages(other.featureGroups_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.aiplatform.v1.FeatureGroup m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.FeatureGroup.parser(), extensionRegistry);
                if (featureGroupsBuilder_ == null) {
                  ensureFeatureGroupsIsMutable();
                  featureGroups_.add(m);
                } else {
                  featureGroupsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.util.List<com.google.cloud.aiplatform.v1.FeatureGroup> featureGroups_ =
        java.util.Collections.emptyList();

    private void ensureFeatureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        featureGroups_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.FeatureGroup>(featureGroups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureGroup,
            com.google.cloud.aiplatform.v1.FeatureGroup.Builder,
            com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder>
        featureGroupsBuilder_;

    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.FeatureGroup> getFeatureGroupsList() {
      if (featureGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(featureGroups_);
      } else {
        return featureGroupsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public int getFeatureGroupsCount() {
      if (featureGroupsBuilder_ == null) {
        return featureGroups_.size();
      } else {
        return featureGroupsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeatureGroup getFeatureGroups(int index) {
      if (featureGroupsBuilder_ == null) {
        return featureGroups_.get(index);
      } else {
        return featureGroupsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder setFeatureGroups(int index, com.google.cloud.aiplatform.v1.FeatureGroup value) {
      if (featureGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureGroupsIsMutable();
        featureGroups_.set(index, value);
        onChanged();
      } else {
        featureGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder setFeatureGroups(
        int index, com.google.cloud.aiplatform.v1.FeatureGroup.Builder builderForValue) {
      if (featureGroupsBuilder_ == null) {
        ensureFeatureGroupsIsMutable();
        featureGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        featureGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder addFeatureGroups(com.google.cloud.aiplatform.v1.FeatureGroup value) {
      if (featureGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureGroupsIsMutable();
        featureGroups_.add(value);
        onChanged();
      } else {
        featureGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder addFeatureGroups(int index, com.google.cloud.aiplatform.v1.FeatureGroup value) {
      if (featureGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureGroupsIsMutable();
        featureGroups_.add(index, value);
        onChanged();
      } else {
        featureGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder addFeatureGroups(
        com.google.cloud.aiplatform.v1.FeatureGroup.Builder builderForValue) {
      if (featureGroupsBuilder_ == null) {
        ensureFeatureGroupsIsMutable();
        featureGroups_.add(builderForValue.build());
        onChanged();
      } else {
        featureGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder addFeatureGroups(
        int index, com.google.cloud.aiplatform.v1.FeatureGroup.Builder builderForValue) {
      if (featureGroupsBuilder_ == null) {
        ensureFeatureGroupsIsMutable();
        featureGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        featureGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder addAllFeatureGroups(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.FeatureGroup> values) {
      if (featureGroupsBuilder_ == null) {
        ensureFeatureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, featureGroups_);
        onChanged();
      } else {
        featureGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder clearFeatureGroups() {
      if (featureGroupsBuilder_ == null) {
        featureGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featureGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public Builder removeFeatureGroups(int index) {
      if (featureGroupsBuilder_ == null) {
        ensureFeatureGroupsIsMutable();
        featureGroups_.remove(index);
        onChanged();
      } else {
        featureGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeatureGroup.Builder getFeatureGroupsBuilder(int index) {
      return getFeatureGroupsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder getFeatureGroupsOrBuilder(
        int index) {
      if (featureGroupsBuilder_ == null) {
        return featureGroups_.get(index);
      } else {
        return featureGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder>
        getFeatureGroupsOrBuilderList() {
      if (featureGroupsBuilder_ != null) {
        return featureGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(featureGroups_);
      }
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeatureGroup.Builder addFeatureGroupsBuilder() {
      return getFeatureGroupsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.FeatureGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.FeatureGroup.Builder addFeatureGroupsBuilder(int index) {
      return getFeatureGroupsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.FeatureGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The FeatureGroups matching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.FeatureGroup feature_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.FeatureGroup.Builder>
        getFeatureGroupsBuilderList() {
      return getFeatureGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureGroup,
            com.google.cloud.aiplatform.v1.FeatureGroup.Builder,
            com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder>
        getFeatureGroupsFieldBuilder() {
      if (featureGroupsBuilder_ == null) {
        featureGroupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.FeatureGroup,
                com.google.cloud.aiplatform.v1.FeatureGroup.Builder,
                com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder>(
                featureGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        featureGroups_ = null;
      }
      return featureGroupsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListFeatureGroupsRequest.page_token][google.cloud.aiplatform.v1.ListFeatureGroupsRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListFeatureGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListFeatureGroupsResponse)
  private static final com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFeatureGroupsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFeatureGroupsResponse>() {
        @java.lang.Override
        public ListFeatureGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFeatureGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFeatureGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListFeatureGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
