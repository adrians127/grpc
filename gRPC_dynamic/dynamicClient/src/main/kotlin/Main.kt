package agh.student

import com.google.protobuf.DescriptorProtos
import io.grpc.ManagedChannelBuilder
import io.grpc.protobuf.services.ProtoReflectionService
import io.grpc.reflection.v1alpha.ServerReflectionGrpc
import io.grpc.reflection.v1alpha.ServerReflectionRequest
import io.grpc.reflection.v1alpha.ServerReflectionResponse
import io.grpc.stub.StreamObserver
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

fun main() {
    val channel = ManagedChannelBuilder.forAddress("localhost", 9090)
        .usePlaintext()
        .build()

    val stub = ServerReflectionGrpc.newStub(channel)
    val request = ServerReflectionRequest.newBuilder()
        .setListServices("MyService")  // list all services
        .build()

    val finishLatch = CountDownLatch(1)

    stub.serverReflectionInfo(object : StreamObserver<ServerReflectionResponse> {
        override fun onNext(value: ServerReflectionResponse) {
            value.listServicesResponse.serviceList.forEach {serviceResponse ->
                if (serviceResponse.name == "agh.student.MyService.MyService") {
                    println("Service: ${serviceResponse.name}")

                }

            }
        }

        override fun onError(t: Throwable) {
            println("Error: ${t.message}")
            finishLatch.countDown()
        }

        override fun onCompleted() {
            println("Completed")
            finishLatch.countDown()
        }
    }).onNext(request)

    getOrder()
    // Wait for the asynchronous call to complete
    if (!finishLatch.await(1, TimeUnit.MINUTES)) {
        println("serverReflectionInfo can not finish within 1 minute")
    }
    channel.shutdownNow()
}
fun getOrder(){
    val file = File("src/main/resources/getOrder.json")
    val getOrderCommand = listOf(
        "grpcurl",
        "-plaintext",
        "localhost:9090",
        "agh.student.MyService.MyService/execute"
    )
    val getOrderProcess = ProcessBuilder(getOrderCommand)
        .redirectErrorStream(true)
        .start()
    val getOrderOutput = InputStreamReader(getOrderProcess.inputStream).readText()
    println(getOrderOutput)
}