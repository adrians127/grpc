// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: door.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

public interface ListDoorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen.grpc.ListDoorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gen.grpc.Door doors = 1;</code>
   */
  java.util.List<gen.grpc.Door> 
      getDoorsList();
  /**
   * <code>repeated .gen.grpc.Door doors = 1;</code>
   */
  gen.grpc.Door getDoors(int index);
  /**
   * <code>repeated .gen.grpc.Door doors = 1;</code>
   */
  int getDoorsCount();
  /**
   * <code>repeated .gen.grpc.Door doors = 1;</code>
   */
  java.util.List<? extends gen.grpc.DoorOrBuilder> 
      getDoorsOrBuilderList();
  /**
   * <code>repeated .gen.grpc.Door doors = 1;</code>
   */
  gen.grpc.DoorOrBuilder getDoorsOrBuilder(
      int index);
}
