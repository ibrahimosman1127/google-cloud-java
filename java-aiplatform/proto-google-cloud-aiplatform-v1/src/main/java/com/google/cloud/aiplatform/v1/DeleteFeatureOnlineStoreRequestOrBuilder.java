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
// source: google/cloud/aiplatform/v1/feature_online_store_admin_service.proto

package com.google.cloud.aiplatform.v1;

public interface DeleteFeatureOnlineStoreRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeleteFeatureOnlineStoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the FeatureOnlineStore to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the FeatureOnlineStore to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If set to true, any FeatureViews and Features for this FeatureOnlineStore
   * will also be deleted. (Otherwise, the request will only work if the
   * FeatureOnlineStore has no FeatureViews.)
   * </pre>
   *
   * <code>bool force = 2;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
