// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: house.proto
// Protobuf Java Version: 4.26.1

package gen.grpc;

public final class House {
  private House() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      House.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_RoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_RoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_RoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_RoomResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013house.proto\022\010gen.grpc\"\007\n\005Empty\"+\n\013Room" +
      "Request\022\034\n\004room\030\001 \001(\0162\016.gen.grpc.Room\"-\n" +
      "\014RoomResponse\022\035\n\005rooms\030\001 \003(\0162\016.gen.grpc." +
      "Room*L\n\004Room\022\013\n\007DEFAULT\020\000\022\013\n\007KITCHEN\020\001\022\017" +
      "\n\013LIVING_ROOM\020\002\022\013\n\007BEDROOM\020\003\022\014\n\010BATHROOM" +
      "\020\004B\014\n\010gen.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gen_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gen_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_gen_grpc_RoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gen_grpc_RoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_RoomRequest_descriptor,
        new java.lang.String[] { "Room", });
    internal_static_gen_grpc_RoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gen_grpc_RoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_RoomResponse_descriptor,
        new java.lang.String[] { "Rooms", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}