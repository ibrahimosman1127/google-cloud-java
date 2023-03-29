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

public interface JobRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.JobRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the `JobRun`. Format is
   * projects/{project}/locations/{location}/
   * deliveryPipelines/{deliveryPipeline}/releases/{releases}/rollouts/
   * {rollouts}/jobRuns/{uuid}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Name of the `JobRun`. Format is
   * projects/{project}/locations/{location}/
   * deliveryPipelines/{deliveryPipeline}/releases/{releases}/rollouts/
   * {rollouts}/jobRuns/{uuid}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `JobRun`.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `JobRun`.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. ID of the `Rollout` phase this `JobRun` belongs in.
   * </pre>
   *
   * <code>string phase_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The phaseId.
   */
  java.lang.String getPhaseId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the `Rollout` phase this `JobRun` belongs in.
   * </pre>
   *
   * <code>string phase_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for phaseId.
   */
  com.google.protobuf.ByteString getPhaseIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. ID of the `Rollout` job this `JobRun` corresponds to.
   * </pre>
   *
   * <code>string job_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the `Rollout` job this `JobRun` corresponds to.
   * </pre>
   *
   * <code>string job_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `JobRun` ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.JobRun.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.JobRun.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.deploy.v1.JobRun.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Information specific to a deploy `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeployJobRun deploy_job_run = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deployJobRun field is set.
   */
  boolean hasDeployJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a deploy `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeployJobRun deploy_job_run = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deployJobRun.
   */
  com.google.cloud.deploy.v1.DeployJobRun getDeployJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a deploy `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeployJobRun deploy_job_run = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.DeployJobRunOrBuilder getDeployJobRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information specific to a verify `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.VerifyJobRun verify_job_run = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the verifyJobRun field is set.
   */
  boolean hasVerifyJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a verify `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.VerifyJobRun verify_job_run = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The verifyJobRun.
   */
  com.google.cloud.deploy.v1.VerifyJobRun getVerifyJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a verify `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.VerifyJobRun verify_job_run = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.VerifyJobRunOrBuilder getVerifyJobRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information specific to a createChildRollout `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CreateChildRolloutJobRun create_child_rollout_job_run = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createChildRolloutJobRun field is set.
   */
  boolean hasCreateChildRolloutJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a createChildRollout `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CreateChildRolloutJobRun create_child_rollout_job_run = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createChildRolloutJobRun.
   */
  com.google.cloud.deploy.v1.CreateChildRolloutJobRun getCreateChildRolloutJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to a createChildRollout `JobRun`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CreateChildRolloutJobRun create_child_rollout_job_run = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.CreateChildRolloutJobRunOrBuilder
      getCreateChildRolloutJobRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information specific to an advanceChildRollout `JobRun`
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AdvanceChildRolloutJobRun advance_child_rollout_job_run = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the advanceChildRolloutJobRun field is set.
   */
  boolean hasAdvanceChildRolloutJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to an advanceChildRollout `JobRun`
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AdvanceChildRolloutJobRun advance_child_rollout_job_run = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The advanceChildRolloutJobRun.
   */
  com.google.cloud.deploy.v1.AdvanceChildRolloutJobRun getAdvanceChildRolloutJobRun();
  /**
   *
   *
   * <pre>
   * Output only. Information specific to an advanceChildRollout `JobRun`
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AdvanceChildRolloutJobRun advance_child_rollout_job_run = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.AdvanceChildRolloutJobRunOrBuilder
      getAdvanceChildRolloutJobRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  public com.google.cloud.deploy.v1.JobRun.JobRunCase getJobRunCase();
}
