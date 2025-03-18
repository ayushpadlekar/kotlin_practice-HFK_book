// HFK C8 page 414 - Sharpen your pencil exercise

fun main() {

    val test: String = "Yes" // put "No" or "Yes"

    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }

    println("End main")
}

class BadException : Exception()

fun riskyCode(test: String) {

    println("Start risky code")

    if(test == "Yes") {
        throw BadException()
    }

    println("End risky code")
}



/* Convert String to Int. If fails, catch exception.

fun main() {
	
    strToInt("5") // "5" or "A"
}

fun strToInt(str: String) {
    try {
        var intt = str.toInt()
        println(intt)
    } catch (e: Exception) { // or 'e: NumberFormatException'
        println("Exception found: " + e)
        println(e.printStackTrace())
    } finally {
        println()
        println("strToInt function ended")
    }
}
*/
