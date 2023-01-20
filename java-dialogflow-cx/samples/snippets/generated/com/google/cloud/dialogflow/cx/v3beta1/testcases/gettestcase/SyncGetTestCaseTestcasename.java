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

// [START dialogflow_v3beta1_generated_TestCases_GetTestCase_Testcasename_sync]
import com.google.cloud.dialogflow.cx.v3beta1.TestCase;
import com.google.cloud.dialogflow.cx.v3beta1.TestCaseName;
import com.google.cloud.dialogflow.cx.v3beta1.TestCasesClient;

public class SyncGetTestCaseTestcasename {

  public static void main(String[] args) throws Exception {
    syncGetTestCaseTestcasename();
  }

  public static void syncGetTestCaseTestcasename() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TestCasesClient testCasesClient = TestCasesClient.create()) {
      TestCaseName name = TestCaseName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[TEST_CASE]");
      TestCase response = testCasesClient.getTestCase(name);
    }
  }
}
// [END dialogflow_v3beta1_generated_TestCases_GetTestCase_Testcasename_sync]
