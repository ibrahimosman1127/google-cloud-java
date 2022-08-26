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
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateKnowledgeBaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the knowledgeBase field is set.
   */
  boolean hasKnowledgeBase();
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The knowledgeBase.
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase();
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}