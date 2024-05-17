import com.zeroc.Ice.Communicator
import com.zeroc.Ice.Util
import Demo.DemoServicePrx
import java.util.*
import kotlin.system.exitProcess

class TestClient {
    private val communicator: Communicator = Util.initialize()
    public val testService: DemoServicePrx = DemoServicePrx.checkedCast(
        communicator.stringToProxy("test/test1:tcp -h 127.0.0.1 -p 9092")
    )

    fun shutdown() {
        communicator.shutdown()
    }
}

fun main() {
    val client = TestClient()
    try {
        while (true) {
            println("select an option: ")
            println("1. intMethod(1, 2)")
            println("2. intMethod(200000)")
            println("3. stringMethod(\"I love\", \" grpc!\")")
            println("4. stringMethod(\"Long sentence\")")
            println("5. enumMethod(BAR, FOO)")
            println("6. enumMethod(BAR)")
            println("0. exit")
            val case = readLine()

            when (case) {
                "1" -> client.testService.intMethod(1, 2)
                "2" -> client.testService.intMethod(OptionalInt.of(200000), OptionalInt.empty())
                "3" -> client.testService.stringMethod("I love", " grpc!")
                "4" -> client.testService.stringMethod(Optional.of("I absolutely adore gRPC for its seamless communication between distributed systems, efficient binary serialization, and robust support for various programming languages, making it a truly versatile and powerful middleware solution for modern software development."), Optional.empty())
                "5" -> {
                    client.testService.enumMethod(Demo.DemoEnum.BAR, Demo.DemoEnum.FOO)
                }
                "6" -> {
                    client.testService.enumMethod(Demo.DemoEnum.BAR, null)
                }
                "0" -> exitProcess(0)
                else -> println("Invalid option")
            }
        }
    } catch (ex: Exception) {
        println(ex)
    } finally {
        client.shutdown()
    }
}