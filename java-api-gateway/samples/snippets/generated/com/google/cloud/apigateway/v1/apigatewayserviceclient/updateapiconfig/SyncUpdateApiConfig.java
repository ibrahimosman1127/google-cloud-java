/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.apigateway.v1.samples;

// [START apigateway_v1_generated_apigatewayserviceclient_updateapiconfig_sync]
import com.google.cloud.apigateway.v1.ApiConfig;
import com.google.cloud.apigateway.v1.ApiGatewayServiceClient;
import com.google.cloud.apigateway.v1.UpdateApiConfigRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateApiConfig {

  public static void main(String[] args) throws Exception {
    syncUpdateApiConfig();
  }

  public static void syncUpdateApiConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ApiGatewayServiceClient apiGatewayServiceClient = ApiGatewayServiceClient.create()) {
      UpdateApiConfigRequest request =
          UpdateApiConfigRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setApiConfig(ApiConfig.newBuilder().build())
              .build();
      ApiConfig response = apiGatewayServiceClient.updateApiConfigAsync(request).get();
    }
  }
}
// [END apigateway_v1_generated_apigatewayserviceclient_updateapiconfig_sync]