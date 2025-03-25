// HFK C11 Page 553 - Lambdas Project

// main function
fun main() {

    // Lambda in Variables -----------------
	
    // type explicitly defined inside lambda for only 1 parameter.
    var addFive = {x: Int -> x + 5}
    println("Pass 6 to addFive: " + addFive(6))

    // type explicitly defined inside lambda for 2 parameters.
    val addInts = {x: Int, y: Int -> x + y}
    val result = addInts.invoke(6, 7) // .invoke() used to pass parameter values.
    println("Pass 6, 7 to addInts: " + result)

    // type explicitly defined at variable, not in lambda.
    val multiplyInts: (Int, Int) -> Int = {x, y -> x * y}
    println("Pass 10, 11 to multiplyInts: " + multiplyInts(10, 11)) // .invoke() not used to pass parameter values.

    // type explicitly defined at variable, & lambda used with 'it' keyword.
    val addSeven: (Int) -> Int = {it + 7}
    println("Pass 12 to addSeven: " + addSeven(12))

    // type & return type not defined.
    val myLambda: () -> Unit = { println("Hello!") }
    myLambda() // variable used as a function.
    println()

    // Lambda in Functions -----------------

    // convertTemp function calls
    val farToCel = convertTemp(20.0, {c -> c * 1.8 + 32}) // or use 'it' instead of 'c'.
    println(farToCel)
    val celToFar = convertTemp(68.0, {(it - 32) / 1.8}) // or use 'f->f' instead of 'it'.
    println(celToFar)
    println()

    // convertFive function call
    convertFive { it * 1.8 + 32 }


    println(); println()
}

// convertTemp function
fun convertTemp(x:Double, converter:(Double)->Double ): Double {

    val result = converter(x)
    println("${x} is converted to ${result.toFloat()}")
    return result
}

// convertFive function
fun convertFive(converter:(Int)->Double): Double {

    val result = converter(5)
    println("5 is converted to $result")
    return result
}
