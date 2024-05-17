package agh.grpc;

import agh.optional.DemoService;

import java.io.IOException;
import java.util.logging.Logger;

public class GrpcServer {
    private final int PORT = 9090;
    private final Logger logger = Logger.getLogger(GrpcServer.class.getName());
    public void start() {
        try {
            var server = io.grpc.ServerBuilder.forPort(PORT)
                    .addService(new DemoService())
                    .build()
                    .start();
            logger.info("Server started, listening on " + PORT);
            server.awaitTermination();
        } catch (IOException e) {
            logger.severe("Failed to start on port, error msg: " + e.getMessage());
        } catch (InterruptedException e) {
            logger.severe("Server interrupted, error msg: {}" + e.getMessage());
        } finally {
            logger.info("Server shutting down");
        }
    }
}