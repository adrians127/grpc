package agh.optional;

public class Main {
    public static void main(String[] args) {
        var server = new agh.grpc.GrpcServer();
        server.start();
    }
}