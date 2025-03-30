// HFK Appendix-C Page 666 - Sealed Classes

sealed class MessageType

class Success(var msg: String): MessageType()
class Failure(var msg: String, var e: Exception): MessageType()

fun main() {
	
    val msgSuccess = Success("Yay!")
    val msgSuccess2 = Success("It Worked!")
    val msgFailure = Failure("Boo!", Exception("Gone Wrong"))

    var myMessageType: MessageType = msgFailure

    val myMessage = when(myMessageType) {
        is Success -> myMessageType.msg
        is Failure -> myMessageType.msg + "  " + myMessageType.e.message
    }

    println(myMessage)
}

