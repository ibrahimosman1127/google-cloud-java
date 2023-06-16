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
// source: google/cloud/websecurityscanner/v1beta/scan_config_error.proto

package com.google.cloud.websecurityscanner.v1beta;

public final class ScanConfigErrorProto {
  private ScanConfigErrorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfigError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanConfigError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/websecurityscanner/v1beta"
          + "/scan_config_error.proto\022&google.cloud.w"
          + "ebsecurityscanner.v1beta\"\355\013\n\017ScanConfigE"
          + "rror\022J\n\004code\030\001 \001(\0162<.google.cloud.websec"
          + "urityscanner.v1beta.ScanConfigError.Code"
          + "\022\022\n\nfield_name\030\002 \001(\t\"\371\n\n\004Code\022\024\n\020CODE_UN"
          + "SPECIFIED\020\000\022\006\n\002OK\020\000\022\022\n\016INTERNAL_ERROR\020\001\022"
          + "\037\n\033APPENGINE_API_BACKEND_ERROR\020\002\022 \n\034APPE"
          + "NGINE_API_NOT_ACCESSIBLE\020\003\022\"\n\036APPENGINE_"
          + "DEFAULT_HOST_MISSING\020\004\022!\n\035CANNOT_USE_GOO"
          + "GLE_COM_ACCOUNT\020\006\022\034\n\030CANNOT_USE_OWNER_AC"
          + "COUNT\020\007\022\035\n\031COMPUTE_API_BACKEND_ERROR\020\010\022\036"
          + "\n\032COMPUTE_API_NOT_ACCESSIBLE\020\t\0227\n3CUSTOM"
          + "_LOGIN_URL_DOES_NOT_BELONG_TO_CURRENT_PR"
          + "OJECT\020\n\022\036\n\032CUSTOM_LOGIN_URL_MALFORMED\020\013\022"
          + "3\n/CUSTOM_LOGIN_URL_MAPPED_TO_NON_ROUTAB"
          + "LE_ADDRESS\020\014\0221\n-CUSTOM_LOGIN_URL_MAPPED_"
          + "TO_UNRESERVED_ADDRESS\020\r\0220\n,CUSTOM_LOGIN_"
          + "URL_HAS_NON_ROUTABLE_IP_ADDRESS\020\016\022.\n*CUS"
          + "TOM_LOGIN_URL_HAS_UNRESERVED_IP_ADDRESS\020"
          + "\017\022\027\n\023DUPLICATE_SCAN_NAME\020\020\022\027\n\023INVALID_FI"
          + "ELD_VALUE\020\022\022$\n FAILED_TO_AUTHENTICATE_TO"
          + "_TARGET\020\023\022\034\n\030FINDING_TYPE_UNSPECIFIED\020\024\022"
          + "\035\n\031FORBIDDEN_TO_SCAN_COMPUTE\020\025\022$\n FORBID"
          + "DEN_UPDATE_TO_MANAGED_SCAN\020+\022\024\n\020MALFORME"
          + "D_FILTER\020\026\022\033\n\027MALFORMED_RESOURCE_NAME\020\027\022"
          + "\024\n\020PROJECT_INACTIVE\020\030\022\022\n\016REQUIRED_FIELD\020"
          + "\031\022\036\n\032RESOURCE_NAME_INCONSISTENT\020\032\022\030\n\024SCA"
          + "N_ALREADY_RUNNING\020\033\022\024\n\020SCAN_NOT_RUNNING\020"
          + "\034\022/\n+SEED_URL_DOES_NOT_BELONG_TO_CURRENT"
          + "_PROJECT\020\035\022\026\n\022SEED_URL_MALFORMED\020\036\022+\n\'SE"
          + "ED_URL_MAPPED_TO_NON_ROUTABLE_ADDRESS\020\037\022"
          + ")\n%SEED_URL_MAPPED_TO_UNRESERVED_ADDRESS"
          + "\020 \022(\n$SEED_URL_HAS_NON_ROUTABLE_IP_ADDRE"
          + "SS\020!\022&\n\"SEED_URL_HAS_UNRESERVED_IP_ADDRE"
          + "SS\020#\022\"\n\036SERVICE_ACCOUNT_NOT_CONFIGURED\020$"
          + "\022\022\n\016TOO_MANY_SCANS\020%\022\"\n\036UNABLE_TO_RESOLV"
          + "E_PROJECT_INFO\020&\022(\n$UNSUPPORTED_BLACKLIS"
          + "T_PATTERN_FORMAT\020\'\022\026\n\022UNSUPPORTED_FILTER"
          + "\020(\022\034\n\030UNSUPPORTED_FINDING_TYPE\020)\022\032\n\026UNSU"
          + "PPORTED_URL_SCHEME\020*\032\002\020\001B\236\002\n*com.google."
          + "cloud.websecurityscanner.v1betaB\024ScanCon"
          + "figErrorProtoP\001ZZcloud.google.com/go/web"
          + "securityscanner/apiv1beta/websecuritysca"
          + "nnerpb;websecurityscannerpb\252\002&Google.Clo"
          + "ud.WebSecurityScanner.V1Beta\312\002&Google\\Cl"
          + "oud\\WebSecurityScanner\\V1beta\352\002)Google::"
          + "Cloud::WebSecurityScanner::V1betab\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfigError_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanConfigError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanConfigError_descriptor,
            new java.lang.String[] {
              "Code", "FieldName",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
