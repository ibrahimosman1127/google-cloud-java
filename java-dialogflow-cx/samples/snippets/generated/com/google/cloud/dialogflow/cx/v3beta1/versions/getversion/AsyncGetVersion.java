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

package com.google.cloud.dialogflow.cx.v3beta1.samples;

// [START dialogflow_v3beta1_generated_Versions_GetVersion_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.cx.v3beta1.GetVersionRequest;
import com.google.cloud.dialogflow.cx.v3beta1.Version;
import com.google.cloud.dialogflow.cx.v3beta1.VersionName;
import com.google.cloud.dialogflow.cx.v3beta1.VersionsClient;

public class AsyncGetVersion {

  public static void main(String[] args) throws Exception {
    asyncGetVersion();
  }

  public static void asyncGetVersion() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VersionsClient versionsClient = VersionsClient.create()) {
      GetVersionRequest request =
          GetVersionRequest.newBuilder()
              .setName(
                  VersionName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[VERSION]")
                      .toString())
              .build();
      ApiFuture<Version> future = versionsClient.getVersionCallable().futureCall(request);
      // Do something.
      Version response = future.get();
    }
  }
}
// [END dialogflow_v3beta1_generated_Versions_GetVersion_async]
