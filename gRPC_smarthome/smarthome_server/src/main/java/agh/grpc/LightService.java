package agh.grpc;

import gen.grpc.Empty;
import gen.grpc.Light;
import gen.grpc.LightRequest;
import gen.grpc.LightState;
import gen.grpc.ListLightsResponse;
import gen.grpc.NormalLight;
import gen.grpc.RGBColour;
import gen.grpc.RGBLight;
import gen.grpc.RGBLightRequest;
import gen.grpc.Room;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LightService extends gen.grpc.LightServiceGrpc.LightServiceImplBase {
    private final Map<Long, Light> lights = new HashMap<>();
    private static final Logger logger = Logger.getLogger(LightService.class.getName());

    public LightService() {
        lights.put(1L, Light.newBuilder().setNormal(
                NormalLight.newBuilder()
                        .setId(1)
                        .setRoom(Room.KITCHEN)
                        .setState(LightState.OFF)
                        .build()
        ).build());
        lights.put(2L, Light.newBuilder().setNormal(
                NormalLight.newBuilder()
                        .setId(2)
                        .setRoom(Room.LIVING_ROOM)
                        .setState(LightState.OFF)
                        .build()
        ).build());
        lights.put(3L, Light.newBuilder().setNormal(
                NormalLight.newBuilder()
                        .setId(3)
                        .setRoom(Room.BEDROOM)
                        .setState(LightState.OFF)
                        .build()
        ).build());
        lights.put(4L, Light.newBuilder().setRgb(
                RGBLight.newBuilder()
                        .setId(4)
                        .setRoom(Room.BATHROOM)
                        .setState(LightState.OFF)
                        .setColour(RGBColour.RED)
                        .build()
        ).build());
    }

    @Override
    public void getLightState(LightRequest request, StreamObserver<Light> responseObserver) {
        logger.info("Received request to get light state for light ID: " + request.getId());
        var light = lights.get(request.getId());
        if (light == null) {
            logger.warning("Light not found for ID: " + request.getId());
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Light not found").asRuntimeException());
            return;
        }
        responseObserver.onNext(light);
        responseObserver.onCompleted();
    }

    @Override
    public void turnOnLight(LightRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to turn on light for light ID: " + request.getId());
        var light = lights.get(request.getId());
        if (light == null) {
            logger.warning("Light not found for ID: " + request.getId());
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Light not found").asRuntimeException());
            return;
        }
        switch (light.getLightCase()) {
            case NORMAL ->
                    lights.put(request.getId(), light.toBuilder().setNormal(light.getNormal().toBuilder().setState(LightState.ON)).build());
            case RGB ->
                    lights.put(request.getId(), light.toBuilder().setRgb(light.getRgb().toBuilder().setState(LightState.ON)).build());
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void turnOffLight(LightRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to turn off light for light ID: " + request.getId());
        var light = lights.get(request.getId());
        if (light == null) {
            logger.warning("Light not found for ID: " + request.getId());
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Light not found").asRuntimeException());
            return;
        }
        switch (light.getLightCase()) {
            case NORMAL ->
                    lights.put(request.getId(), light.toBuilder().setNormal(light.getNormal().toBuilder().setState(LightState.OFF)).build());
            case RGB ->
                    lights.put(request.getId(), light.toBuilder().setRgb(light.getRgb().toBuilder().setState(LightState.OFF)).build());
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void listLights(Empty request, StreamObserver<ListLightsResponse> responseObserver) {
        logger.info("Received request to list all lights");
        responseObserver.onNext(ListLightsResponse.newBuilder().addAllLights(lights.values()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void changeColour(RGBLightRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("Received request to change colour for light ID: " + request.getId());
        if (request.getColour() == RGBColour.UNRECOGNIZED) {
            logger.warning("Invalid colour provided for light ID: " + request.getId());
            responseObserver.onError(new IllegalArgumentException("Invalid colour provided"));
            return;
        }
        var light = lights.get(request.getId());
        if (light == null) {
            logger.warning("Light not found for ID: " + request.getId());
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Light not found").asRuntimeException());
            return;
        }
        switch (light.getLightCase()) {
            case NORMAL -> {
                logger.warning("Light with ID: " + request.getId() + " is not an RGB light");
                responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Light is not an RGB light").asRuntimeException());
                return;
            }
            case RGB -> lights.put(
                    request.getId(), light.toBuilder()
                            .setRgb(light.getRgb().toBuilder().setColour(request.getColour())).build());
        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}