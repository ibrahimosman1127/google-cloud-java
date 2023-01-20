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
// source: google/cloud/orgpolicy/v2/constraint.proto

package com.google.cloud.orgpolicy.v2;

public final class ConstraintProto {
  private ConstraintProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/orgpolicy/v2/constraint.p"
          + "roto\022\031google.cloud.orgpolicy.v2\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\267\005\n\nConstraint\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\024"
          + "\n\014display_name\030\002 \001(\t\022\023\n\013description\030\003 \001("
          + "\t\022S\n\022constraint_default\030\004 \001(\01627.google.c"
          + "loud.orgpolicy.v2.Constraint.ConstraintD"
          + "efault\022O\n\017list_constraint\030\005 \001(\01324.google"
          + ".cloud.orgpolicy.v2.Constraint.ListConst"
          + "raintH\000\022U\n\022boolean_constraint\030\006 \001(\01327.go"
          + "ogle.cloud.orgpolicy.v2.Constraint.Boole"
          + "anConstraintH\000\032=\n\016ListConstraint\022\023\n\013supp"
          + "orts_in\030\001 \001(\010\022\026\n\016supports_under\030\002 \001(\010\032\023\n"
          + "\021BooleanConstraint\"L\n\021ConstraintDefault\022"
          + "\"\n\036CONSTRAINT_DEFAULT_UNSPECIFIED\020\000\022\t\n\005A"
          + "LLOW\020\001\022\010\n\004DENY\020\002:\270\001\352A\264\001\n#orgpolicy.googl"
          + "eapis.com/Constraint\022+projects/{project}"
          + "/constraints/{constraint}\022)folders/{fold"
          + "er}/constraints/{constraint}\0225organizati"
          + "ons/{organization}/constraints/{constrai"
          + "nt}B\021\n\017constraint_typeB\315\001\n\035com.google.cl"
          + "oud.orgpolicy.v2B\017ConstraintProtoP\001ZBgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/orgpolicy/v2;orgpolicy\252\002\031Google.Cloud.O"
          + "rgPolicy.V2\312\002\031Google\\Cloud\\OrgPolicy\\V2\352"
          + "\002\034Google::Cloud::OrgPolicy::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "ConstraintDefault",
              "ListConstraint",
              "BooleanConstraint",
              "ConstraintType",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor,
            new java.lang.String[] {
              "SupportsIn", "SupportsUnder",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
