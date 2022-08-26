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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1beta1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1beta1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Whether Intra-node visibility is enabled for this cluster.
   * This makes same node pod to pod traffic visible for VPC network.
   * </pre>
   *
   * <code>bool enable_intra_node_visibility = 5;</code>
   *
   * @return The enableIntraNodeVisibility.
   */
  boolean getEnableIntraNodeVisibility();

  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   *
   * @return Whether the defaultSnatStatus field is set.
   */
  boolean hasDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   *
   * @return The defaultSnatStatus.
   */
  com.google.container.v1beta1.DefaultSnatStatus getDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultSnatStatus default_snat_status = 7;</code>
   */
  com.google.container.v1beta1.DefaultSnatStatusOrBuilder getDefaultSnatStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether L4ILB Subsetting is enabled for this cluster.
   * </pre>
   *
   * <code>bool enable_l4ilb_subsetting = 10;</code>
   *
   * @return The enableL4ilbSubsetting.
   */
  boolean getEnableL4IlbSubsetting();

  /**
   *
   *
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatapathProvider datapath_provider = 11;</code>
   *
   * @return The enum numeric value on the wire for datapathProvider.
   */
  int getDatapathProviderValue();
  /**
   *
   *
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatapathProvider datapath_provider = 11;</code>
   *
   * @return The datapathProvider.
   */
  com.google.container.v1beta1.DatapathProvider getDatapathProvider();

  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * By default, no private IPv6 access to or from Google Services (all access
   * will be via IPv4)
   * </pre>
   *
   * <code>.google.container.v1beta1.PrivateIPv6GoogleAccess private_ipv6_google_access = 12;</code>
   *
   * @return The enum numeric value on the wire for privateIpv6GoogleAccess.
   */
  int getPrivateIpv6GoogleAccessValue();
  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * By default, no private IPv6 access to or from Google Services (all access
   * will be via IPv4)
   * </pre>
   *
   * <code>.google.container.v1beta1.PrivateIPv6GoogleAccess private_ipv6_google_access = 12;</code>
   *
   * @return The privateIpv6GoogleAccess.
   */
  com.google.container.v1beta1.PrivateIPv6GoogleAccess getPrivateIpv6GoogleAccess();

  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.DNSConfig dns_config = 13;</code>
   *
   * @return Whether the dnsConfig field is set.
   */
  boolean hasDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.DNSConfig dns_config = 13;</code>
   *
   * @return The dnsConfig.
   */
  com.google.container.v1beta1.DNSConfig getDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1beta1.DNSConfig dns_config = 13;</code>
   */
  com.google.container.v1beta1.DNSConfigOrBuilder getDnsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1beta1.ServiceExternalIPsConfig service_external_ips_config = 15;
   * </code>
   *
   * @return Whether the serviceExternalIpsConfig field is set.
   */
  boolean hasServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1beta1.ServiceExternalIPsConfig service_external_ips_config = 15;
   * </code>
   *
   * @return The serviceExternalIpsConfig.
   */
  com.google.container.v1beta1.ServiceExternalIPsConfig getServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1beta1.ServiceExternalIPsConfig service_external_ips_config = 15;
   * </code>
   */
  com.google.container.v1beta1.ServiceExternalIPsConfigOrBuilder
      getServiceExternalIpsConfigOrBuilder();
}