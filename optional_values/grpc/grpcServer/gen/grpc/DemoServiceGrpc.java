package gen.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DemoServiceGrpc {

  private DemoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "gen.grpc.DemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gen.grpc.IntMessage,
      gen.grpc.Empty> getIntMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntMethod",
      requestType = gen.grpc.IntMessage.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.IntMessage,
      gen.grpc.Empty> getIntMethodMethod() {
    io.grpc.MethodDescriptor<gen.grpc.IntMessage, gen.grpc.Empty> getIntMethodMethod;
    if ((getIntMethodMethod = DemoServiceGrpc.getIntMethodMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getIntMethodMethod = DemoServiceGrpc.getIntMethodMethod) == null) {
          DemoServiceGrpc.getIntMethodMethod = getIntMethodMethod =
              io.grpc.MethodDescriptor.<gen.grpc.IntMessage, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.IntMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("IntMethod"))
              .build();
        }
      }
    }
    return getIntMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.StringMessage,
      gen.grpc.Empty> getStringMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StringMethod",
      requestType = gen.grpc.StringMessage.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.StringMessage,
      gen.grpc.Empty> getStringMethodMethod() {
    io.grpc.MethodDescriptor<gen.grpc.StringMessage, gen.grpc.Empty> getStringMethodMethod;
    if ((getStringMethodMethod = DemoServiceGrpc.getStringMethodMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getStringMethodMethod = DemoServiceGrpc.getStringMethodMethod) == null) {
          DemoServiceGrpc.getStringMethodMethod = getStringMethodMethod =
              io.grpc.MethodDescriptor.<gen.grpc.StringMessage, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StringMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("StringMethod"))
              .build();
        }
      }
    }
    return getStringMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.EnumMessage,
      gen.grpc.Empty> getEnumMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnumMethod",
      requestType = gen.grpc.EnumMessage.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.EnumMessage,
      gen.grpc.Empty> getEnumMethodMethod() {
    io.grpc.MethodDescriptor<gen.grpc.EnumMessage, gen.grpc.Empty> getEnumMethodMethod;
    if ((getEnumMethodMethod = DemoServiceGrpc.getEnumMethodMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getEnumMethodMethod = DemoServiceGrpc.getEnumMethodMethod) == null) {
          DemoServiceGrpc.getEnumMethodMethod = getEnumMethodMethod =
              io.grpc.MethodDescriptor.<gen.grpc.EnumMessage, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnumMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.EnumMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("EnumMethod"))
              .build();
        }
      }
    }
    return getEnumMethodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub>() {
        @java.lang.Override
        public DemoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceStub(channel, callOptions);
        }
      };
    return DemoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub>() {
        @java.lang.Override
        public DemoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceBlockingStub(channel, callOptions);
        }
      };
    return DemoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub>() {
        @java.lang.Override
        public DemoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceFutureStub(channel, callOptions);
        }
      };
    return DemoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void intMethod(gen.grpc.IntMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntMethodMethod(), responseObserver);
    }

    /**
     */
    default void stringMethod(gen.grpc.StringMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStringMethodMethod(), responseObserver);
    }

    /**
     */
    default void enumMethod(gen.grpc.EnumMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnumMethodMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DemoService.
   */
  public static abstract class DemoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DemoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DemoService.
   */
  public static final class DemoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DemoServiceStub> {
    private DemoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void intMethod(gen.grpc.IntMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stringMethod(gen.grpc.StringMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStringMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enumMethod(gen.grpc.EnumMessage request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnumMethodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DemoService.
   */
  public static final class DemoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DemoServiceBlockingStub> {
    private DemoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gen.grpc.Empty intMethod(gen.grpc.IntMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntMethodMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty stringMethod(gen.grpc.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStringMethodMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty enumMethod(gen.grpc.EnumMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnumMethodMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DemoService.
   */
  public static final class DemoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DemoServiceFutureStub> {
    private DemoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> intMethod(
        gen.grpc.IntMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntMethodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> stringMethod(
        gen.grpc.StringMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStringMethodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> enumMethod(
        gen.grpc.EnumMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnumMethodMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INT_METHOD = 0;
  private static final int METHODID_STRING_METHOD = 1;
  private static final int METHODID_ENUM_METHOD = 2;

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
        case METHODID_INT_METHOD:
          serviceImpl.intMethod((gen.grpc.IntMessage) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_STRING_METHOD:
          serviceImpl.stringMethod((gen.grpc.StringMessage) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_ENUM_METHOD:
          serviceImpl.enumMethod((gen.grpc.EnumMessage) request,
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
          getIntMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.IntMessage,
              gen.grpc.Empty>(
                service, METHODID_INT_METHOD)))
        .addMethod(
          getStringMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.StringMessage,
              gen.grpc.Empty>(
                service, METHODID_STRING_METHOD)))
        .addMethod(
          getEnumMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.EnumMessage,
              gen.grpc.Empty>(
                service, METHODID_ENUM_METHOD)))
        .build();
  }

  private static abstract class DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gen.grpc.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoService");
    }
  }

  private static final class DemoServiceFileDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier {
    DemoServiceFileDescriptorSupplier() {}
  }

  private static final class DemoServiceMethodDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DemoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoServiceFileDescriptorSupplier())
              .addMethod(getIntMethodMethod())
              .addMethod(getStringMethodMethod())
              .addMethod(getEnumMethodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
