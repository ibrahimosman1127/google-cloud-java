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
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

public interface ThreatEntryAdditionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.ThreatEntryAdditions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw SHA256-formatted entries.
   * Repeated to allow returning sets of hashes with different prefix sizes.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.RawHashes raw_hashes = 1;</code>
   */
  java.util.List<com.google.webrisk.v1.RawHashes> getRawHashesList();
  /**
   *
   *
   * <pre>
   * The raw SHA256-formatted entries.
   * Repeated to allow returning sets of hashes with different prefix sizes.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.RawHashes raw_hashes = 1;</code>
   */
  com.google.webrisk.v1.RawHashes getRawHashes(int index);
  /**
   *
   *
   * <pre>
   * The raw SHA256-formatted entries.
   * Repeated to allow returning sets of hashes with different prefix sizes.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.RawHashes raw_hashes = 1;</code>
   */
  int getRawHashesCount();
  /**
   *
   *
   * <pre>
   * The raw SHA256-formatted entries.
   * Repeated to allow returning sets of hashes with different prefix sizes.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.RawHashes raw_hashes = 1;</code>
   */
  java.util.List<? extends com.google.webrisk.v1.RawHashesOrBuilder> getRawHashesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The raw SHA256-formatted entries.
   * Repeated to allow returning sets of hashes with different prefix sizes.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.RawHashes raw_hashes = 1;</code>
   */
  com.google.webrisk.v1.RawHashesOrBuilder getRawHashesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a
   * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
   * ascending order, then delta encoded and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.RiceDeltaEncoding rice_hashes = 2;</code>
   *
   * @return Whether the riceHashes field is set.
   */
  boolean hasRiceHashes();
  /**
   *
   *
   * <pre>
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a
   * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
   * ascending order, then delta encoded and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.RiceDeltaEncoding rice_hashes = 2;</code>
   *
   * @return The riceHashes.
   */
  com.google.webrisk.v1.RiceDeltaEncoding getRiceHashes();
  /**
   *
   *
   * <pre>
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a
   * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
   * ascending order, then delta encoded and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.RiceDeltaEncoding rice_hashes = 2;</code>
   */
  com.google.webrisk.v1.RiceDeltaEncodingOrBuilder getRiceHashesOrBuilder();
}
