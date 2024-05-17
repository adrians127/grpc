package gen.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: door.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DoorServiceGrpc {

  private DoorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "gen.grpc.DoorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Door> getGetDoorStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoorState",
      requestType = gen.grpc.DoorRequest.class,
      responseType = gen.grpc.Door.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Door> getGetDoorStateMethod() {
    io.grpc.MethodDescriptor<gen.grpc.DoorRequest, gen.grpc.Door> getGetDoorStateMethod;
    if ((getGetDoorStateMethod = DoorServiceGrpc.getGetDoorStateMethod) == null) {
      synchronized (DoorServiceGrpc.class) {
        if ((getGetDoorStateMethod = DoorServiceGrpc.getGetDoorStateMethod) == null) {
          DoorServiceGrpc.getGetDoorStateMethod = getGetDoorStateMethod =
              io.grpc.MethodDescriptor.<gen.grpc.DoorRequest, gen.grpc.Door>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoorState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.DoorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Door.getDefaultInstance()))
              .setSchemaDescriptor(new DoorServiceMethodDescriptorSupplier("GetDoorState"))
              .build();
        }
      }
    }
    return getGetDoorStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Empty> getOpenDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenDoor",
      requestType = gen.grpc.DoorRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Empty> getOpenDoorMethod() {
    io.grpc.MethodDescriptor<gen.grpc.DoorRequest, gen.grpc.Empty> getOpenDoorMethod;
    if ((getOpenDoorMethod = DoorServiceGrpc.getOpenDoorMethod) == null) {
      synchronized (DoorServiceGrpc.class) {
        if ((getOpenDoorMethod = DoorServiceGrpc.getOpenDoorMethod) == null) {
          DoorServiceGrpc.getOpenDoorMethod = getOpenDoorMethod =
              io.grpc.MethodDescriptor.<gen.grpc.DoorRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.DoorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DoorServiceMethodDescriptorSupplier("OpenDoor"))
              .build();
        }
      }
    }
    return getOpenDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Empty> getCloseDoorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseDoor",
      requestType = gen.grpc.DoorRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.DoorRequest,
      gen.grpc.Empty> getCloseDoorMethod() {
    io.grpc.MethodDescriptor<gen.grpc.DoorRequest, gen.grpc.Empty> getCloseDoorMethod;
    if ((getCloseDoorMethod = DoorServiceGrpc.getCloseDoorMethod) == null) {
      synchronized (DoorServiceGrpc.class) {
        if ((getCloseDoorMethod = DoorServiceGrpc.getCloseDoorMethod) == null) {
          DoorServiceGrpc.getCloseDoorMethod = getCloseDoorMethod =
              io.grpc.MethodDescriptor.<gen.grpc.DoorRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseDoor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.DoorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DoorServiceMethodDescriptorSupplier("CloseDoor"))
              .build();
        }
      }
    }
    return getCloseDoorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.ListDoorsResponse> getListDoorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listDoors",
      requestType = gen.grpc.Empty.class,
      responseType = gen.grpc.ListDoorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.ListDoorsResponse> getListDoorsMethod() {
    io.grpc.MethodDescriptor<gen.grpc.Empty, gen.grpc.ListDoorsResponse> getListDoorsMethod;
    if ((getListDoorsMethod = DoorServiceGrpc.getListDoorsMethod) == null) {
      synchronized (DoorServiceGrpc.class) {
        if ((getListDoorsMethod = DoorServiceGrpc.getListDoorsMethod) == null) {
          DoorServiceGrpc.getListDoorsMethod = getListDoorsMethod =
              io.grpc.MethodDescriptor.<gen.grpc.Empty, gen.grpc.ListDoorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listDoors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.ListDoorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DoorServiceMethodDescriptorSupplier("listDoors"))
              .build();
        }
      }
    }
    return getListDoorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoorServiceStub>() {
        @java.lang.Override
        public DoorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoorServiceStub(channel, callOptions);
        }
      };
    return DoorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoorServiceBlockingStub>() {
        @java.lang.Override
        public DoorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoorServiceBlockingStub(channel, callOptions);
        }
      };
    return DoorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoorServiceFutureStub>() {
        @java.lang.Override
        public DoorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoorServiceFutureStub(channel, callOptions);
        }
      };
    return DoorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDoorState(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Door> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoorStateMethod(), responseObserver);
    }

    /**
     */
    default void openDoor(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenDoorMethod(), responseObserver);
    }

    /**
     */
    default void closeDoor(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseDoorMethod(), responseObserver);
    }

    /**
     */
    default void listDoors(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.ListDoorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDoorsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DoorService.
   */
  public static abstract class DoorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DoorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DoorService.
   */
  public static final class DoorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DoorServiceStub> {
    private DoorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDoorState(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Door> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoorStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openDoor(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeDoor(gen.grpc.DoorRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDoors(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.ListDoorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDoorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DoorService.
   */
  public static final class DoorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DoorServiceBlockingStub> {
    private DoorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gen.grpc.Door getDoorState(gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoorStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty openDoor(gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty closeDoor(gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseDoorMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.ListDoorsResponse listDoors(gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDoorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DoorService.
   */
  public static final class DoorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DoorServiceFutureStub> {
    private DoorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Door> getDoorState(
        gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoorStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> openDoor(
        gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> closeDoor(
        gen.grpc.DoorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseDoorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.ListDoorsResponse> listDoors(
        gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDoorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOOR_STATE = 0;
  private static final int METHODID_OPEN_DOOR = 1;
  private static final int METHODID_CLOSE_DOOR = 2;
  private static final int METHODID_LIST_DOORS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOOR_STATE:
          serviceImpl.getDoorState((gen.grpc.DoorRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Door>) responseObserver);
          break;
        case METHODID_OPEN_DOOR:
          serviceImpl.openDoor((gen.grpc.DoorRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_CLOSE_DOOR:
          serviceImpl.closeDoor((gen.grpc.DoorRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_LIST_DOORS:
          serviceImpl.listDoors((gen.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<gen.grpc.ListDoorsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetDoorStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.DoorRequest,
              gen.grpc.Door>(
                service, METHODID_GET_DOOR_STATE)))
        .addMethod(
          getOpenDoorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.DoorRequest,
              gen.grpc.Empty>(
                service, METHODID_OPEN_DOOR)))
        .addMethod(
          getCloseDoorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.DoorRequest,
              gen.grpc.Empty>(
                service, METHODID_CLOSE_DOOR)))
        .addMethod(
          getListDoorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.Empty,
              gen.grpc.ListDoorsResponse>(
                service, METHODID_LIST_DOORS)))
        .build();
  }

  private static abstract class DoorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gen.grpc.DoorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoorService");
    }
  }

  private static final class DoorServiceFileDescriptorSupplier
      extends DoorServiceBaseDescriptorSupplier {
    DoorServiceFileDescriptorSupplier() {}
  }

  private static final class DoorServiceMethodDescriptorSupplier
      extends DoorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DoorServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoorServiceFileDescriptorSupplier())
              .addMethod(getGetDoorStateMethod())
              .addMethod(getOpenDoorMethod())
              .addMethod(getCloseDoorMethod())
              .addMethod(getListDoorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
