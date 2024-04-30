package agh.student;


import io.grpc.protobuf.services.ProtoReflectionService;


import java.io.IOException;
import java.util.logging.Logger;

public class DynamicServer {
    private final int PORT = 9090;
    private final Logger logger = Logger.getLogger(DynamicServer.class.getName());
    public void start() {
        try {
            io.grpc.Server server = io.grpc.ServerBuilder.forPort(PORT)
                    .addService(new MyServiceImpl())
                    .addService(ProtoReflectionService.newInstance())
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
