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

public interface CreateRolloutRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CreateRolloutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent collection in which the `Rollout` should be created.
   * Format should be
   * projects/{project_id}/locations/{location_name}/deliveryPipelines/{pipeline_name}/releases/{release_name}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent collection in which the `Rollout` should be created.
   * Format should be
   * projects/{project_id}/locations/{location_name}/deliveryPipelines/{pipeline_name}/releases/{release_name}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the `Rollout`.
   * </pre>
   *
   * <code>string rollout_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The rolloutId.
   */
  java.lang.String getRolloutId();
  /**
   *
   *
   * <pre>
   * Required. ID of the `Rollout`.
   * </pre>
   *
   * <code>string rollout_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for rolloutId.
   */
  com.google.protobuf.ByteString getRolloutIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollout field is set.
   */
  boolean hasRollout();
  /**
   *
   *
   * <pre>
   * Required. The `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollout.
   */
  com.google.cloud.deploy.v1.Rollout getRollout();
  /**
   *
   *
   * <pre>
   * Required. The `Rollout` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Rollout rollout = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.deploy.v1.RolloutOrBuilder getRolloutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, the request is validated and the user is provided
   * with an expected result, but no actual change is made.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If empty the `Rollout`
   * will start at the first phase.
   * </pre>
   *
   * <code>string starting_phase_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The startingPhaseId.
   */
  java.lang.String getStartingPhaseId();
  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If empty the `Rollout`
   * will start at the first phase.
   * </pre>
   *
   * <code>string starting_phase_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for startingPhaseId.
   */
  com.google.protobuf.ByteString getStartingPhaseIdBytes();
}
