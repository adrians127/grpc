package agh.optional;


import gen.grpc.Empty;
import gen.grpc.EnumMessage;
import gen.grpc.IntMessage;
import gen.grpc.StringMessage;
import io.grpc.stub.StreamObserver;

public class DemoService extends gen.grpc.DemoServiceGrpc.DemoServiceImplBase {
    @Override
    public void intMethod(IntMessage request, StreamObserver<gen.grpc.Empty> responseObserver) {
        System.out.println("Int method: " + request.getArg1() + " " + request.getArg2());

        responseObserver.onNext(gen.grpc.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void stringMethod(StringMessage request, StreamObserver<Empty> responseObserver) {
        System.out.println("String method: " + request.getArg1() + " " + request.getArg2());

        responseObserver.onNext(gen.grpc.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void enumMethod(EnumMessage request, StreamObserver<Empty> responseObserver) {
        System.out.println("Enum method: " + request.getArg1() + " " + request.getArg2());

        responseObserver.onNext(gen.grpc.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
