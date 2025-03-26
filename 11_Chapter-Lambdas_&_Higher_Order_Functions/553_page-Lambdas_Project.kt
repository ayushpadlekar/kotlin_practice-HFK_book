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
    
    // Lambda in Function Parameters ------------
    // convertTemp function calls - paranthesis becoz of 2 parameters. 
    val celToFar = convertTemp(20.0, {c -> c * 1.8 + 32}) // or use 'it' instead of 'c'.
    println(celToFar)
    val farToCel = convertTemp(68.0, {(it - 32) / 1.8}) // or use 'f->f' instead of 'it'.
    println(farToCel)
    println()
    // convertFive function call - no paranthesis for single lambda parameter.
    convertFive { it * 1.8 + 32 }
    println()

    // Lambda in Function Return type ------------
    val kgToPound = getConversionLambda("KgToPound") (55.0)
    println("55.0 kg is converted to " + kgToPound.toFloat() + " lb")
    val poundToTon = getConversionLambda("PoundToTon") (100.0)
    println("100.0 lb is converted to " + poundToTon.toFloat() + " ton")
    println()

    // Lambda in Function Parameters & Return type, both -----------
    val kgToTon = combine({it * 2.204623}, {it / 2000.0}) (20.0)
    println("20 kg is converted to " + kgToTon + " ton")



    println(); println()
}

typealias DoubleToDouble = (Double)->Double


// convertTemp function - 2 parameters - 1 lambda in this.
fun convertTemp(x:Double, converter: DoubleToDouble ): Double {

    val result = converter(x)
    println("${x} is converted to ${result.toFloat()}")
    return result
}

// convertFive function - single lambda parameter.
fun convertFive(converter:(Int)->Double): Double {

    val result = converter(5)
    println("5 is converted to $result")
    return result
}

// getConversionLambda function - lambda in return type value.
fun getConversionLambda(str: String): DoubleToDouble {

    if (str == "CelToFar") {
        return { it * 1.8 + 32 }
    } else if (str == "KgToPound") {
        return { it * 2.204623 }
    } else if (str == "PoundToTon") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

// combine function - lambda in both, parameters & return type.
fun combine( lam1: DoubleToDouble, lam2: DoubleToDouble ): DoubleToDouble {
    
    return { x:Double -> lam2(lam1(x)) }
}

