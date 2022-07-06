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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface ClusterUpdateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ClusterUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the nodes to (typically an
   * upgrade).
   * Users may specify either explicit versions offered by
   * Kubernetes Engine or version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string desired_node_version = 4;</code>
   *
   * @return The desiredNodeVersion.
   */
  java.lang.String getDesiredNodeVersion();
  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the nodes to (typically an
   * upgrade).
   * Users may specify either explicit versions offered by
   * Kubernetes Engine or version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the Kubernetes master version
   * </pre>
   *
   * <code>string desired_node_version = 4;</code>
   *
   * @return The bytes for desiredNodeVersion.
   */
  com.google.protobuf.ByteString getDesiredNodeVersionBytes();

  /**
   *
   *
   * <pre>
   * The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring
   * service with a Kubernetes-native resource model
   * * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   *   longer available as of GKE 1.15).
   * * `none` - No metrics will be exported from the cluster.
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string desired_monitoring_service = 5;</code>
   *
   * @return The desiredMonitoringService.
   */
  java.lang.String getDesiredMonitoringService();
  /**
   *
   *
   * <pre>
   * The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring
   * service with a Kubernetes-native resource model
   * * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no
   *   longer available as of GKE 1.15).
   * * `none` - No metrics will be exported from the cluster.
   * If left as an empty string,`monitoring.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string desired_monitoring_service = 5;</code>
   *
   * @return The bytes for desiredMonitoringService.
   */
  com.google.protobuf.ByteString getDesiredMonitoringServiceBytes();

  /**
   *
   *
   * <pre>
   * Configurations for the various addons available to run in the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AddonsConfig desired_addons_config = 6;</code>
   *
   * @return Whether the desiredAddonsConfig field is set.
   */
  boolean hasDesiredAddonsConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the various addons available to run in the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AddonsConfig desired_addons_config = 6;</code>
   *
   * @return The desiredAddonsConfig.
   */
  com.google.container.v1.AddonsConfig getDesiredAddonsConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the various addons available to run in the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AddonsConfig desired_addons_config = 6;</code>
   */
  com.google.container.v1.AddonsConfigOrBuilder getDesiredAddonsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The node pool to be upgraded. This field is mandatory if
   * "desired_node_version", "desired_image_family" or
   * "desired_node_pool_autoscaling" is specified and there is more than one
   * node pool on the cluster.
   * </pre>
   *
   * <code>string desired_node_pool_id = 7;</code>
   *
   * @return The desiredNodePoolId.
   */
  java.lang.String getDesiredNodePoolId();
  /**
   *
   *
   * <pre>
   * The node pool to be upgraded. This field is mandatory if
   * "desired_node_version", "desired_image_family" or
   * "desired_node_pool_autoscaling" is specified and there is more than one
   * node pool on the cluster.
   * </pre>
   *
   * <code>string desired_node_pool_id = 7;</code>
   *
   * @return The bytes for desiredNodePoolId.
   */
  com.google.protobuf.ByteString getDesiredNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * The desired image type for the node pool.
   * NOTE: Set the "desired_node_pool" field as well.
   * </pre>
   *
   * <code>string desired_image_type = 8;</code>
   *
   * @return The desiredImageType.
   */
  java.lang.String getDesiredImageType();
  /**
   *
   *
   * <pre>
   * The desired image type for the node pool.
   * NOTE: Set the "desired_node_pool" field as well.
   * </pre>
   *
   * <code>string desired_image_type = 8;</code>
   *
   * @return The bytes for desiredImageType.
   */
  com.google.protobuf.ByteString getDesiredImageTypeBytes();

  /**
   *
   *
   * <pre>
   * Configuration of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1.DatabaseEncryption desired_database_encryption = 46;</code>
   *
   * @return Whether the desiredDatabaseEncryption field is set.
   */
  boolean hasDesiredDatabaseEncryption();
  /**
   *
   *
   * <pre>
   * Configuration of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1.DatabaseEncryption desired_database_encryption = 46;</code>
   *
   * @return The desiredDatabaseEncryption.
   */
  com.google.container.v1.DatabaseEncryption getDesiredDatabaseEncryption();
  /**
   *
   *
   * <pre>
   * Configuration of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1.DatabaseEncryption desired_database_encryption = 46;</code>
   */
  com.google.container.v1.DatabaseEncryptionOrBuilder getDesiredDatabaseEncryptionOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for Workload Identity.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadIdentityConfig desired_workload_identity_config = 47;</code>
   *
   * @return Whether the desiredWorkloadIdentityConfig field is set.
   */
  boolean hasDesiredWorkloadIdentityConfig();
  /**
   *
   *
   * <pre>
   * Configuration for Workload Identity.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadIdentityConfig desired_workload_identity_config = 47;</code>
   *
   * @return The desiredWorkloadIdentityConfig.
   */
  com.google.container.v1.WorkloadIdentityConfig getDesiredWorkloadIdentityConfig();
  /**
   *
   *
   * <pre>
   * Configuration for Workload Identity.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadIdentityConfig desired_workload_identity_config = 47;</code>
   */
  com.google.container.v1.WorkloadIdentityConfigOrBuilder
      getDesiredWorkloadIdentityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for issuance of mTLS keys and certificates to Kubernetes
   * pods.
   * </pre>
   *
   * <code>.google.container.v1.MeshCertificates desired_mesh_certificates = 67;</code>
   *
   * @return Whether the desiredMeshCertificates field is set.
   */
  boolean hasDesiredMeshCertificates();
  /**
   *
   *
   * <pre>
   * Configuration for issuance of mTLS keys and certificates to Kubernetes
   * pods.
   * </pre>
   *
   * <code>.google.container.v1.MeshCertificates desired_mesh_certificates = 67;</code>
   *
   * @return The desiredMeshCertificates.
   */
  com.google.container.v1.MeshCertificates getDesiredMeshCertificates();
  /**
   *
   *
   * <pre>
   * Configuration for issuance of mTLS keys and certificates to Kubernetes
   * pods.
   * </pre>
   *
   * <code>.google.container.v1.MeshCertificates desired_mesh_certificates = 67;</code>
   */
  com.google.container.v1.MeshCertificatesOrBuilder getDesiredMeshCertificatesOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for Shielded Nodes.
   * </pre>
   *
   * <code>.google.container.v1.ShieldedNodes desired_shielded_nodes = 48;</code>
   *
   * @return Whether the desiredShieldedNodes field is set.
   */
  boolean hasDesiredShieldedNodes();
  /**
   *
   *
   * <pre>
   * Configuration for Shielded Nodes.
   * </pre>
   *
   * <code>.google.container.v1.ShieldedNodes desired_shielded_nodes = 48;</code>
   *
   * @return The desiredShieldedNodes.
   */
  com.google.container.v1.ShieldedNodes getDesiredShieldedNodes();
  /**
   *
   *
   * <pre>
   * Configuration for Shielded Nodes.
   * </pre>
   *
   * <code>.google.container.v1.ShieldedNodes desired_shielded_nodes = 48;</code>
   */
  com.google.container.v1.ShieldedNodesOrBuilder getDesiredShieldedNodesOrBuilder();

  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig desired_dns_config = 53;</code>
   *
   * @return Whether the desiredDnsConfig field is set.
   */
  boolean hasDesiredDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig desired_dns_config = 53;</code>
   *
   * @return The desiredDnsConfig.
   */
  com.google.container.v1.DNSConfig getDesiredDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig desired_dns_config = 53;</code>
   */
  com.google.container.v1.DNSConfigOrBuilder getDesiredDnsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Autoscaler configuration for the node pool specified in
   * desired_node_pool_id. If there is only one pool in the
   * cluster and desired_node_pool_id is not provided then
   * the change applies to that single node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling desired_node_pool_autoscaling = 9;</code>
   *
   * @return Whether the desiredNodePoolAutoscaling field is set.
   */
  boolean hasDesiredNodePoolAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for the node pool specified in
   * desired_node_pool_id. If there is only one pool in the
   * cluster and desired_node_pool_id is not provided then
   * the change applies to that single node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling desired_node_pool_autoscaling = 9;</code>
   *
   * @return The desiredNodePoolAutoscaling.
   */
  com.google.container.v1.NodePoolAutoscaling getDesiredNodePoolAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for the node pool specified in
   * desired_node_pool_id. If there is only one pool in the
   * cluster and desired_node_pool_id is not provided then
   * the change applies to that single node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling desired_node_pool_autoscaling = 9;</code>
   */
  com.google.container.v1.NodePoolAutoscalingOrBuilder getDesiredNodePoolAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster's nodes should be located.
   * This list must always include the cluster's primary zone.
   * Warning: changing cluster locations will update the locations of all node
   * pools and will result in nodes being added and/or removed.
   * </pre>
   *
   * <code>repeated string desired_locations = 10;</code>
   *
   * @return A list containing the desiredLocations.
   */
  java.util.List<java.lang.String> getDesiredLocationsList();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster's nodes should be located.
   * This list must always include the cluster's primary zone.
   * Warning: changing cluster locations will update the locations of all node
   * pools and will result in nodes being added and/or removed.
   * </pre>
   *
   * <code>repeated string desired_locations = 10;</code>
   *
   * @return The count of desiredLocations.
   */
  int getDesiredLocationsCount();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster's nodes should be located.
   * This list must always include the cluster's primary zone.
   * Warning: changing cluster locations will update the locations of all node
   * pools and will result in nodes being added and/or removed.
   * </pre>
   *
   * <code>repeated string desired_locations = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The desiredLocations at the given index.
   */
  java.lang.String getDesiredLocations(int index);
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster's nodes should be located.
   * This list must always include the cluster's primary zone.
   * Warning: changing cluster locations will update the locations of all node
   * pools and will result in nodes being added and/or removed.
   * </pre>
   *
   * <code>repeated string desired_locations = 10;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the desiredLocations at the given index.
   */
  com.google.protobuf.ByteString getDesiredLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * The desired configuration options for master authorized networks feature.
   * </pre>
   *
   * <code>
   * .google.container.v1.MasterAuthorizedNetworksConfig desired_master_authorized_networks_config = 12;
   * </code>
   *
   * @return Whether the desiredMasterAuthorizedNetworksConfig field is set.
   */
  boolean hasDesiredMasterAuthorizedNetworksConfig();
  /**
   *
   *
   * <pre>
   * The desired configuration options for master authorized networks feature.
   * </pre>
   *
   * <code>
   * .google.container.v1.MasterAuthorizedNetworksConfig desired_master_authorized_networks_config = 12;
   * </code>
   *
   * @return The desiredMasterAuthorizedNetworksConfig.
   */
  com.google.container.v1.MasterAuthorizedNetworksConfig getDesiredMasterAuthorizedNetworksConfig();
  /**
   *
   *
   * <pre>
   * The desired configuration options for master authorized networks feature.
   * </pre>
   *
   * <code>
   * .google.container.v1.MasterAuthorizedNetworksConfig desired_master_authorized_networks_config = 12;
   * </code>
   */
  com.google.container.v1.MasterAuthorizedNetworksConfigOrBuilder
      getDesiredMasterAuthorizedNetworksConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Cluster-level autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.ClusterAutoscaling desired_cluster_autoscaling = 15;</code>
   *
   * @return Whether the desiredClusterAutoscaling field is set.
   */
  boolean hasDesiredClusterAutoscaling();
  /**
   *
   *
   * <pre>
   * Cluster-level autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.ClusterAutoscaling desired_cluster_autoscaling = 15;</code>
   *
   * @return The desiredClusterAutoscaling.
   */
  com.google.container.v1.ClusterAutoscaling getDesiredClusterAutoscaling();
  /**
   *
   *
   * <pre>
   * Cluster-level autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.ClusterAutoscaling desired_cluster_autoscaling = 15;</code>
   */
  com.google.container.v1.ClusterAutoscalingOrBuilder getDesiredClusterAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired configuration options for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.container.v1.BinaryAuthorization desired_binary_authorization = 16;</code>
   *
   * @return Whether the desiredBinaryAuthorization field is set.
   */
  boolean hasDesiredBinaryAuthorization();
  /**
   *
   *
   * <pre>
   * The desired configuration options for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.container.v1.BinaryAuthorization desired_binary_authorization = 16;</code>
   *
   * @return The desiredBinaryAuthorization.
   */
  com.google.container.v1.BinaryAuthorization getDesiredBinaryAuthorization();
  /**
   *
   *
   * <pre>
   * The desired configuration options for the Binary Authorization feature.
   * </pre>
   *
   * <code>.google.container.v1.BinaryAuthorization desired_binary_authorization = 16;</code>
   */
  com.google.container.v1.BinaryAuthorizationOrBuilder getDesiredBinaryAuthorizationOrBuilder();

  /**
   *
   *
   * <pre>
   * The logging service the cluster should use to write logs.
   * Currently available options:
   * * `logging.googleapis.com/kubernetes` - The Cloud Logging
   * service with a Kubernetes-native resource model
   * * `logging.googleapis.com` - The legacy Cloud Logging service (no longer
   *   available as of GKE 1.15).
   * * `none` - no logs will be exported from the cluster.
   * If left as an empty string,`logging.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string desired_logging_service = 19;</code>
   *
   * @return The desiredLoggingService.
   */
  java.lang.String getDesiredLoggingService();
  /**
   *
   *
   * <pre>
   * The logging service the cluster should use to write logs.
   * Currently available options:
   * * `logging.googleapis.com/kubernetes` - The Cloud Logging
   * service with a Kubernetes-native resource model
   * * `logging.googleapis.com` - The legacy Cloud Logging service (no longer
   *   available as of GKE 1.15).
   * * `none` - no logs will be exported from the cluster.
   * If left as an empty string,`logging.googleapis.com/kubernetes` will be
   * used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
   * </pre>
   *
   * <code>string desired_logging_service = 19;</code>
   *
   * @return The bytes for desiredLoggingService.
   */
  com.google.protobuf.ByteString getDesiredLoggingServiceBytes();

  /**
   *
   *
   * <pre>
   * The desired configuration for exporting resource usage.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig desired_resource_usage_export_config = 21;
   * </code>
   *
   * @return Whether the desiredResourceUsageExportConfig field is set.
   */
  boolean hasDesiredResourceUsageExportConfig();
  /**
   *
   *
   * <pre>
   * The desired configuration for exporting resource usage.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig desired_resource_usage_export_config = 21;
   * </code>
   *
   * @return The desiredResourceUsageExportConfig.
   */
  com.google.container.v1.ResourceUsageExportConfig getDesiredResourceUsageExportConfig();
  /**
   *
   *
   * <pre>
   * The desired configuration for exporting resource usage.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig desired_resource_usage_export_config = 21;
   * </code>
   */
  com.google.container.v1.ResourceUsageExportConfigOrBuilder
      getDesiredResourceUsageExportConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Cluster-level Vertical Pod Autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.VerticalPodAutoscaling desired_vertical_pod_autoscaling = 22;</code>
   *
   * @return Whether the desiredVerticalPodAutoscaling field is set.
   */
  boolean hasDesiredVerticalPodAutoscaling();
  /**
   *
   *
   * <pre>
   * Cluster-level Vertical Pod Autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.VerticalPodAutoscaling desired_vertical_pod_autoscaling = 22;</code>
   *
   * @return The desiredVerticalPodAutoscaling.
   */
  com.google.container.v1.VerticalPodAutoscaling getDesiredVerticalPodAutoscaling();
  /**
   *
   *
   * <pre>
   * Cluster-level Vertical Pod Autoscaling configuration.
   * </pre>
   *
   * <code>.google.container.v1.VerticalPodAutoscaling desired_vertical_pod_autoscaling = 22;</code>
   */
  com.google.container.v1.VerticalPodAutoscalingOrBuilder
      getDesiredVerticalPodAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired private cluster configuration.
   * </pre>
   *
   * <code>.google.container.v1.PrivateClusterConfig desired_private_cluster_config = 25;</code>
   *
   * @return Whether the desiredPrivateClusterConfig field is set.
   */
  boolean hasDesiredPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * The desired private cluster configuration.
   * </pre>
   *
   * <code>.google.container.v1.PrivateClusterConfig desired_private_cluster_config = 25;</code>
   *
   * @return The desiredPrivateClusterConfig.
   */
  com.google.container.v1.PrivateClusterConfig getDesiredPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * The desired private cluster configuration.
   * </pre>
   *
   * <code>.google.container.v1.PrivateClusterConfig desired_private_cluster_config = 25;</code>
   */
  com.google.container.v1.PrivateClusterConfigOrBuilder getDesiredPrivateClusterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired config of Intra-node visibility.
   * </pre>
   *
   * <code>.google.container.v1.IntraNodeVisibilityConfig desired_intra_node_visibility_config = 26;
   * </code>
   *
   * @return Whether the desiredIntraNodeVisibilityConfig field is set.
   */
  boolean hasDesiredIntraNodeVisibilityConfig();
  /**
   *
   *
   * <pre>
   * The desired config of Intra-node visibility.
   * </pre>
   *
   * <code>.google.container.v1.IntraNodeVisibilityConfig desired_intra_node_visibility_config = 26;
   * </code>
   *
   * @return The desiredIntraNodeVisibilityConfig.
   */
  com.google.container.v1.IntraNodeVisibilityConfig getDesiredIntraNodeVisibilityConfig();
  /**
   *
   *
   * <pre>
   * The desired config of Intra-node visibility.
   * </pre>
   *
   * <code>.google.container.v1.IntraNodeVisibilityConfig desired_intra_node_visibility_config = 26;
   * </code>
   */
  com.google.container.v1.IntraNodeVisibilityConfigOrBuilder
      getDesiredIntraNodeVisibilityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired status of whether to disable default sNAT for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus desired_default_snat_status = 28;</code>
   *
   * @return Whether the desiredDefaultSnatStatus field is set.
   */
  boolean hasDesiredDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * The desired status of whether to disable default sNAT for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus desired_default_snat_status = 28;</code>
   *
   * @return The desiredDefaultSnatStatus.
   */
  com.google.container.v1.DefaultSnatStatus getDesiredDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * The desired status of whether to disable default sNAT for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus desired_default_snat_status = 28;</code>
   */
  com.google.container.v1.DefaultSnatStatusOrBuilder getDesiredDefaultSnatStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired release channel configuration.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel desired_release_channel = 31;</code>
   *
   * @return Whether the desiredReleaseChannel field is set.
   */
  boolean hasDesiredReleaseChannel();
  /**
   *
   *
   * <pre>
   * The desired release channel configuration.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel desired_release_channel = 31;</code>
   *
   * @return The desiredReleaseChannel.
   */
  com.google.container.v1.ReleaseChannel getDesiredReleaseChannel();
  /**
   *
   *
   * <pre>
   * The desired release channel configuration.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel desired_release_channel = 31;</code>
   */
  com.google.container.v1.ReleaseChannelOrBuilder getDesiredReleaseChannelOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * </pre>
   *
   * <code>.google.container.v1.ILBSubsettingConfig desired_l4ilb_subsetting_config = 39;</code>
   *
   * @return Whether the desiredL4ilbSubsettingConfig field is set.
   */
  boolean hasDesiredL4IlbSubsettingConfig();
  /**
   *
   *
   * <pre>
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * </pre>
   *
   * <code>.google.container.v1.ILBSubsettingConfig desired_l4ilb_subsetting_config = 39;</code>
   *
   * @return The desiredL4ilbSubsettingConfig.
   */
  com.google.container.v1.ILBSubsettingConfig getDesiredL4IlbSubsettingConfig();
  /**
   *
   *
   * <pre>
   * The desired L4 Internal Load Balancer Subsetting configuration.
   * </pre>
   *
   * <code>.google.container.v1.ILBSubsettingConfig desired_l4ilb_subsetting_config = 39;</code>
   */
  com.google.container.v1.ILBSubsettingConfigOrBuilder getDesiredL4IlbSubsettingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired datapath provider for the cluster.
   * </pre>
   *
   * <code>.google.container.v1.DatapathProvider desired_datapath_provider = 50;</code>
   *
   * @return The enum numeric value on the wire for desiredDatapathProvider.
   */
  int getDesiredDatapathProviderValue();
  /**
   *
   *
   * <pre>
   * The desired datapath provider for the cluster.
   * </pre>
   *
   * <code>.google.container.v1.DatapathProvider desired_datapath_provider = 50;</code>
   *
   * @return The desiredDatapathProvider.
   */
  com.google.container.v1.DatapathProvider getDesiredDatapathProvider();

  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * </pre>
   *
   * <code>.google.container.v1.PrivateIPv6GoogleAccess desired_private_ipv6_google_access = 51;
   * </code>
   *
   * @return The enum numeric value on the wire for desiredPrivateIpv6GoogleAccess.
   */
  int getDesiredPrivateIpv6GoogleAccessValue();
  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * </pre>
   *
   * <code>.google.container.v1.PrivateIPv6GoogleAccess desired_private_ipv6_google_access = 51;
   * </code>
   *
   * @return The desiredPrivateIpv6GoogleAccess.
   */
  com.google.container.v1.PrivateIPv6GoogleAccess getDesiredPrivateIpv6GoogleAccess();

  /**
   *
   *
   * <pre>
   * The desired notification configuration.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig desired_notification_config = 55;</code>
   *
   * @return Whether the desiredNotificationConfig field is set.
   */
  boolean hasDesiredNotificationConfig();
  /**
   *
   *
   * <pre>
   * The desired notification configuration.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig desired_notification_config = 55;</code>
   *
   * @return The desiredNotificationConfig.
   */
  com.google.container.v1.NotificationConfig getDesiredNotificationConfig();
  /**
   *
   *
   * <pre>
   * The desired notification configuration.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig desired_notification_config = 55;</code>
   */
  com.google.container.v1.NotificationConfigOrBuilder getDesiredNotificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired authenticator groups config for the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AuthenticatorGroupsConfig desired_authenticator_groups_config = 63;
   * </code>
   *
   * @return Whether the desiredAuthenticatorGroupsConfig field is set.
   */
  boolean hasDesiredAuthenticatorGroupsConfig();
  /**
   *
   *
   * <pre>
   * The desired authenticator groups config for the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AuthenticatorGroupsConfig desired_authenticator_groups_config = 63;
   * </code>
   *
   * @return The desiredAuthenticatorGroupsConfig.
   */
  com.google.container.v1.AuthenticatorGroupsConfig getDesiredAuthenticatorGroupsConfig();
  /**
   *
   *
   * <pre>
   * The desired authenticator groups config for the cluster.
   * </pre>
   *
   * <code>.google.container.v1.AuthenticatorGroupsConfig desired_authenticator_groups_config = 63;
   * </code>
   */
  com.google.container.v1.AuthenticatorGroupsConfigOrBuilder
      getDesiredAuthenticatorGroupsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingConfig desired_logging_config = 64;</code>
   *
   * @return Whether the desiredLoggingConfig field is set.
   */
  boolean hasDesiredLoggingConfig();
  /**
   *
   *
   * <pre>
   * The desired logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingConfig desired_logging_config = 64;</code>
   *
   * @return The desiredLoggingConfig.
   */
  com.google.container.v1.LoggingConfig getDesiredLoggingConfig();
  /**
   *
   *
   * <pre>
   * The desired logging configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingConfig desired_logging_config = 64;</code>
   */
  com.google.container.v1.LoggingConfigOrBuilder getDesiredLoggingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired monitoring configuration.
   * </pre>
   *
   * <code>.google.container.v1.MonitoringConfig desired_monitoring_config = 65;</code>
   *
   * @return Whether the desiredMonitoringConfig field is set.
   */
  boolean hasDesiredMonitoringConfig();
  /**
   *
   *
   * <pre>
   * The desired monitoring configuration.
   * </pre>
   *
   * <code>.google.container.v1.MonitoringConfig desired_monitoring_config = 65;</code>
   *
   * @return The desiredMonitoringConfig.
   */
  com.google.container.v1.MonitoringConfig getDesiredMonitoringConfig();
  /**
   *
   *
   * <pre>
   * The desired monitoring configuration.
   * </pre>
   *
   * <code>.google.container.v1.MonitoringConfig desired_monitoring_config = 65;</code>
   */
  com.google.container.v1.MonitoringConfigOrBuilder getDesiredMonitoringConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired Identity Service component configuration.
   * </pre>
   *
   * <code>.google.container.v1.IdentityServiceConfig desired_identity_service_config = 66;</code>
   *
   * @return Whether the desiredIdentityServiceConfig field is set.
   */
  boolean hasDesiredIdentityServiceConfig();
  /**
   *
   *
   * <pre>
   * The desired Identity Service component configuration.
   * </pre>
   *
   * <code>.google.container.v1.IdentityServiceConfig desired_identity_service_config = 66;</code>
   *
   * @return The desiredIdentityServiceConfig.
   */
  com.google.container.v1.IdentityServiceConfig getDesiredIdentityServiceConfig();
  /**
   *
   *
   * <pre>
   * The desired Identity Service component configuration.
   * </pre>
   *
   * <code>.google.container.v1.IdentityServiceConfig desired_identity_service_config = 66;</code>
   */
  com.google.container.v1.IdentityServiceConfigOrBuilder getDesiredIdentityServiceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies the config for the use of Services with
   * ExternalIPs field.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig desired_service_external_ips_config = 60;
   * </code>
   *
   * @return Whether the desiredServiceExternalIpsConfig field is set.
   */
  boolean hasDesiredServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies the config for the use of Services with
   * ExternalIPs field.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig desired_service_external_ips_config = 60;
   * </code>
   *
   * @return The desiredServiceExternalIpsConfig.
   */
  com.google.container.v1.ServiceExternalIPsConfig getDesiredServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies the config for the use of Services with
   * ExternalIPs field.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig desired_service_external_ips_config = 60;
   * </code>
   */
  com.google.container.v1.ServiceExternalIPsConfigOrBuilder
      getDesiredServiceExternalIpsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the master to.
   * Users may specify either explicit versions offered by
   * Kubernetes Engine or version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the default Kubernetes version
   * </pre>
   *
   * <code>string desired_master_version = 100;</code>
   *
   * @return The desiredMasterVersion.
   */
  java.lang.String getDesiredMasterVersion();
  /**
   *
   *
   * <pre>
   * The Kubernetes version to change the master to.
   * Users may specify either explicit versions offered by
   * Kubernetes Engine or version aliases, which have the following behavior:
   * - "latest": picks the highest valid Kubernetes version
   * - "1.X": picks the highest valid patch+gke.N patch in the 1.X version
   * - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version
   * - "1.X.Y-gke.N": picks an explicit Kubernetes version
   * - "-": picks the default Kubernetes version
   * </pre>
   *
   * <code>string desired_master_version = 100;</code>
   *
   * @return The bytes for desiredMasterVersion.
   */
  com.google.protobuf.ByteString getDesiredMasterVersionBytes();

  /**
   *
   *
   * <pre>
   * The desired GCFS config for the cluster
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig desired_gcfs_config = 109;</code>
   *
   * @return Whether the desiredGcfsConfig field is set.
   */
  boolean hasDesiredGcfsConfig();
  /**
   *
   *
   * <pre>
   * The desired GCFS config for the cluster
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig desired_gcfs_config = 109;</code>
   *
   * @return The desiredGcfsConfig.
   */
  com.google.container.v1.GcfsConfig getDesiredGcfsConfig();
  /**
   *
   *
   * <pre>
   * The desired GCFS config for the cluster
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig desired_gcfs_config = 109;</code>
   */
  com.google.container.v1.GcfsConfigOrBuilder getDesiredGcfsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired network tags that apply to all auto-provisioned node pools
   * in autopilot clusters and node auto-provisioning enabled clusters.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags desired_node_pool_auto_config_network_tags = 110;</code>
   *
   * @return Whether the desiredNodePoolAutoConfigNetworkTags field is set.
   */
  boolean hasDesiredNodePoolAutoConfigNetworkTags();
  /**
   *
   *
   * <pre>
   * The desired network tags that apply to all auto-provisioned node pools
   * in autopilot clusters and node auto-provisioning enabled clusters.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags desired_node_pool_auto_config_network_tags = 110;</code>
   *
   * @return The desiredNodePoolAutoConfigNetworkTags.
   */
  com.google.container.v1.NetworkTags getDesiredNodePoolAutoConfigNetworkTags();
  /**
   *
   *
   * <pre>
   * The desired network tags that apply to all auto-provisioned node pools
   * in autopilot clusters and node auto-provisioning enabled clusters.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags desired_node_pool_auto_config_network_tags = 110;</code>
   */
  com.google.container.v1.NetworkTagsOrBuilder getDesiredNodePoolAutoConfigNetworkTagsOrBuilder();
}
