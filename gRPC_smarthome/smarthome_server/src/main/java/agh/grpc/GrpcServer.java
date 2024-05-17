package agh.grpc;

import java.io.IOException;
import java.util.logging.Logger;

public class GrpcServer {
    private final int PORT;
    private final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    public GrpcServer(int PORT) {
        this.PORT = PORT;
    }

    public void start() {
        try {
            io.grpc.Server server = io.grpc.ServerBuilder.forPort(PORT)
                    .addService(new LightService())
                    .addService(new DoorService())
                    .addService(new WindowService())
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
