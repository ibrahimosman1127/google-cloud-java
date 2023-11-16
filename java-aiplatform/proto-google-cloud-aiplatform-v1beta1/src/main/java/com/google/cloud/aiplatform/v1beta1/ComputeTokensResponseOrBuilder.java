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
// source: google/cloud/aiplatform/v1beta1/llm_utility_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ComputeTokensResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ComputeTokensResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TokensInfo tokens_info = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.TokensInfo> getTokensInfoList();
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TokensInfo tokens_info = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TokensInfo getTokensInfo(int index);
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TokensInfo tokens_info = 1;</code>
   */
  int getTokensInfoCount();
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TokensInfo tokens_info = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TokensInfoOrBuilder>
      getTokensInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TokensInfo tokens_info = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TokensInfoOrBuilder getTokensInfoOrBuilder(int index);
}
