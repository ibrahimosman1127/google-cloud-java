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

package com.google.cloud.alloydb.v1alpha;

import static com.google.cloud.alloydb.v1alpha.AlloyDBAdminClient.ListBackupsPagedResponse;
import static com.google.cloud.alloydb.v1alpha.AlloyDBAdminClient.ListClustersPagedResponse;
import static com.google.cloud.alloydb.v1alpha.AlloyDBAdminClient.ListInstancesPagedResponse;
import static com.google.cloud.alloydb.v1alpha.AlloyDBAdminClient.ListLocationsPagedResponse;
import static com.google.cloud.alloydb.v1alpha.AlloyDBAdminClient.ListSupportedDatabaseFlagsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.alloydb.v1alpha.stub.HttpJsonAlloyDBAdminStub;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AlloyDBAdminClientHttpJsonTest {
  private static MockHttpService mockService;
  private static AlloyDBAdminClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonAlloyDBAdminStub.getMethodDescriptors(),
            AlloyDBAdminSettings.getDefaultEndpoint());
    AlloyDBAdminSettings settings =
        AlloyDBAdminSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                AlloyDBAdminSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AlloyDBAdminClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void listClustersTest() throws Exception {
    Cluster responsesElement = Cluster.newBuilder().build();
    ListClustersResponse expectedResponse =
        ListClustersResponse.newBuilder()
            .setNextPageToken("")
            .addAllClusters(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListClustersPagedResponse pagedListResponse = client.listClusters(parent);

    List<Cluster> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getClustersList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listClustersExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listClusters(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listClustersTest2() throws Exception {
    Cluster responsesElement = Cluster.newBuilder().build();
    ListClustersResponse expectedResponse =
        ListClustersResponse.newBuilder()
            .setNextPageToken("")
            .addAllClusters(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListClustersPagedResponse pagedListResponse = client.listClusters(parent);

    List<Cluster> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getClustersList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listClustersExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listClusters(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");

    Cluster actualResponse = client.getCluster(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      client.getCluster(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getClusterTest2() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";

    Cluster actualResponse = client.getCluster(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getClusterExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";
      client.getCluster(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Cluster cluster = Cluster.newBuilder().build();
    String clusterId = "clusterId561939637";

    Cluster actualResponse = client.createClusterAsync(parent, cluster, clusterId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Cluster cluster = Cluster.newBuilder().build();
      String clusterId = "clusterId561939637";
      client.createClusterAsync(parent, cluster, clusterId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createClusterTest2() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    Cluster cluster = Cluster.newBuilder().build();
    String clusterId = "clusterId561939637";

    Cluster actualResponse = client.createClusterAsync(parent, cluster, clusterId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createClusterExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Cluster cluster = Cluster.newBuilder().build();
      String clusterId = "clusterId561939637";
      client.createClusterAsync(parent, cluster, clusterId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Cluster cluster =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Cluster actualResponse = client.updateClusterAsync(cluster, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Cluster cluster =
          Cluster.newBuilder()
              .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
              .setDisplayName("displayName1714148973")
              .setUid("uid115792")
              .setCreateTime(Timestamp.newBuilder().build())
              .setUpdateTime(Timestamp.newBuilder().build())
              .setDeleteTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setDatabaseVersion(DatabaseVersion.forNumber(0))
              .setNetwork("network1843485230")
              .setEtag("etag3123477")
              .putAllAnnotations(new HashMap<String, String>())
              .setReconciling(true)
              .setInitialUser(UserPassword.newBuilder().build())
              .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
              .setSslConfig(SslConfig.newBuilder().build())
              .setEncryptionConfig(EncryptionConfig.newBuilder().build())
              .setEncryptionInfo(EncryptionInfo.newBuilder().build())
              .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
              .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
              .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
              .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateClusterAsync(cluster, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteClusterTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");

    client.deleteClusterAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      client.deleteClusterAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteClusterTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";

    client.deleteClusterAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteClusterExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";
      client.deleteClusterAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void promoteClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");

    Cluster actualResponse = client.promoteClusterAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void promoteClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName name = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      client.promoteClusterAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void promoteClusterTest2() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";

    Cluster actualResponse = client.promoteClusterAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void promoteClusterExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-6537/locations/location-6537/clusters/cluster-6537";
      client.promoteClusterAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void restoreClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("restoreClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    RestoreClusterRequest request =
        RestoreClusterRequest.newBuilder()
            .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
            .setClusterId("clusterId561939637")
            .setCluster(Cluster.newBuilder().build())
            .setRequestId("requestId693933066")
            .setValidateOnly(true)
            .build();

    Cluster actualResponse = client.restoreClusterAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void restoreClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RestoreClusterRequest request =
          RestoreClusterRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setClusterId("clusterId561939637")
              .setCluster(Cluster.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .build();
      client.restoreClusterAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createSecondaryClusterTest() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSecondaryClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Cluster cluster = Cluster.newBuilder().build();
    String clusterId = "clusterId561939637";

    Cluster actualResponse = client.createSecondaryClusterAsync(parent, cluster, clusterId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSecondaryClusterExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Cluster cluster = Cluster.newBuilder().build();
      String clusterId = "clusterId561939637";
      client.createSecondaryClusterAsync(parent, cluster, clusterId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createSecondaryClusterTest2() throws Exception {
    Cluster expectedResponse =
        Cluster.newBuilder()
            .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDatabaseVersion(DatabaseVersion.forNumber(0))
            .setNetwork("network1843485230")
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setReconciling(true)
            .setInitialUser(UserPassword.newBuilder().build())
            .setAutomatedBackupPolicy(AutomatedBackupPolicy.newBuilder().build())
            .setSslConfig(SslConfig.newBuilder().build())
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setContinuousBackupConfig(ContinuousBackupConfig.newBuilder().build())
            .setContinuousBackupInfo(ContinuousBackupInfo.newBuilder().build())
            .setSecondaryConfig(Cluster.SecondaryConfig.newBuilder().build())
            .setPrimaryConfig(Cluster.PrimaryConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSecondaryClusterTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    Cluster cluster = Cluster.newBuilder().build();
    String clusterId = "clusterId561939637";

    Cluster actualResponse = client.createSecondaryClusterAsync(parent, cluster, clusterId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSecondaryClusterExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Cluster cluster = Cluster.newBuilder().build();
      String clusterId = "clusterId561939637";
      client.createSecondaryClusterAsync(parent, cluster, clusterId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listInstancesTest() throws Exception {
    Instance responsesElement = Instance.newBuilder().build();
    ListInstancesResponse expectedResponse =
        ListInstancesResponse.newBuilder()
            .setNextPageToken("")
            .addAllInstances(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");

    ListInstancesPagedResponse pagedListResponse = client.listInstances(parent);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstancesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      client.listInstances(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listInstancesTest2() throws Exception {
    Instance responsesElement = Instance.newBuilder().build();
    ListInstancesResponse expectedResponse =
        ListInstancesResponse.newBuilder()
            .setNextPageToken("")
            .addAllInstances(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";

    ListInstancesPagedResponse pagedListResponse = client.listInstances(parent);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstancesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listInstancesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
      client.listInstances(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");

    Instance actualResponse = client.getInstance(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");
      client.getInstance(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInstanceTest2() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";

    Instance actualResponse = client.getInstance(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";
      client.getInstance(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
    Instance instance = Instance.newBuilder().build();
    String instanceId = "instanceId902024336";

    Instance actualResponse = client.createInstanceAsync(parent, instance, instanceId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      Instance instance = Instance.newBuilder().build();
      String instanceId = "instanceId902024336";
      client.createInstanceAsync(parent, instance, instanceId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createInstanceTest2() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
    Instance instance = Instance.newBuilder().build();
    String instanceId = "instanceId902024336";

    Instance actualResponse = client.createInstanceAsync(parent, instance, instanceId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
      Instance instance = Instance.newBuilder().build();
      String instanceId = "instanceId902024336";
      client.createInstanceAsync(parent, instance, instanceId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createSecondaryInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSecondaryInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
    Instance instance = Instance.newBuilder().build();
    String instanceId = "instanceId902024336";

    Instance actualResponse =
        client.createSecondaryInstanceAsync(parent, instance, instanceId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSecondaryInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      Instance instance = Instance.newBuilder().build();
      String instanceId = "instanceId902024336";
      client.createSecondaryInstanceAsync(parent, instance, instanceId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createSecondaryInstanceTest2() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSecondaryInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
    Instance instance = Instance.newBuilder().build();
    String instanceId = "instanceId902024336";

    Instance actualResponse =
        client.createSecondaryInstanceAsync(parent, instance, instanceId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSecondaryInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
      Instance instance = Instance.newBuilder().build();
      String instanceId = "instanceId902024336";
      client.createSecondaryInstanceAsync(parent, instance, instanceId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void batchCreateInstancesTest() throws Exception {
    BatchCreateInstancesResponse expectedResponse =
        BatchCreateInstancesResponse.newBuilder()
            .addAllInstances(new ArrayList<Instance>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateInstancesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BatchCreateInstancesRequest request =
        BatchCreateInstancesRequest.newBuilder()
            .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setRequests(CreateInstanceRequests.newBuilder().build())
            .setRequestId("requestId693933066")
            .build();

    BatchCreateInstancesResponse actualResponse = client.batchCreateInstancesAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchCreateInstancesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BatchCreateInstancesRequest request =
          BatchCreateInstancesRequest.newBuilder()
              .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
              .setRequests(CreateInstanceRequests.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      client.batchCreateInstancesAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Instance instance =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Instance actualResponse = client.updateInstanceAsync(instance, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Instance instance =
          Instance.newBuilder()
              .setName(
                  InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
              .setDisplayName("displayName1714148973")
              .setUid("uid115792")
              .setCreateTime(Timestamp.newBuilder().build())
              .setUpdateTime(Timestamp.newBuilder().build())
              .setDeleteTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setMachineConfig(Instance.MachineConfig.newBuilder().build())
              .setGceZone("gceZone-146048427")
              .putAllDatabaseFlags(new HashMap<String, String>())
              .setWritableNode(Instance.Node.newBuilder().build())
              .addAllNodes(new ArrayList<Instance.Node>())
              .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
              .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
              .setIpAddress("ipAddress1634032845")
              .setReconciling(true)
              .setEtag("etag3123477")
              .putAllAnnotations(new HashMap<String, String>())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateInstanceAsync(instance, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteInstanceTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");

    client.deleteInstanceAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");
      client.deleteInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteInstanceTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";

    client.deleteInstanceAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";
      client.deleteInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void failoverInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("failoverInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");

    Instance actualResponse = client.failoverInstanceAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void failoverInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");
      client.failoverInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void failoverInstanceTest2() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("failoverInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";

    Instance actualResponse = client.failoverInstanceAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void failoverInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";
      client.failoverInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void restartInstanceTest() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("restartInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");

    Instance actualResponse = client.restartInstanceAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void restartInstanceExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");
      client.restartInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void restartInstanceTest2() throws Exception {
    Instance expectedResponse =
        Instance.newBuilder()
            .setName(
                InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setMachineConfig(Instance.MachineConfig.newBuilder().build())
            .setGceZone("gceZone-146048427")
            .putAllDatabaseFlags(new HashMap<String, String>())
            .setWritableNode(Instance.Node.newBuilder().build())
            .addAllNodes(new ArrayList<Instance.Node>())
            .setQueryInsightsConfig(Instance.QueryInsightsInstanceConfig.newBuilder().build())
            .setReadPoolConfig(Instance.ReadPoolConfig.newBuilder().build())
            .setIpAddress("ipAddress1634032845")
            .setReconciling(true)
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("restartInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";

    Instance actualResponse = client.restartInstanceAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void restartInstanceExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-867/locations/location-867/clusters/cluster-867/instances/instance-867";
      client.restartInstanceAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listBackupsTest() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupsTest2() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]");

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]");
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-1607/locations/location-1607/backups/backup-1607";

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1607/locations/location-1607/backups/backup-1607";
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Backup backup = Backup.newBuilder().build();
    String backupId = "backupId2121930365";

    Backup actualResponse = client.createBackupAsync(parent, backup, backupId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Backup backup = Backup.newBuilder().build();
      String backupId = "backupId2121930365";
      client.createBackupAsync(parent, backup, backupId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    Backup backup = Backup.newBuilder().build();
    String backupId = "backupId2121930365";

    Backup actualResponse = client.createBackupAsync(parent, backup, backupId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Backup backup = Backup.newBuilder().build();
      String backupId = "backupId2121930365";
      client.createBackupAsync(parent, backup, backupId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Backup backup =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
            .setDisplayName("displayName1714148973")
            .setUid("uid115792")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setClusterUid("clusterUid240271350")
            .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
            .setReconciling(true)
            .setEncryptionConfig(EncryptionConfig.newBuilder().build())
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setEtag("etag3123477")
            .putAllAnnotations(new HashMap<String, String>())
            .setSizeBytes(-1796325715)
            .setExpiryTime(Timestamp.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Backup actualResponse = client.updateBackupAsync(backup, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Backup backup =
          Backup.newBuilder()
              .setName(BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]").toString())
              .setDisplayName("displayName1714148973")
              .setUid("uid115792")
              .setCreateTime(Timestamp.newBuilder().build())
              .setUpdateTime(Timestamp.newBuilder().build())
              .setDeleteTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setDescription("description-1724546052")
              .setClusterUid("clusterUid240271350")
              .setClusterName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
              .setReconciling(true)
              .setEncryptionConfig(EncryptionConfig.newBuilder().build())
              .setEncryptionInfo(EncryptionInfo.newBuilder().build())
              .setEtag("etag3123477")
              .putAllAnnotations(new HashMap<String, String>())
              .setSizeBytes(-1796325715)
              .setExpiryTime(Timestamp.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateBackupAsync(backup, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]");

    client.deleteBackupAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP]");
      client.deleteBackupAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1607/locations/location-1607/backups/backup-1607";

    client.deleteBackupAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1607/locations/location-1607/backups/backup-1607";
      client.deleteBackupAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listSupportedDatabaseFlagsTest() throws Exception {
    SupportedDatabaseFlag responsesElement = SupportedDatabaseFlag.newBuilder().build();
    ListSupportedDatabaseFlagsResponse expectedResponse =
        ListSupportedDatabaseFlagsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSupportedDatabaseFlags(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListSupportedDatabaseFlagsPagedResponse pagedListResponse =
        client.listSupportedDatabaseFlags(parent);

    List<SupportedDatabaseFlag> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSupportedDatabaseFlagsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listSupportedDatabaseFlagsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listSupportedDatabaseFlags(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSupportedDatabaseFlagsTest2() throws Exception {
    SupportedDatabaseFlag responsesElement = SupportedDatabaseFlag.newBuilder().build();
    ListSupportedDatabaseFlagsResponse expectedResponse =
        ListSupportedDatabaseFlagsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSupportedDatabaseFlags(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListSupportedDatabaseFlagsPagedResponse pagedListResponse =
        client.listSupportedDatabaseFlags(parent);

    List<SupportedDatabaseFlag> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSupportedDatabaseFlagsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listSupportedDatabaseFlagsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listSupportedDatabaseFlags(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateClientCertificateTest() throws Exception {
    GenerateClientCertificateResponse expectedResponse =
        GenerateClientCertificateResponse.newBuilder()
            .setPemCertificate("pemCertificate153491807")
            .addAllPemCertificateChain(new ArrayList<String>())
            .build();
    mockService.addResponse(expectedResponse);

    ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");

    GenerateClientCertificateResponse actualResponse = client.generateClientCertificate(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void generateClientCertificateExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]");
      client.generateClientCertificate(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateClientCertificateTest2() throws Exception {
    GenerateClientCertificateResponse expectedResponse =
        GenerateClientCertificateResponse.newBuilder()
            .setPemCertificate("pemCertificate153491807")
            .addAllPemCertificateChain(new ArrayList<String>())
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";

    GenerateClientCertificateResponse actualResponse = client.generateClientCertificate(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void generateClientCertificateExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-9466/locations/location-9466/clusters/cluster-9466";
      client.generateClientCertificate(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConnectionInfoTest() throws Exception {
    ConnectionInfo expectedResponse =
        ConnectionInfo.newBuilder()
            .setName("name3373707")
            .setIpAddress("ipAddress1634032845")
            .addAllPemCertificateChain(new ArrayList<String>())
            .setInstanceUid("instanceUid-2102004869")
            .build();
    mockService.addResponse(expectedResponse);

    InstanceName parent = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");

    ConnectionInfo actualResponse = client.getConnectionInfo(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getConnectionInfoExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      InstanceName parent = InstanceName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[INSTANCE]");
      client.getConnectionInfo(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConnectionInfoTest2() throws Exception {
    ConnectionInfo expectedResponse =
        ConnectionInfo.newBuilder()
            .setName("name3373707")
            .setIpAddress("ipAddress1634032845")
            .addAllPemCertificateChain(new ArrayList<String>())
            .setInstanceUid("instanceUid-2102004869")
            .build();
    mockService.addResponse(expectedResponse);

    String parent =
        "projects/project-9084/locations/location-9084/clusters/cluster-9084/instances/instance-9084";

    ConnectionInfo actualResponse = client.getConnectionInfo(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getConnectionInfoExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent =
          "projects/project-9084/locations/location-9084/clusters/cluster-9084/instances/instance-9084";
      client.getConnectionInfo(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
