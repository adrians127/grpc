package agh.grpc;

public class Main {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger(Main.class.getName());
        var port = 9090;
        if (args.length != 1) {
            logger.info("Port not specified, port defaulting to 9090");
        } else {
            port = Integer.parseInt(args[0]);
        }
        var server = new GrpcServer(port);
        server.start();
    }
}