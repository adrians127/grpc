package gen.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: light.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightServiceGrpc {

  private LightServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "gen.grpc.LightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Light> getGetLightStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLightState",
      requestType = gen.grpc.LightRequest.class,
      responseType = gen.grpc.Light.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Light> getGetLightStateMethod() {
    io.grpc.MethodDescriptor<gen.grpc.LightRequest, gen.grpc.Light> getGetLightStateMethod;
    if ((getGetLightStateMethod = LightServiceGrpc.getGetLightStateMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getGetLightStateMethod = LightServiceGrpc.getGetLightStateMethod) == null) {
          LightServiceGrpc.getGetLightStateMethod = getGetLightStateMethod =
              io.grpc.MethodDescriptor.<gen.grpc.LightRequest, gen.grpc.Light>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLightState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Light.getDefaultInstance()))
              .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("GetLightState"))
              .build();
        }
      }
    }
    return getGetLightStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Empty> getTurnOnLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnLight",
      requestType = gen.grpc.LightRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Empty> getTurnOnLightMethod() {
    io.grpc.MethodDescriptor<gen.grpc.LightRequest, gen.grpc.Empty> getTurnOnLightMethod;
    if ((getTurnOnLightMethod = LightServiceGrpc.getTurnOnLightMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getTurnOnLightMethod = LightServiceGrpc.getTurnOnLightMethod) == null) {
          LightServiceGrpc.getTurnOnLightMethod = getTurnOnLightMethod =
              io.grpc.MethodDescriptor.<gen.grpc.LightRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("TurnOnLight"))
              .build();
        }
      }
    }
    return getTurnOnLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Empty> getTurnOffLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffLight",
      requestType = gen.grpc.LightRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.LightRequest,
      gen.grpc.Empty> getTurnOffLightMethod() {
    io.grpc.MethodDescriptor<gen.grpc.LightRequest, gen.grpc.Empty> getTurnOffLightMethod;
    if ((getTurnOffLightMethod = LightServiceGrpc.getTurnOffLightMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getTurnOffLightMethod = LightServiceGrpc.getTurnOffLightMethod) == null) {
          LightServiceGrpc.getTurnOffLightMethod = getTurnOffLightMethod =
              io.grpc.MethodDescriptor.<gen.grpc.LightRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("TurnOffLight"))
              .build();
        }
      }
    }
    return getTurnOffLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.ListLightsResponse> getListLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLights",
      requestType = gen.grpc.Empty.class,
      responseType = gen.grpc.ListLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.ListLightsResponse> getListLightsMethod() {
    io.grpc.MethodDescriptor<gen.grpc.Empty, gen.grpc.ListLightsResponse> getListLightsMethod;
    if ((getListLightsMethod = LightServiceGrpc.getListLightsMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getListLightsMethod = LightServiceGrpc.getListLightsMethod) == null) {
          LightServiceGrpc.getListLightsMethod = getListLightsMethod =
              io.grpc.MethodDescriptor.<gen.grpc.Empty, gen.grpc.ListLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.ListLightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("ListLights"))
              .build();
        }
      }
    }
    return getListLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.RGBLightRequest,
      gen.grpc.Empty> getChangeColourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeColour",
      requestType = gen.grpc.RGBLightRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.RGBLightRequest,
      gen.grpc.Empty> getChangeColourMethod() {
    io.grpc.MethodDescriptor<gen.grpc.RGBLightRequest, gen.grpc.Empty> getChangeColourMethod;
    if ((getChangeColourMethod = LightServiceGrpc.getChangeColourMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getChangeColourMethod = LightServiceGrpc.getChangeColourMethod) == null) {
          LightServiceGrpc.getChangeColourMethod = getChangeColourMethod =
              io.grpc.MethodDescriptor.<gen.grpc.RGBLightRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeColour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.RGBLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("ChangeColour"))
              .build();
        }
      }
    }
    return getChangeColourMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightServiceStub>() {
        @java.lang.Override
        public LightServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightServiceStub(channel, callOptions);
        }
      };
    return LightServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightServiceBlockingStub>() {
        @java.lang.Override
        public LightServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightServiceBlockingStub(channel, callOptions);
        }
      };
    return LightServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightServiceFutureStub>() {
        @java.lang.Override
        public LightServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightServiceFutureStub(channel, callOptions);
        }
      };
    return LightServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getLightState(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Light> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLightStateMethod(), responseObserver);
    }

    /**
     */
    default void turnOnLight(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnLightMethod(), responseObserver);
    }

    /**
     */
    default void turnOffLight(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffLightMethod(), responseObserver);
    }

    /**
     */
    default void listLights(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.ListLightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLightsMethod(), responseObserver);
    }

    /**
     */
    default void changeColour(gen.grpc.RGBLightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeColourMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightService.
   */
  public static abstract class LightServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightService.
   */
  public static final class LightServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LightServiceStub> {
    private LightServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLightState(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Light> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLightStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOnLight(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffLight(gen.grpc.LightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLights(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.ListLightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeColour(gen.grpc.RGBLightRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeColourMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightService.
   */
  public static final class LightServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightServiceBlockingStub> {
    private LightServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gen.grpc.Light getLightState(gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLightStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty turnOnLight(gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnLightMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty turnOffLight(gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffLightMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.ListLightsResponse listLights(gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty changeColour(gen.grpc.RGBLightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeColourMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightService.
   */
  public static final class LightServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightServiceFutureStub> {
    private LightServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Light> getLightState(
        gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLightStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> turnOnLight(
        gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> turnOffLight(
        gen.grpc.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.ListLightsResponse> listLights(
        gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> changeColour(
        gen.grpc.RGBLightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeColourMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LIGHT_STATE = 0;
  private static final int METHODID_TURN_ON_LIGHT = 1;
  private static final int METHODID_TURN_OFF_LIGHT = 2;
  private static final int METHODID_LIST_LIGHTS = 3;
  private static final int METHODID_CHANGE_COLOUR = 4;

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
        case METHODID_GET_LIGHT_STATE:
          serviceImpl.getLightState((gen.grpc.LightRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Light>) responseObserver);
          break;
        case METHODID_TURN_ON_LIGHT:
          serviceImpl.turnOnLight((gen.grpc.LightRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_TURN_OFF_LIGHT:
          serviceImpl.turnOffLight((gen.grpc.LightRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_LIST_LIGHTS:
          serviceImpl.listLights((gen.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<gen.grpc.ListLightsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_COLOUR:
          serviceImpl.changeColour((gen.grpc.RGBLightRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
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
          getGetLightStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.LightRequest,
              gen.grpc.Light>(
                service, METHODID_GET_LIGHT_STATE)))
        .addMethod(
          getTurnOnLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.LightRequest,
              gen.grpc.Empty>(
                service, METHODID_TURN_ON_LIGHT)))
        .addMethod(
          getTurnOffLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.LightRequest,
              gen.grpc.Empty>(
                service, METHODID_TURN_OFF_LIGHT)))
        .addMethod(
          getListLightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.Empty,
              gen.grpc.ListLightsResponse>(
                service, METHODID_LIST_LIGHTS)))
        .addMethod(
          getChangeColourMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.RGBLightRequest,
              gen.grpc.Empty>(
                service, METHODID_CHANGE_COLOUR)))
        .build();
  }

  private static abstract class LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gen.grpc.LightOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightService");
    }
  }

  private static final class LightServiceFileDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier {
    LightServiceFileDescriptorSupplier() {}
  }

  private static final class LightServiceMethodDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LightServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightServiceFileDescriptorSupplier())
              .addMethod(getGetLightStateMethod())
              .addMethod(getTurnOnLightMethod())
              .addMethod(getTurnOffLightMethod())
              .addMethod(getListLightsMethod())
              .addMethod(getChangeColourMethod())
              .build();
        }
      }
    }
    return result;
  }
}
