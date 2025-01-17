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
// source: google/maps/fleetengine/v1/trips.proto

package google.maps.fleetengine.v1;

public final class Trips {
  private Trips() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_v1_Trip_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_Trip_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_v1_StopLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_v1_StopLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/maps/fleetengine/v1/trips.proto"
          + "\022\023maps.fleetengine.v1\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032,google/maps/fleetengine/v1/fleetengin"
          + "e.proto\032(google/maps/fleetengine/v1/traf"
          + "fic.proto\032\036google/protobuf/duration.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\036goog"
          + "le/protobuf/wrappers.proto\032\030google/type/"
          + "latlng.proto\"\316\020\n\004Trip\022\022\n\004name\030\001 \001(\tB\004\342A\001"
          + "\003\022\022\n\nvehicle_id\030\002 \001(\t\0224\n\013trip_status\030\003 \001"
          + "(\0162\037.maps.fleetengine.v1.TripStatus\0220\n\tt"
          + "rip_type\030\004 \001(\0162\035.maps.fleetengine.v1.Tri"
          + "pType\022;\n\014pickup_point\030\005 \001(\0132%.maps.fleet"
          + "engine.v1.TerminalLocation\022D\n\023actual_pic"
          + "kup_point\030\026 \001(\0132!.maps.fleetengine.v1.St"
          + "opLocationB\004\342A\001\004\022L\n\033actual_pickup_arriva"
          + "l_point\030  \001(\0132!.maps.fleetengine.v1.Stop"
          + "LocationB\004\342A\001\004\0225\n\013pickup_time\030\006 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\004\342A\001\003\022H\n\031interme"
          + "diate_destinations\030\016 \003(\0132%.maps.fleeteng"
          + "ine.v1.TerminalLocation\022E\n!intermediate_"
          + "destinations_version\030\031 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022&\n\036intermediate_destinati"
          + "on_index\030\017 \001(\005\022_\n.actual_intermediate_de"
          + "stination_arrival_points\030! \003(\0132!.maps.fl"
          + "eetengine.v1.StopLocationB\004\342A\001\004\022Q\n actua"
          + "l_intermediate_destinations\030\" \003(\0132!.maps"
          + ".fleetengine.v1.StopLocationB\004\342A\001\004\022<\n\rdr"
          + "opoff_point\030\007 \001(\0132%.maps.fleetengine.v1."
          + "TerminalLocation\022E\n\024actual_dropoff_point"
          + "\030\027 \001(\0132!.maps.fleetengine.v1.StopLocatio"
          + "nB\004\342A\001\004\0226\n\014dropoff_time\030\010 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\022D\n\023remaining_way"
          + "points\030\020 \003(\0132!.maps.fleetengine.v1.TripW"
          + "aypointB\004\342A\001\003\022<\n\021vehicle_waypoints\030\024 \003(\013"
          + "2!.maps.fleetengine.v1.TripWaypoint\022(\n\005r"
          + "oute\030\t \003(\0132\023.google.type.LatLngB\004\342A\001\003\022#\n"
          + "\025current_route_segment\030\025 \001(\tB\004\342A\001\003\022G\n\035cu"
          + "rrent_route_segment_version\030\021 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\004\342A\001\003\022[\n\035current_r"
          + "oute_segment_traffic\030\034 \001(\0132..maps.fleete"
          + "ngine.v1.ConsumableTrafficPolylineB\004\342A\001\003"
          + "\022O\n%current_route_segment_traffic_versio"
          + "n\030\036 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\022P\n\037current_route_segment_end_point\030\030 \001"
          + "(\0132!.maps.fleetengine.v1.TripWaypointB\004\342"
          + "A\001\003\022D\n\031remaining_distance_meters\030\014 \001(\0132\033"
          + ".google.protobuf.Int32ValueB\004\342A\001\003\022?\n\025eta"
          + "_to_first_waypoint\030\r \001(\0132\032.google.protob"
          + "uf.TimestampB\004\342A\001\003\022I\n remaining_time_to_"
          + "first_waypoint\030\033 \001(\0132\031.google.protobuf.D"
          + "urationB\004\342A\001\003\022E\n\033remaining_waypoints_ver"
          + "sion\030\023 \001(\0132\032.google.protobuf.TimestampB\004"
          + "\342A\001\003\022K\n!remaining_waypoints_route_versio"
          + "n\030\035 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\022\"\n\024number_of_passengers\030\n \001(\005B\004\342A\001\005\022A\n"
          + "\rlast_location\030\013 \001(\0132$.maps.fleetengine."
          + "v1.VehicleLocationB\004\342A\001\003\022%\n\027last_locatio"
          + "n_snappable\030\032 \001(\010B\004\342A\001\003\022+\n\004view\030\037 \001(\0162\035."
          + "maps.fleetengine.v1.TripView:G\352AD\n\037fleet"
          + "engine.googleapis.com/Trip\022!providers/{p"
          + "rovider}/trips/{trip}\"\236\001\n\014StopLocation\022("
          + "\n\005point\030\001 \001(\0132\023.google.type.LatLngB\004\342A\001\002"
          + "\022-\n\ttimestamp\030\002 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\0225\n\tstop_time\030\003 \001(\0132\032.google.prot"
          + "obuf.TimestampB\006\030\001\342A\001\004*\342\001\n\nTripStatus\022\027\n"
          + "\023UNKNOWN_TRIP_STATUS\020\000\022\007\n\003NEW\020\001\022\025\n\021ENROU"
          + "TE_TO_PICKUP\020\002\022\025\n\021ARRIVED_AT_PICKUP\020\003\022\'\n"
          + "#ARRIVED_AT_INTERMEDIATE_DESTINATION\020\007\022\'"
          + "\n#ENROUTE_TO_INTERMEDIATE_DESTINATION\020\010\022"
          + "\026\n\022ENROUTE_TO_DROPOFF\020\004\022\014\n\010COMPLETE\020\005\022\014\n"
          + "\010CANCELED\020\006*\177\n\031BillingPlatformIdentifier"
          + "\022+\n\'BILLING_PLATFORM_IDENTIFIER_UNSPECIF"
          + "IED\020\000\022\n\n\006SERVER\020\001\022\007\n\003WEB\020\002\022\013\n\007ANDROID\020\003\022"
          + "\007\n\003IOS\020\004\022\n\n\006OTHERS\020\005*G\n\010TripView\022\031\n\025TRIP"
          + "_VIEW_UNSPECIFIED\020\000\022\007\n\003SDK\020\001\022\027\n\023JOURNEY_"
          + "SHARING_V1S\020\002B\220\001\n\032google.maps.fleetengin"
          + "e.v1B\005TripsP\001ZFcloud.google.com/go/maps/"
          + "fleetengine/apiv1/fleetenginepb;fleeteng"
          + "inepb\242\002\003CFE\252\002\032Google.Maps.FleetEngine.V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              google.maps.fleetengine.v1.FleetEngine.getDescriptor(),
              google.maps.fleetengine.v1.TrafficProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_maps_fleetengine_v1_Trip_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_v1_Trip_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_v1_Trip_descriptor,
            new java.lang.String[] {
              "Name",
              "VehicleId",
              "TripStatus",
              "TripType",
              "PickupPoint",
              "ActualPickupPoint",
              "ActualPickupArrivalPoint",
              "PickupTime",
              "IntermediateDestinations",
              "IntermediateDestinationsVersion",
              "IntermediateDestinationIndex",
              "ActualIntermediateDestinationArrivalPoints",
              "ActualIntermediateDestinations",
              "DropoffPoint",
              "ActualDropoffPoint",
              "DropoffTime",
              "RemainingWaypoints",
              "VehicleWaypoints",
              "Route",
              "CurrentRouteSegment",
              "CurrentRouteSegmentVersion",
              "CurrentRouteSegmentTraffic",
              "CurrentRouteSegmentTrafficVersion",
              "CurrentRouteSegmentEndPoint",
              "RemainingDistanceMeters",
              "EtaToFirstWaypoint",
              "RemainingTimeToFirstWaypoint",
              "RemainingWaypointsVersion",
              "RemainingWaypointsRouteVersion",
              "NumberOfPassengers",
              "LastLocation",
              "LastLocationSnappable",
              "View",
            });
    internal_static_maps_fleetengine_v1_StopLocation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_maps_fleetengine_v1_StopLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_v1_StopLocation_descriptor,
            new java.lang.String[] {
              "Point", "Timestamp", "StopTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    google.maps.fleetengine.v1.FleetEngine.getDescriptor();
    google.maps.fleetengine.v1.TrafficProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
