package agh.grpc;

import gen.grpc.Door;
import gen.grpc.DoorRequest;
import gen.grpc.Empty;
import gen.grpc.ListDoorsResponse;
import gen.grpc.OpenClosedState;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class DoorService extends gen.grpc.DoorServiceGrpc.DoorServiceImplBase {
    private final Map<Long, Door> doors = new HashMap<>();
    private static final Logger logger = Logger.getLogger(DoorService.class.getName());

    public DoorService() {
        doors.put(
                1L,
                Door.newBuilder()
                        .setId(1)
                        .setRoom(gen.grpc.Room.KITCHEN)
                        .setState(OpenClosedState.CLOSED)
                        .build()
        );
        doors.put(
                2L,
                Door.newBuilder()
                        .setId(2)
                        .setRoom(gen.grpc.Room.LIVING_ROOM)
                        .setState(OpenClosedState.CLOSED)
                        .build()
        );
        doors.put(
                3L,
                Door.newBuilder()
                        .setId(3)
                        .setRoom(gen.grpc.Room.BEDROOM)
                        .setState(OpenClosedState.CLOSED)
                        .build()
        );
        doors.put(
                4L,
                Door.newBuilder()
                        .setId(4)
                        .setRoom(gen.grpc.Room.BATHROOM)
                        .setState(OpenClosedState.CLOSED)
                        .build()
        );
    }

    @Override
    public void getDoorState(DoorRequest request, StreamObserver<Door> responseObserver) {
        logger.info("Received request to get door state for door ID: " + request.getId());
        var door = doors.get(request.getId());
        if (door == null) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND.asRuntimeException());
            return;
        }
        responseObserver.onNext(door);
        responseObserver.onCompleted();
    }

    @Override
    public void openDoor(DoorRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to open door for door ID: " + request.getId());
        var door = doors.get(request.getId());
        if (door == null) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND.asRuntimeException());
            return;
        }
        doors.put(
                request.getId(),
                Door.newBuilder()
                        .setId(door.getId())
                        .setRoom(door.getRoom())
                        .setState(OpenClosedState.OPEN)
                        .build()
        );
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void closeDoor(DoorRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to close door for door ID: " + request.getId());
        var door = doors.get(request.getId());
        if (door == null) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND.asRuntimeException());
            return;
        }
        doors.put(
                request.getId(),
                Door.newBuilder()
                        .setId(door.getId())
                        .setRoom(door.getRoom())
                        .setState(OpenClosedState.CLOSED)
                        .build()
        );
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void listDoors(Empty request, StreamObserver<ListDoorsResponse> responseObserver) {
        logger.info("Received request to list doors");
        var response = ListDoorsResponse.newBuilder().addAllDoors(doors.values()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
