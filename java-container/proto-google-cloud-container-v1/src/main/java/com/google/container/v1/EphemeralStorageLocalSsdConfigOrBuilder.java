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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface EphemeralStorageLocalSsdConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.EphemeralStorageLocalSsdConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of local SSDs to use to back ephemeral storage. Uses NVMe
   * interfaces. Each local SSD is 375 GB in size.
   * If zero, it means to disable using local SSDs as ephemeral storage.
   * The limit for this value is dependent upon the maximum number of
   * disks available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   * </pre>
   *
   * <code>int32 local_ssd_count = 1;</code>
   *
   * @return The localSsdCount.
   */
  int getLocalSsdCount();
}
