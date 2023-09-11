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
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface GetNotificationChannelVerificationCodeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The notification channel for which a verification code is to be
   * generated and retrieved. This must name a channel that is already verified;
   * if the specified channel is not verified, the request will fail.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The notification channel for which a verification code is to be
   * generated and retrieved. This must name a channel that is already verified;
   * if the specified channel is not verified, the request will fail.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}
