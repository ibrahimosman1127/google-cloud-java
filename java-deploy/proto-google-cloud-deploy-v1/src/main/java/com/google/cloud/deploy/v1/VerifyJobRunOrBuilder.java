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

public interface VerifyJobRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.VerifyJobRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is
   * used to verify. Format is
   * projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Cloud Build `Build` object that is
   * used to verify. Format is
   * projects/{project}/locations/{location}/builds/{build}.
   * </pre>
   *
   * <code>
   * string build = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString getBuildBytes();

  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the verify artifacts. This
   * contains the Skaffold event log.
   * </pre>
   *
   * <code>string artifact_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The artifactUri.
   */
  java.lang.String getArtifactUri();
  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the verify artifacts. This
   * contains the Skaffold event log.
   * </pre>
   *
   * <code>string artifact_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for artifactUri.
   */
  com.google.protobuf.ByteString getArtifactUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. File path of the Skaffold event log relative to the artifact
   * URI.
   * </pre>
   *
   * <code>string event_log_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The eventLogPath.
   */
  java.lang.String getEventLogPath();
  /**
   *
   *
   * <pre>
   * Output only. File path of the Skaffold event log relative to the artifact
   * URI.
   * </pre>
   *
   * <code>string event_log_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for eventLogPath.
   */
  com.google.protobuf.ByteString getEventLogPathBytes();

  /**
   *
   *
   * <pre>
   * Output only. The reason the verify failed. This will always be unspecified
   * while the verify is in progress or if it succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.VerifyJobRun.FailureCause failure_cause = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for failureCause.
   */
  int getFailureCauseValue();
  /**
   *
   *
   * <pre>
   * Output only. The reason the verify failed. This will always be unspecified
   * while the verify is in progress or if it succeeded.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.VerifyJobRun.FailureCause failure_cause = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The failureCause.
   */
  com.google.cloud.deploy.v1.VerifyJobRun.FailureCause getFailureCause();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the verify failure, if available.
   * </pre>
   *
   * <code>string failure_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The failureMessage.
   */
  java.lang.String getFailureMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the verify failure, if available.
   * </pre>
   *
   * <code>string failure_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for failureMessage.
   */
  com.google.protobuf.ByteString getFailureMessageBytes();
}
