package gen.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: window.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WindowServiceGrpc {

  private WindowServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "gen.grpc.WindowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Window> getGetWindowStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWindowState",
      requestType = gen.grpc.WindowRequest.class,
      responseType = gen.grpc.Window.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Window> getGetWindowStateMethod() {
    io.grpc.MethodDescriptor<gen.grpc.WindowRequest, gen.grpc.Window> getGetWindowStateMethod;
    if ((getGetWindowStateMethod = WindowServiceGrpc.getGetWindowStateMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getGetWindowStateMethod = WindowServiceGrpc.getGetWindowStateMethod) == null) {
          WindowServiceGrpc.getGetWindowStateMethod = getGetWindowStateMethod =
              io.grpc.MethodDescriptor.<gen.grpc.WindowRequest, gen.grpc.Window>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWindowState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Window.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("GetWindowState"))
              .build();
        }
      }
    }
    return getGetWindowStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Empty> getOpenWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenWindow",
      requestType = gen.grpc.WindowRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Empty> getOpenWindowMethod() {
    io.grpc.MethodDescriptor<gen.grpc.WindowRequest, gen.grpc.Empty> getOpenWindowMethod;
    if ((getOpenWindowMethod = WindowServiceGrpc.getOpenWindowMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getOpenWindowMethod = WindowServiceGrpc.getOpenWindowMethod) == null) {
          WindowServiceGrpc.getOpenWindowMethod = getOpenWindowMethod =
              io.grpc.MethodDescriptor.<gen.grpc.WindowRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("OpenWindow"))
              .build();
        }
      }
    }
    return getOpenWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Empty> getCloseWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseWindow",
      requestType = gen.grpc.WindowRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.WindowRequest,
      gen.grpc.Empty> getCloseWindowMethod() {
    io.grpc.MethodDescriptor<gen.grpc.WindowRequest, gen.grpc.Empty> getCloseWindowMethod;
    if ((getCloseWindowMethod = WindowServiceGrpc.getCloseWindowMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getCloseWindowMethod = WindowServiceGrpc.getCloseWindowMethod) == null) {
          WindowServiceGrpc.getCloseWindowMethod = getCloseWindowMethod =
              io.grpc.MethodDescriptor.<gen.grpc.WindowRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("CloseWindow"))
              .build();
        }
      }
    }
    return getCloseWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.WindowListResponse> getListWindowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWindows",
      requestType = gen.grpc.Empty.class,
      responseType = gen.grpc.WindowListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.Empty,
      gen.grpc.WindowListResponse> getListWindowsMethod() {
    io.grpc.MethodDescriptor<gen.grpc.Empty, gen.grpc.WindowListResponse> getListWindowsMethod;
    if ((getListWindowsMethod = WindowServiceGrpc.getListWindowsMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getListWindowsMethod = WindowServiceGrpc.getListWindowsMethod) == null) {
          WindowServiceGrpc.getListWindowsMethod = getListWindowsMethod =
              io.grpc.MethodDescriptor.<gen.grpc.Empty, gen.grpc.WindowListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWindows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.WindowListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("ListWindows"))
              .build();
        }
      }
    }
    return getListWindowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gen.grpc.ChangeBlindStateRequest,
      gen.grpc.Empty> getChangeBlindStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeBlindState",
      requestType = gen.grpc.ChangeBlindStateRequest.class,
      responseType = gen.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gen.grpc.ChangeBlindStateRequest,
      gen.grpc.Empty> getChangeBlindStateMethod() {
    io.grpc.MethodDescriptor<gen.grpc.ChangeBlindStateRequest, gen.grpc.Empty> getChangeBlindStateMethod;
    if ((getChangeBlindStateMethod = WindowServiceGrpc.getChangeBlindStateMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getChangeBlindStateMethod = WindowServiceGrpc.getChangeBlindStateMethod) == null) {
          WindowServiceGrpc.getChangeBlindStateMethod = getChangeBlindStateMethod =
              io.grpc.MethodDescriptor.<gen.grpc.ChangeBlindStateRequest, gen.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeBlindState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.ChangeBlindStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gen.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("ChangeBlindState"))
              .build();
        }
      }
    }
    return getChangeBlindStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WindowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub>() {
        @java.lang.Override
        public WindowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceStub(channel, callOptions);
        }
      };
    return WindowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WindowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub>() {
        @java.lang.Override
        public WindowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceBlockingStub(channel, callOptions);
        }
      };
    return WindowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WindowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub>() {
        @java.lang.Override
        public WindowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceFutureStub(channel, callOptions);
        }
      };
    return WindowServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getWindowState(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Window> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWindowStateMethod(), responseObserver);
    }

    /**
     */
    default void openWindow(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenWindowMethod(), responseObserver);
    }

    /**
     */
    default void closeWindow(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseWindowMethod(), responseObserver);
    }

    /**
     */
    default void listWindows(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.WindowListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWindowsMethod(), responseObserver);
    }

    /**
     */
    default void changeBlindState(gen.grpc.ChangeBlindStateRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeBlindStateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WindowService.
   */
  public static abstract class WindowServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WindowServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WindowService.
   */
  public static final class WindowServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WindowServiceStub> {
    private WindowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWindowState(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Window> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWindowStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openWindow(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeWindow(gen.grpc.WindowRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWindows(gen.grpc.Empty request,
        io.grpc.stub.StreamObserver<gen.grpc.WindowListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWindowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBlindState(gen.grpc.ChangeBlindStateRequest request,
        io.grpc.stub.StreamObserver<gen.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeBlindStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WindowService.
   */
  public static final class WindowServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WindowServiceBlockingStub> {
    private WindowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gen.grpc.Window getWindowState(gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWindowStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty openWindow(gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenWindowMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty closeWindow(gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseWindowMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.WindowListResponse listWindows(gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWindowsMethod(), getCallOptions(), request);
    }

    /**
     */
    public gen.grpc.Empty changeBlindState(gen.grpc.ChangeBlindStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeBlindStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WindowService.
   */
  public static final class WindowServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WindowServiceFutureStub> {
    private WindowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Window> getWindowState(
        gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWindowStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> openWindow(
        gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> closeWindow(
        gen.grpc.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.WindowListResponse> listWindows(
        gen.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWindowsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gen.grpc.Empty> changeBlindState(
        gen.grpc.ChangeBlindStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeBlindStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WINDOW_STATE = 0;
  private static final int METHODID_OPEN_WINDOW = 1;
  private static final int METHODID_CLOSE_WINDOW = 2;
  private static final int METHODID_LIST_WINDOWS = 3;
  private static final int METHODID_CHANGE_BLIND_STATE = 4;

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
        case METHODID_GET_WINDOW_STATE:
          serviceImpl.getWindowState((gen.grpc.WindowRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Window>) responseObserver);
          break;
        case METHODID_OPEN_WINDOW:
          serviceImpl.openWindow((gen.grpc.WindowRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_CLOSE_WINDOW:
          serviceImpl.closeWindow((gen.grpc.WindowRequest) request,
              (io.grpc.stub.StreamObserver<gen.grpc.Empty>) responseObserver);
          break;
        case METHODID_LIST_WINDOWS:
          serviceImpl.listWindows((gen.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<gen.grpc.WindowListResponse>) responseObserver);
          break;
        case METHODID_CHANGE_BLIND_STATE:
          serviceImpl.changeBlindState((gen.grpc.ChangeBlindStateRequest) request,
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
          getGetWindowStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.WindowRequest,
              gen.grpc.Window>(
                service, METHODID_GET_WINDOW_STATE)))
        .addMethod(
          getOpenWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.WindowRequest,
              gen.grpc.Empty>(
                service, METHODID_OPEN_WINDOW)))
        .addMethod(
          getCloseWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.WindowRequest,
              gen.grpc.Empty>(
                service, METHODID_CLOSE_WINDOW)))
        .addMethod(
          getListWindowsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.Empty,
              gen.grpc.WindowListResponse>(
                service, METHODID_LIST_WINDOWS)))
        .addMethod(
          getChangeBlindStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gen.grpc.ChangeBlindStateRequest,
              gen.grpc.Empty>(
                service, METHODID_CHANGE_BLIND_STATE)))
        .build();
  }

  private static abstract class WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WindowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gen.grpc.WindowOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WindowService");
    }
  }

  private static final class WindowServiceFileDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier {
    WindowServiceFileDescriptorSupplier() {}
  }

  private static final class WindowServiceMethodDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WindowServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WindowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WindowServiceFileDescriptorSupplier())
              .addMethod(getGetWindowStateMethod())
              .addMethod(getOpenWindowMethod())
              .addMethod(getCloseWindowMethod())
              .addMethod(getListWindowsMethod())
              .addMethod(getChangeBlindStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
