// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: light.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

public interface NormalLightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen.grpc.NormalLight)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.gen.grpc.Room room = 2;</code>
   * @return The enum numeric value on the wire for room.
   */
  int getRoomValue();
  /**
   * <code>.gen.grpc.Room room = 2;</code>
   * @return The room.
   */
  gen.grpc.Room getRoom();

  /**
   * <code>.gen.grpc.LightState state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.gen.grpc.LightState state = 3;</code>
   * @return The state.
   */
  gen.grpc.LightState getState();
}
