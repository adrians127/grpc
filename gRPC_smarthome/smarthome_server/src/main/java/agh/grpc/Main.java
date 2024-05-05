package agh.grpc;

public class Main {
    public static void main(String[] args) {
        var server = new GrpcServer();
        server.start();
    }
}