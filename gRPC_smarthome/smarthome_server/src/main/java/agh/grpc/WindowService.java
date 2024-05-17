package agh.grpc;

import gen.grpc.BalconyWindow;
import gen.grpc.ChangeBlindStateRequest;
import gen.grpc.Empty;
import gen.grpc.OpenClosedState;
import gen.grpc.RoofWindow;
import gen.grpc.StandardWindow;
import gen.grpc.Window;
import gen.grpc.WindowListResponse;
import gen.grpc.WindowRequest;
import gen.grpc.WindowServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WindowService extends WindowServiceGrpc.WindowServiceImplBase {
    private final Map<Long, Window> windows = new HashMap<>();
    private static final Logger logger = Logger.getLogger(WindowService.class.getName());

    public WindowService() {
        windows.put(1L, Window.newBuilder()
                .setStandard(
                        StandardWindow.newBuilder()
                                .setId(1)
                                .setRoom(gen.grpc.Room.KITCHEN)
                                .setState(OpenClosedState.CLOSED)
                                .build()).build());
        windows.put(2L, Window.newBuilder()
                .setBalcony(
                        BalconyWindow.newBuilder()
                                .setId(2)
                                .setRoom(gen.grpc.Room.LIVING_ROOM)
                                .setState(OpenClosedState.CLOSED)
                                .setPeopleOnBalcony(0)
                                .build()).build());
        windows.put(3L, Window.newBuilder()
                .setRoof(
                        RoofWindow.newBuilder()
                                .setId(3)
                                .setRoom(gen.grpc.Room.BEDROOM)
                                .setState(OpenClosedState.CLOSED)
                                .build()).build());
    }

    @Override
    public void getWindowState(WindowRequest request, StreamObserver<Window> responseObserver) {
        logger.info("Received request to get window state for window ID: " + request.getId());
        var window = windows.get(request.getId());
        if (window == null) {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
            return;
        }
        responseObserver.onNext(window);
        responseObserver.onCompleted();
    }

    @Override
    public void openWindow(WindowRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to open window for window ID: " + request.getId());
        var window = windows.get(request.getId());
        if (window == null) {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
            return;
        }
        switch (window.getWindowTypeCase()) {
            case STANDARD -> windows.put(request.getId(), Window.newBuilder()
                    .setStandard(
                            StandardWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getStandard().getRoom())
                                    .setState(OpenClosedState.OPEN)
                                    .build()).build());

            case BALCONY -> windows.put(request.getId(), Window.newBuilder()
                    .setBalcony(
                            BalconyWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getBalcony().getRoom())
                                    .setState(OpenClosedState.OPEN)
                                    .build()).build());

            case ROOF -> windows.put(request.getId(), Window.newBuilder()
                    .setRoof(
                            RoofWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getRoof().getRoom())
                                    .setState(OpenClosedState.OPEN)
                                    .build()).build());
            default -> {
                responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
                return;
            }
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void closeWindow(WindowRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to open window for window ID: " + request.getId());
        var window = windows.get(request.getId());
        if (window == null) {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
            return;
        }
        switch (window.getWindowTypeCase()) {
            case STANDARD -> windows.put(request.getId(), Window.newBuilder()
                    .setStandard(
                            StandardWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getStandard().getRoom())
                                    .setState(OpenClosedState.CLOSED)
                                    .build()).build());

            case BALCONY -> windows.put(request.getId(), Window.newBuilder()
                    .setBalcony(
                            BalconyWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getBalcony().getRoom())
                                    .setState(OpenClosedState.CLOSED)
                                    .build()).build());

            case ROOF -> windows.put(request.getId(), Window.newBuilder()
                    .setRoof(
                            RoofWindow.newBuilder()
                                    .setId(request.getId())
                                    .setRoom(window.getRoof().getRoom())
                                    .setState(OpenClosedState.CLOSED)
                                    .build()).build());
            default -> {
                responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
                return;
            }
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void listWindows(Empty request, StreamObserver<WindowListResponse> responseObserver) {
        logger.info("Received request to list all windows");
        var windowList = WindowListResponse.newBuilder().addAllWindows(windows.values());
        responseObserver.onNext(windowList.build());
        responseObserver.onCompleted();
    }

    @Override
    public void changeBlindState(ChangeBlindStateRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to change blind state for window ID: " + request.getId());
        var window = windows.get(request.getId());
        if (window == null) {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
            return;
        }
        switch (window.getWindowTypeCase()) {
            case ROOF -> {
                var roofWindow = window.getRoof();
                windows.put(request.getId(), Window.newBuilder()
                        .setRoof(
                                RoofWindow.newBuilder()
                                        .setId(request.getId())
                                        .setRoom(roofWindow.getRoom())
                                        .setState(roofWindow.getState())
                                        .setIsBlindDown(request.getNewState())
                                        .build()).build());
            }
            default -> {
                responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Not Roof window").asRuntimeException());
                return;
            }
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
