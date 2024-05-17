// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: house.proto

// Protobuf Java Version: 4.26.1
package gen.grpc;

public interface RoomResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gen.grpc.RoomResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gen.grpc.Room rooms = 1;</code>
   * @return A list containing the rooms.
   */
  java.util.List<gen.grpc.Room> getRoomsList();
  /**
   * <code>repeated .gen.grpc.Room rooms = 1;</code>
   * @return The count of rooms.
   */
  int getRoomsCount();
  /**
   * <code>repeated .gen.grpc.Room rooms = 1;</code>
   * @param index The index of the element to return.
   * @return The rooms at the given index.
   */
  gen.grpc.Room getRooms(int index);
  /**
   * <code>repeated .gen.grpc.Room rooms = 1;</code>
   * @return A list containing the enum numeric values on the wire for rooms.
   */
  java.util.List<java.lang.Integer>
  getRoomsValueList();
  /**
   * <code>repeated .gen.grpc.Room rooms = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of rooms at the given index.
   */
  int getRoomsValue(int index);
}