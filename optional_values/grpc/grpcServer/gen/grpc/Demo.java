// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto
// Protobuf Java Version: 4.26.1

package gen.grpc;

public final class Demo {
  private Demo() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Demo.class.getName());
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
    internal_static_gen_grpc_IntMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_IntMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_StringMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_StringMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_EnumMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_EnumMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gen_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gen_grpc_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ndemo.proto\022\010gen.grpc\"(\n\nIntMessage\022\014\n\004" +
      "arg1\030\001 \001(\005\022\014\n\004arg2\030\002 \001(\005\"+\n\rStringMessag" +
      "e\022\014\n\004arg1\030\001 \001(\t\022\014\n\004arg2\030\002 \001(\t\"Q\n\013EnumMes" +
      "sage\022 \n\004arg1\030\001 \001(\0162\022.gen.grpc.DemoEnum\022 " +
      "\n\004arg2\030\002 \001(\0162\022.gen.grpc.DemoEnum\"\007\n\005Empt" +
      "y*)\n\010DemoEnum\022\013\n\007UNKNOWN\020\000\022\007\n\003FOO\020\001\022\007\n\003B" +
      "AR\020\0022\267\001\n\013DemoService\0224\n\tIntMethod\022\024.gen." +
      "grpc.IntMessage\032\017.gen.grpc.Empty\"\000\022:\n\014St" +
      "ringMethod\022\027.gen.grpc.StringMessage\032\017.ge" +
      "n.grpc.Empty\"\000\0226\n\nEnumMethod\022\025.gen.grpc." +
      "EnumMessage\032\017.gen.grpc.Empty\"\000B\014\n\010gen.gr" +
      "pcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gen_grpc_IntMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gen_grpc_IntMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_IntMessage_descriptor,
        new java.lang.String[] { "Arg1", "Arg2", });
    internal_static_gen_grpc_StringMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gen_grpc_StringMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_StringMessage_descriptor,
        new java.lang.String[] { "Arg1", "Arg2", });
    internal_static_gen_grpc_EnumMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gen_grpc_EnumMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_EnumMessage_descriptor,
        new java.lang.String[] { "Arg1", "Arg2", });
    internal_static_gen_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_gen_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gen_grpc_Empty_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
