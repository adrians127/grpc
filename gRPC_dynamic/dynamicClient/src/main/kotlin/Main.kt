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

    getBook()
    getAllBooks()
    addBook()
    getAllBooks()
    if (!finishLatch.await(1, TimeUnit.MINUTES)) {
        println("serverReflectionInfo can not finish within 1 minute")
    }
    channel.shutdownNow()
}
fun getBook(){
    val getOrderCommand = listOf(
        "grpcurl",
        "-plaintext",
        "-d", "{\"title\": \"Harry Potter\"}", // empty request
        "localhost:9090",
        "agh.student.MyService.MyService/GetBooks"
    )
    val getOrderProcess = ProcessBuilder(getOrderCommand)
        .redirectErrorStream(true)
        .start()
    val getOrderOutput = InputStreamReader(getOrderProcess.inputStream).readText()
    println(getOrderOutput)
}
fun getAllBooks() {
    val getOrderCommand = listOf(
        "grpcurl",
        "-plaintext",
        "localhost:9090",
        "agh.student.MyService.MyService/getAllBooks"
    )
    val getOrderProcess = ProcessBuilder(getOrderCommand)
        .redirectErrorStream(true)
        .start()
    val getOrderOutput = InputStreamReader(getOrderProcess.inputStream).readText()
    println(getOrderOutput)
}

fun addBook() {
    val addBookCommand = listOf(
        "grpcurl",
        "-plaintext",
        "-d", "{\"title\": \"New Book\", \"description\": \"This is a new book\", \"review\": 4.5}",
        "localhost:9090",
        "agh.student.MyService.MyService/AddBook"
    )
    val addBookProcess = ProcessBuilder(addBookCommand)
        .redirectErrorStream(true)
        .start()
    val addBookOutput = InputStreamReader(addBookProcess.inputStream).readText()
    println(addBookOutput)
}