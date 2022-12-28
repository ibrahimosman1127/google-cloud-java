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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface WindowsNodeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WindowsNodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * OSVersion specifies the Windows node config to be used on the node
   * </pre>
   *
   * <code>.google.container.v1beta1.WindowsNodeConfig.OSVersion os_version = 1;</code>
   *
   * @return The enum numeric value on the wire for osVersion.
   */
  int getOsVersionValue();
  /**
   *
   *
   * <pre>
   * OSVersion specifies the Windows node config to be used on the node
   * </pre>
   *
   * <code>.google.container.v1beta1.WindowsNodeConfig.OSVersion os_version = 1;</code>
   *
   * @return The osVersion.
   */
  com.google.container.v1beta1.WindowsNodeConfig.OSVersion getOsVersion();
}
