import gen.grpc.*
import io.grpc.ManagedChannelBuilder
import kotlin.system.exitProcess

fun main() {
    val channel = ManagedChannelBuilder.forAddress("127.0.0.1", 9090).usePlaintext().build()
    val serviceStub = DemoServiceGrpc.newBlockingStub(channel)

    while (true) {
        println("select an option: ")
        println("1. intMethod(1, 2)")
        println("2. intMethod(200000)")
        println("3. stringMethod(\"I love\", \" grpc!\")")
        println("4. stringMethod(\"Long sentence\")")
        println("5. enumMethod(BAR, FOO)")
        println("6. enumMethod(BAR)")
        println("0. exit")
        val case = readlnOrNull()

        when (case) {
            "1" -> serviceStub.intMethod(IntMessage.newBuilder().setArg1(1).setArg2(2).build())
            "2" -> serviceStub.intMethod(IntMessage.newBuilder().setArg1(200000).build())
            "3" -> serviceStub.stringMethod(StringMessage.newBuilder().setArg1("I love").setArg2(" grpc!").build())
            "4" -> serviceStub.stringMethod(StringMessage.newBuilder().setArg2("I absolutely adore gRPC for its seamless communication between distributed systems, efficient binary serialization, and robust support for various programming languages, making it a truly versatile and powerful middleware solution for modern software development.").build())
            "5" -> serviceStub.enumMethod(EnumMessage.newBuilder().setArg1(DemoEnum.BAR).setArg2(DemoEnum.FOO).build())
            "6" -> serviceStub.enumMethod(EnumMessage.newBuilder().setArg1(DemoEnum.BAR).build())
            "0" -> exitProcess(0)
            else -> println("Invalid option")
        }
    }
}