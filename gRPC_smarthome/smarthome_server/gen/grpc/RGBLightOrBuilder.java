// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: light.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

public interface RGBLightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen.grpc.RGBLight)
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
   * <code>.gen.grpc.RGBColour colour = 3;</code>
   * @return The enum numeric value on the wire for colour.
   */
  int getColourValue();
  /**
   * <code>.gen.grpc.RGBColour colour = 3;</code>
   * @return The colour.
   */
  gen.grpc.RGBColour getColour();

  /**
   * <code>.gen.grpc.LightState state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.gen.grpc.LightState state = 4;</code>
   * @return The state.
   */
  gen.grpc.LightState getState();
}
