package agh.student;

import agh.student.MyService.MyServiceGrpc;
import agh.student.MyService.ServiceRequest;
import agh.student.MyService.ServiceResponse;

public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void execute(ServiceRequest request, io.grpc.stub.StreamObserver<ServiceResponse> responseObserver) {
        var response = ServiceResponse.newBuilder()
                .setData("Hello")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
