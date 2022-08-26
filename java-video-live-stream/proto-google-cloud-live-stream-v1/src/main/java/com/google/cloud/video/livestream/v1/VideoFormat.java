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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Properties of the video format.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.VideoFormat}
 */
public final class VideoFormat extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.VideoFormat)
    VideoFormatOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoFormat.newBuilder() to construct.
  private VideoFormat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoFormat() {
    codec_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoFormat();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VideoFormat(
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

              codec_ = s;
              break;
            }
          case 16:
            {
              widthPixels_ = input.readInt32();
              break;
            }
          case 24:
            {
              heightPixels_ = input.readInt32();
              break;
            }
          case 33:
            {
              frameRate_ = input.readDouble();
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
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_VideoFormat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_VideoFormat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.VideoFormat.class,
            com.google.cloud.video.livestream.v1.VideoFormat.Builder.class);
  }

  public static final int CODEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object codec_;
  /**
   *
   *
   * <pre>
   * Video codec used in this video stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The codec.
   */
  @java.lang.Override
  public java.lang.String getCodec() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codec_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Video codec used in this video stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The bytes for codec.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCodecBytes() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      codec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WIDTH_PIXELS_FIELD_NUMBER = 2;
  private int widthPixels_;
  /**
   *
   *
   * <pre>
   * The width of the video stream in pixels.
   * </pre>
   *
   * <code>int32 width_pixels = 2;</code>
   *
   * @return The widthPixels.
   */
  @java.lang.Override
  public int getWidthPixels() {
    return widthPixels_;
  }

  public static final int HEIGHT_PIXELS_FIELD_NUMBER = 3;
  private int heightPixels_;
  /**
   *
   *
   * <pre>
   * The height of the video stream in pixels.
   * </pre>
   *
   * <code>int32 height_pixels = 3;</code>
   *
   * @return The heightPixels.
   */
  @java.lang.Override
  public int getHeightPixels() {
    return heightPixels_;
  }

  public static final int FRAME_RATE_FIELD_NUMBER = 4;
  private double frameRate_;
  /**
   *
   *
   * <pre>
   * The frame rate of the input video stream.
   * </pre>
   *
   * <code>double frame_rate = 4;</code>
   *
   * @return The frameRate.
   */
  @java.lang.Override
  public double getFrameRate() {
    return frameRate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
    }
    if (widthPixels_ != 0) {
      output.writeInt32(2, widthPixels_);
    }
    if (heightPixels_ != 0) {
      output.writeInt32(3, heightPixels_);
    }
    if (java.lang.Double.doubleToRawLongBits(frameRate_) != 0) {
      output.writeDouble(4, frameRate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
    }
    if (widthPixels_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, widthPixels_);
    }
    if (heightPixels_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, heightPixels_);
    }
    if (java.lang.Double.doubleToRawLongBits(frameRate_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, frameRate_);
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.VideoFormat)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.VideoFormat other =
        (com.google.cloud.video.livestream.v1.VideoFormat) obj;

    if (!getCodec().equals(other.getCodec())) return false;
    if (getWidthPixels() != other.getWidthPixels()) return false;
    if (getHeightPixels() != other.getHeightPixels()) return false;
    if (java.lang.Double.doubleToLongBits(getFrameRate())
        != java.lang.Double.doubleToLongBits(other.getFrameRate())) return false;
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
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    hash = (37 * hash) + WIDTH_PIXELS_FIELD_NUMBER;
    hash = (53 * hash) + getWidthPixels();
    hash = (37 * hash) + HEIGHT_PIXELS_FIELD_NUMBER;
    hash = (53 * hash) + getHeightPixels();
    hash = (37 * hash) + FRAME_RATE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getFrameRate()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.livestream.v1.VideoFormat prototype) {
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
   * Properties of the video format.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.VideoFormat}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.VideoFormat)
      com.google.cloud.video.livestream.v1.VideoFormatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoFormat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoFormat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.VideoFormat.class,
              com.google.cloud.video.livestream.v1.VideoFormat.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.VideoFormat.newBuilder()
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
      codec_ = "";

      widthPixels_ = 0;

      heightPixels_ = 0;

      frameRate_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoFormat_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoFormat getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.VideoFormat.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoFormat build() {
      com.google.cloud.video.livestream.v1.VideoFormat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoFormat buildPartial() {
      com.google.cloud.video.livestream.v1.VideoFormat result =
          new com.google.cloud.video.livestream.v1.VideoFormat(this);
      result.codec_ = codec_;
      result.widthPixels_ = widthPixels_;
      result.heightPixels_ = heightPixels_;
      result.frameRate_ = frameRate_;
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
      if (other instanceof com.google.cloud.video.livestream.v1.VideoFormat) {
        return mergeFrom((com.google.cloud.video.livestream.v1.VideoFormat) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.VideoFormat other) {
      if (other == com.google.cloud.video.livestream.v1.VideoFormat.getDefaultInstance())
        return this;
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (other.getWidthPixels() != 0) {
        setWidthPixels(other.getWidthPixels());
      }
      if (other.getHeightPixels() != 0) {
        setHeightPixels(other.getHeightPixels());
      }
      if (other.getFrameRate() != 0D) {
        setFrameRate(other.getFrameRate());
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
      com.google.cloud.video.livestream.v1.VideoFormat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.video.livestream.v1.VideoFormat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object codec_ = "";
    /**
     *
     *
     * <pre>
     * Video codec used in this video stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return The codec.
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Video codec used in this video stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return The bytes for codec.
     */
    public com.google.protobuf.ByteString getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Video codec used in this video stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @param value The codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodec(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      codec_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video codec used in this video stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCodec() {

      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video codec used in this video stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @param value The bytes for codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodecBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      codec_ = value;
      onChanged();
      return this;
    }

    private int widthPixels_;
    /**
     *
     *
     * <pre>
     * The width of the video stream in pixels.
     * </pre>
     *
     * <code>int32 width_pixels = 2;</code>
     *
     * @return The widthPixels.
     */
    @java.lang.Override
    public int getWidthPixels() {
      return widthPixels_;
    }
    /**
     *
     *
     * <pre>
     * The width of the video stream in pixels.
     * </pre>
     *
     * <code>int32 width_pixels = 2;</code>
     *
     * @param value The widthPixels to set.
     * @return This builder for chaining.
     */
    public Builder setWidthPixels(int value) {

      widthPixels_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The width of the video stream in pixels.
     * </pre>
     *
     * <code>int32 width_pixels = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWidthPixels() {

      widthPixels_ = 0;
      onChanged();
      return this;
    }

    private int heightPixels_;
    /**
     *
     *
     * <pre>
     * The height of the video stream in pixels.
     * </pre>
     *
     * <code>int32 height_pixels = 3;</code>
     *
     * @return The heightPixels.
     */
    @java.lang.Override
    public int getHeightPixels() {
      return heightPixels_;
    }
    /**
     *
     *
     * <pre>
     * The height of the video stream in pixels.
     * </pre>
     *
     * <code>int32 height_pixels = 3;</code>
     *
     * @param value The heightPixels to set.
     * @return This builder for chaining.
     */
    public Builder setHeightPixels(int value) {

      heightPixels_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The height of the video stream in pixels.
     * </pre>
     *
     * <code>int32 height_pixels = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeightPixels() {

      heightPixels_ = 0;
      onChanged();
      return this;
    }

    private double frameRate_;
    /**
     *
     *
     * <pre>
     * The frame rate of the input video stream.
     * </pre>
     *
     * <code>double frame_rate = 4;</code>
     *
     * @return The frameRate.
     */
    @java.lang.Override
    public double getFrameRate() {
      return frameRate_;
    }
    /**
     *
     *
     * <pre>
     * The frame rate of the input video stream.
     * </pre>
     *
     * <code>double frame_rate = 4;</code>
     *
     * @param value The frameRate to set.
     * @return This builder for chaining.
     */
    public Builder setFrameRate(double value) {

      frameRate_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The frame rate of the input video stream.
     * </pre>
     *
     * <code>double frame_rate = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFrameRate() {

      frameRate_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.VideoFormat)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.VideoFormat)
  private static final com.google.cloud.video.livestream.v1.VideoFormat DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.VideoFormat();
  }

  public static com.google.cloud.video.livestream.v1.VideoFormat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoFormat> PARSER =
      new com.google.protobuf.AbstractParser<VideoFormat>() {
        @java.lang.Override
        public VideoFormat parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VideoFormat(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VideoFormat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoFormat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.VideoFormat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}