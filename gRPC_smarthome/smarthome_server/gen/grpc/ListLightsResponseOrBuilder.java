// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: light.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

public interface ListLightsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen.grpc.ListLightsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  java.util.List<gen.grpc.Light> 
      getLightsList();
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  gen.grpc.Light getLights(int index);
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  int getLightsCount();
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  java.util.List<? extends gen.grpc.LightOrBuilder> 
      getLightsOrBuilderList();
  /**
   * <code>repeated .gen.grpc.Light lights = 1;</code>
   */
  gen.grpc.LightOrBuilder getLightsOrBuilder(
      int index);
}