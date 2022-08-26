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
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface VulnerableParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.VulnerableParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @return A list containing the parameterNames.
   */
  java.util.List<java.lang.String> getParameterNamesList();
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @return The count of parameterNames.
   */
  int getParameterNamesCount();
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The parameterNames at the given index.
   */
  java.lang.String getParameterNames(int index);
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the parameterNames at the given index.
   */
  com.google.protobuf.ByteString getParameterNamesBytes(int index);
}