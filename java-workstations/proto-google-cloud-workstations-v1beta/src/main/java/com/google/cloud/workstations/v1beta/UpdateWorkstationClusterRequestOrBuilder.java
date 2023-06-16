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
// source: google/cloud/workstations/v1beta/workstations.proto

package com.google.cloud.workstations.v1beta;

public interface UpdateWorkstationClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.UpdateWorkstationClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster workstation_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workstationCluster field is set.
   */
  boolean hasWorkstationCluster();
  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster workstation_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workstationCluster.
   */
  com.google.cloud.workstations.v1beta.WorkstationCluster getWorkstationCluster();
  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationCluster workstation_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationClusterOrBuilder getWorkstationClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Mask that specifies which fields in the workstation cluster
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask that specifies which fields in the workstation cluster
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask that specifies which fields in the workstation cluster
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * apply it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * If set, and the workstation cluster is not found, a new workstation
   * cluster will be created. In this situation, update_mask is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 4;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
