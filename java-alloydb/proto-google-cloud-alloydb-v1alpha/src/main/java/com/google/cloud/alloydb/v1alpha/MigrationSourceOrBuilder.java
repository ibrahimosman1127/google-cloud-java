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
// source: google/cloud/alloydb/v1alpha/resources.proto

package com.google.cloud.alloydb.v1alpha;

public interface MigrationSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.MigrationSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The hostPort.
   */
  java.lang.String getHostPort();
  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for hostPort.
   */
  com.google.protobuf.ByteString getHostPortBytes();

  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString getReferenceIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.MigrationSource.MigrationSourceType source_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  int getSourceTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.MigrationSource.MigrationSourceType source_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The sourceType.
   */
  com.google.cloud.alloydb.v1alpha.MigrationSource.MigrationSourceType getSourceType();
}
