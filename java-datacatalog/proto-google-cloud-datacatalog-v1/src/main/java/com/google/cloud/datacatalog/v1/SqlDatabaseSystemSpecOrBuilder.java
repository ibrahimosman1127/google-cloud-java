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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface SqlDatabaseSystemSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SqlDatabaseSystemSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * SQL Database Engine.
   * enum SqlEngine {
   *  UNDEFINED = 0;
   *  MY_SQL = 1;
   *  POSTGRE_SQL = 2;
   *  SQL_SERVER = 3;
   * }
   * Engine of the enclosing database instance.
   * </pre>
   *
   * <code>string sql_engine = 1;</code>
   *
   * @return The sqlEngine.
   */
  java.lang.String getSqlEngine();
  /**
   *
   *
   * <pre>
   * SQL Database Engine.
   * enum SqlEngine {
   *  UNDEFINED = 0;
   *  MY_SQL = 1;
   *  POSTGRE_SQL = 2;
   *  SQL_SERVER = 3;
   * }
   * Engine of the enclosing database instance.
   * </pre>
   *
   * <code>string sql_engine = 1;</code>
   *
   * @return The bytes for sqlEngine.
   */
  com.google.protobuf.ByteString getSqlEngineBytes();

  /**
   *
   *
   * <pre>
   * Version of the database engine.
   * </pre>
   *
   * <code>string database_version = 2;</code>
   *
   * @return The databaseVersion.
   */
  java.lang.String getDatabaseVersion();
  /**
   *
   *
   * <pre>
   * Version of the database engine.
   * </pre>
   *
   * <code>string database_version = 2;</code>
   *
   * @return The bytes for databaseVersion.
   */
  com.google.protobuf.ByteString getDatabaseVersionBytes();

  /**
   *
   *
   * <pre>
   * Host of the SQL database
   * enum InstanceHost {
   *  UNDEFINED = 0;
   *  SELF_HOSTED = 1;
   *  CLOUD_SQL = 2;
   *  AMAZON_RDS = 3;
   *  AZURE_SQL = 4;
   * }
   * Host of the enclousing database instance.
   * </pre>
   *
   * <code>string instance_host = 3;</code>
   *
   * @return The instanceHost.
   */
  java.lang.String getInstanceHost();
  /**
   *
   *
   * <pre>
   * Host of the SQL database
   * enum InstanceHost {
   *  UNDEFINED = 0;
   *  SELF_HOSTED = 1;
   *  CLOUD_SQL = 2;
   *  AMAZON_RDS = 3;
   *  AZURE_SQL = 4;
   * }
   * Host of the enclousing database instance.
   * </pre>
   *
   * <code>string instance_host = 3;</code>
   *
   * @return The bytes for instanceHost.
   */
  com.google.protobuf.ByteString getInstanceHostBytes();
}
