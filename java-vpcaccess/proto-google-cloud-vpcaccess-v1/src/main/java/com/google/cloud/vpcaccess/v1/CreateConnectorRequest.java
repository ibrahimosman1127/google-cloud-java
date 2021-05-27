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
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

/**
 *
 *
 * <pre>
 * Request for creating a Serverless VPC Access connector.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vpcaccess.v1.CreateConnectorRequest}
 */
public final class CreateConnectorRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vpcaccess.v1.CreateConnectorRequest)
    CreateConnectorRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConnectorRequest.newBuilder() to construct.
  private CreateConnectorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConnectorRequest() {
    parent_ = "";
    connectorId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConnectorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateConnectorRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              connectorId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.vpcaccess.v1.Connector.Builder subBuilder = null;
              if (connector_ != null) {
                subBuilder = connector_.toBuilder();
              }
              connector_ =
                  input.readMessage(
                      com.google.cloud.vpcaccess.v1.Connector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(connector_);
                connector_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vpcaccess.v1.VpcAccessProto
        .internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vpcaccess.v1.VpcAccessProto
        .internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vpcaccess.v1.CreateConnectorRequest.class,
            com.google.cloud.vpcaccess.v1.CreateConnectorRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The project and location in which the configuration should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project and location in which the configuration should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTOR_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object connectorId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this connector.
   * </pre>
   *
   * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The connectorId.
   */
  @java.lang.Override
  public java.lang.String getConnectorId() {
    java.lang.Object ref = connectorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectorId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this connector.
   * </pre>
   *
   * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for connectorId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConnectorIdBytes() {
    java.lang.Object ref = connectorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      connectorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTOR_FIELD_NUMBER = 3;
  private com.google.cloud.vpcaccess.v1.Connector connector_;
  /**
   *
   *
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connector field is set.
   */
  @java.lang.Override
  public boolean hasConnector() {
    return connector_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connector.
   */
  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.Connector getConnector() {
    return connector_ == null
        ? com.google.cloud.vpcaccess.v1.Connector.getDefaultInstance()
        : connector_;
  }
  /**
   *
   *
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorOrBuilder() {
    return getConnector();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getConnectorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, connectorId_);
    }
    if (connector_ != null) {
      output.writeMessage(3, getConnector());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getConnectorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, connectorId_);
    }
    if (connector_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getConnector());
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
    if (!(obj instanceof com.google.cloud.vpcaccess.v1.CreateConnectorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vpcaccess.v1.CreateConnectorRequest other =
        (com.google.cloud.vpcaccess.v1.CreateConnectorRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getConnectorId().equals(other.getConnectorId())) return false;
    if (hasConnector() != other.hasConnector()) return false;
    if (hasConnector()) {
      if (!getConnector().equals(other.getConnector())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CONNECTOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectorId().hashCode();
    if (hasConnector()) {
      hash = (37 * hash) + CONNECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getConnector().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vpcaccess.v1.CreateConnectorRequest prototype) {
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
   * Request for creating a Serverless VPC Access connector.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vpcaccess.v1.CreateConnectorRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vpcaccess.v1.CreateConnectorRequest)
      com.google.cloud.vpcaccess.v1.CreateConnectorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vpcaccess.v1.CreateConnectorRequest.class,
              com.google.cloud.vpcaccess.v1.CreateConnectorRequest.Builder.class);
    }

    // Construct using com.google.cloud.vpcaccess.v1.CreateConnectorRequest.newBuilder()
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
      parent_ = "";

      connectorId_ = "";

      if (connectorBuilder_ == null) {
        connector_ = null;
      } else {
        connector_ = null;
        connectorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.CreateConnectorRequest getDefaultInstanceForType() {
      return com.google.cloud.vpcaccess.v1.CreateConnectorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.CreateConnectorRequest build() {
      com.google.cloud.vpcaccess.v1.CreateConnectorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.CreateConnectorRequest buildPartial() {
      com.google.cloud.vpcaccess.v1.CreateConnectorRequest result =
          new com.google.cloud.vpcaccess.v1.CreateConnectorRequest(this);
      result.parent_ = parent_;
      result.connectorId_ = connectorId_;
      if (connectorBuilder_ == null) {
        result.connector_ = connector_;
      } else {
        result.connector_ = connectorBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.vpcaccess.v1.CreateConnectorRequest) {
        return mergeFrom((com.google.cloud.vpcaccess.v1.CreateConnectorRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vpcaccess.v1.CreateConnectorRequest other) {
      if (other == com.google.cloud.vpcaccess.v1.CreateConnectorRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getConnectorId().isEmpty()) {
        connectorId_ = other.connectorId_;
        onChanged();
      }
      if (other.hasConnector()) {
        mergeConnector(other.getConnector());
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
      com.google.cloud.vpcaccess.v1.CreateConnectorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vpcaccess.v1.CreateConnectorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project and location in which the configuration should be created,
     * specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project and location in which the configuration should be created,
     * specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project and location in which the configuration should be created,
     * specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project and location in which the configuration should be created,
     * specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project and location in which the configuration should be created,
     * specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object connectorId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this connector.
     * </pre>
     *
     * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The connectorId.
     */
    public java.lang.String getConnectorId() {
      java.lang.Object ref = connectorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this connector.
     * </pre>
     *
     * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for connectorId.
     */
    public com.google.protobuf.ByteString getConnectorIdBytes() {
      java.lang.Object ref = connectorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        connectorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this connector.
     * </pre>
     *
     * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The connectorId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectorId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      connectorId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this connector.
     * </pre>
     *
     * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConnectorId() {

      connectorId_ = getDefaultInstance().getConnectorId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this connector.
     * </pre>
     *
     * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for connectorId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectorIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      connectorId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.vpcaccess.v1.Connector connector_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vpcaccess.v1.Connector,
            com.google.cloud.vpcaccess.v1.Connector.Builder,
            com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
        connectorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the connector field is set.
     */
    public boolean hasConnector() {
      return connectorBuilder_ != null || connector_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The connector.
     */
    public com.google.cloud.vpcaccess.v1.Connector getConnector() {
      if (connectorBuilder_ == null) {
        return connector_ == null
            ? com.google.cloud.vpcaccess.v1.Connector.getDefaultInstance()
            : connector_;
      } else {
        return connectorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConnector(com.google.cloud.vpcaccess.v1.Connector value) {
      if (connectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connector_ = value;
        onChanged();
      } else {
        connectorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConnector(com.google.cloud.vpcaccess.v1.Connector.Builder builderForValue) {
      if (connectorBuilder_ == null) {
        connector_ = builderForValue.build();
        onChanged();
      } else {
        connectorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConnector(com.google.cloud.vpcaccess.v1.Connector value) {
      if (connectorBuilder_ == null) {
        if (connector_ != null) {
          connector_ =
              com.google.cloud.vpcaccess.v1.Connector.newBuilder(connector_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          connector_ = value;
        }
        onChanged();
      } else {
        connectorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConnector() {
      if (connectorBuilder_ == null) {
        connector_ = null;
        onChanged();
      } else {
        connector_ = null;
        connectorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vpcaccess.v1.Connector.Builder getConnectorBuilder() {

      onChanged();
      return getConnectorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorOrBuilder() {
      if (connectorBuilder_ != null) {
        return connectorBuilder_.getMessageOrBuilder();
      } else {
        return connector_ == null
            ? com.google.cloud.vpcaccess.v1.Connector.getDefaultInstance()
            : connector_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vpcaccess.v1.Connector,
            com.google.cloud.vpcaccess.v1.Connector.Builder,
            com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
        getConnectorFieldBuilder() {
      if (connectorBuilder_ == null) {
        connectorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vpcaccess.v1.Connector,
                com.google.cloud.vpcaccess.v1.Connector.Builder,
                com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>(
                getConnector(), getParentForChildren(), isClean());
        connector_ = null;
      }
      return connectorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vpcaccess.v1.CreateConnectorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vpcaccess.v1.CreateConnectorRequest)
  private static final com.google.cloud.vpcaccess.v1.CreateConnectorRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vpcaccess.v1.CreateConnectorRequest();
  }

  public static com.google.cloud.vpcaccess.v1.CreateConnectorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConnectorRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConnectorRequest>() {
        @java.lang.Override
        public CreateConnectorRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateConnectorRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateConnectorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConnectorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.CreateConnectorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
