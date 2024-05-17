package smarthome_client

import gen.grpc.*
import io.grpc.*
import java.util.*

private const val LOCALHOST = "localhost"

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Port number is required.")
        return
    }
    val port = args[0].toInt()
    val channel = ManagedChannelBuilder.forAddress(LOCALHOST, port)
        .usePlaintext()
        .build()
    val connectivityState = channel.getState(true)
    if (connectivityState == ConnectivityState.TRANSIENT_FAILURE || connectivityState == ConnectivityState.SHUTDOWN) {
        println("Failed to connect to the server.")
        return
    }

    val scanner = Scanner(System.`in`)
    while (true) {
        println("Please select an operation:")
        println("1. Lights")
        println("2. Doors")
        println("3. Windows")
        println("0. Exit")
        when (scanner.nextLine()) {
            "1" -> lightMethod(scanner, channel)
            "2" -> doorMethod(scanner, channel)
            "3" -> windowMethod(scanner, channel)
            "0" -> {
                println("Exiting...")
                channel.shutdown()
                return
            }

            else -> println("Invalid option. Please try again.")
        }
    }
}

private fun lightMethod(
    scanner: Scanner,
    channel: ManagedChannel
) {
    val stub = LightServiceGrpc.newBlockingStub(channel)
    while (true) {
        try {
            println("Please select an option:")
            println("1. Get light state")
            println("2. Turn on light")
            println("3. Turn off light")
            println("4. List lights")
            println("5. Change colour")
            println("0. Exit")
            when (scanner.nextLine()) {
                "1" -> {
                    println("Enter light ID:")
                    val id = scanner.nextLine().toLong()
                    val request = LightRequest.newBuilder().setId(id).build()
                    val response = stub.getLightState(request)
                    if (response.hasNormal()) {
                        println("This is a normal light. State: " + response.normal.state)
                    } else if (response.hasRgb()) {
                        println("This is an RGB light. State: " + response.rgb.state + ", Colour: " + response.rgb.colour)
                    }
                }
                "2" -> {
                    println("Enter light ID:")
                    val id = scanner.nextLine().toLong()
                    val request = LightRequest.newBuilder().setId(id).build()
                    val response = stub.turnOnLight(request)
                    println("Light turned on.")
                }
                "3" -> {
                    println("Enter light ID:")
                    val id = scanner.nextLine().toLong()
                    val request = LightRequest.newBuilder().setId(id).build()
                    val response = stub.turnOffLight(request)
                    println("Light turned off.")
                }
                "4" -> {
                    val request = Empty.newBuilder().build()
                    val response = stub.listLights(request)
                    println(response)
                }
                "5" -> {
                    println("Enter light ID:")
                    val id = scanner.nextLine().toLong()
                    println("Enter new colour (RED, GREEN, BLUE):")
                    val colourString = scanner.nextLine()
                    val colour = try {
                        RGBColour.valueOf(colourString)
                    } catch (e: IllegalArgumentException) {
                        println("Invalid colour. Please enter RED, GREEN, or BLUE.")
                        return
                    }
                    val request = RGBLightRequest.newBuilder().setId(id).setColour(colour).build()
                    stub.changeColour(request)
                    println("Colour changed.")
                }
                "0" -> {
                    println("Exiting from lights option...")
                    return
                }
                else -> println("Invalid option. Please try again.")
            }
        } catch (e: StatusRuntimeException) {
            println("An error occurred: ${e.message}")
        }
    }
}

private fun windowMethod(
    scanner: Scanner,
    channel: ManagedChannel
) {
    val stub = WindowServiceGrpc.newBlockingStub(channel)
    while (true) {
        try {
            println("Please select an option:")
            println("1. Get window State")
            println("2. Open window")
            println("3. Close window")
            println("4. List windows")
            println("5. Set blind for window (only for roof windows)")
            println("6. Turn off blind for window (only for roof windows)")
            println("0. Exit")
            when (scanner.nextLine()) {
                "1" -> {
                    println("Enter window ID:")
                    val id = scanner.nextLine().toLong()
                    val request = WindowRequest.newBuilder().setId(id).build()
                    val response = stub.getWindowState(request)
                    if (response == null) {
                        println("Window not found.")
                        continue
                    }
                    when (response.windowTypeCase) {
                        Window.WindowTypeCase.STANDARD -> println("This is a standard window. State: " + response.standard.state)
                        Window.WindowTypeCase.ROOF -> println("This is a roof window. State: " + response.roof.state + ", Blind: " + response.roof.isBlindDown)
                        Window.WindowTypeCase.BALCONY -> println(
                            "This is a balcony window. State: " + response.balcony.state +
                                    ", amount of people on balcony: " + response.balcony.peopleOnBalcony
                        )
                        Window.WindowTypeCase.WINDOWTYPE_NOT_SET -> println("Window type not set.")
                    }
                }
                "2" -> {
                    println("Enter window ID:")
                    val id = scanner.nextLine().toLong()
                    val request = WindowRequest.newBuilder().setId(id).build()
                    val response = stub.openWindow(request)
                    println("window opened.")
                }
                "3" -> {
                    println("Enter window ID:")
                    val id = scanner.nextLine().toLong()
                    val request = WindowRequest.newBuilder().setId(id).build()
                    val response = stub.closeWindow(request)
                    println("window closed.")
                }
                "4" -> {
                    val request = Empty.newBuilder().build()
                    val response = stub.listWindows(request)
                    println(response)
                }
                "5" -> {
                    println("Enter window ID:")
                    val id = scanner.nextLine().toLong()
                    val request = ChangeBlindStateRequest.newBuilder().setId(id).setNewState(true).build()
                    val response = stub.changeBlindState(request)
                    println(response)
                }
                "6" -> {
                    println("Enter window ID:")
                    val id = scanner.nextLine().toLong()
                    val request = ChangeBlindStateRequest.newBuilder().setId(id).setNewState(false).build()
                    val response = stub.changeBlindState(request)
                    println(response)
                }
                "0" -> {
                    println("Exiting from windows option...")
                    return
                }
                else -> println("Invalid option. Please try again.")
            }
        } catch (e: StatusRuntimeException) {
            println("An error occurred: ${e.message}")
        }
    }
}

private fun doorMethod(
    scanner: Scanner,
    channel: ManagedChannel
) {
    val stub = DoorServiceGrpc.newBlockingStub(channel)
    while (true) {
        try {
            println("Please select an option:")
            println("1. Get door State")
            println("2. Open door")
            println("3. Close door")
            println("4. List doors")
            println("0. Exit")
            when (scanner.nextLine()) {
                "1" -> {
                    println("Enter Door ID:")
                    val id = scanner.nextLine().toLong()
                    val request = DoorRequest.newBuilder().setId(id).build()
                    val response = stub.getDoorState(request)
                    if (response == null) {
                        println("Door not found.")
                        continue
                    }
                    println(", Door in room: " + response.room + " Door state: " + response.state)
                }
                "2" -> {
                    println("Enter Door ID:")
                    val id = scanner.nextLine().toLong()
                    val request = DoorRequest.newBuilder().setId(id).build()
                    val response = stub.openDoor(request)
                    println("Door opened.")
                }
                "3" -> {
                    println("Enter Door ID:")
                    val id = scanner.nextLine().toLong()
                    val request = DoorRequest.newBuilder().setId(id).build()
                    val response = stub.closeDoor(request)
                    println("Door closed.")
                }
                "4" -> {
                    val request = Empty.newBuilder().build()
                    val response = stub.listDoors(request)
                    println(response)
                }
                "0" -> {
                    println("Exiting from doors option...")
                    return
                }
                else -> println("Invalid option. Please try again.")
            }
        } catch (e: StatusRuntimeException) {
            println("An error occurred: ${e.message}")
        }
    }
}