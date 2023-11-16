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
// source: google/cloud/aiplatform/v1/feature_view.proto

package com.google.cloud.aiplatform.v1;

public interface FeatureViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FeatureView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bigQuerySource.
   */
  com.google.cloud.aiplatform.v1.FeatureView.BigQuerySource getBigQuerySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureView.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the featureRegistrySource field is set.
   */
  boolean hasFeatureRegistrySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The featureRegistrySource.
   */
  com.google.cloud.aiplatform.v1.FeatureView.FeatureRegistrySource getFeatureRegistrySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureView.FeatureRegistrySourceOrBuilder
      getFeatureRegistrySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Name of the FeatureView. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the FeatureView. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureView.SyncConfig sync_config = 7;</code>
   *
   * @return Whether the syncConfig field is set.
   */
  boolean hasSyncConfig();
  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureView.SyncConfig sync_config = 7;</code>
   *
   * @return The syncConfig.
   */
  com.google.cloud.aiplatform.v1.FeatureView.SyncConfig getSyncConfig();
  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureView.SyncConfig sync_config = 7;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureView.SyncConfigOrBuilder getSyncConfigOrBuilder();

  com.google.cloud.aiplatform.v1.FeatureView.SourceCase getSourceCase();
}
