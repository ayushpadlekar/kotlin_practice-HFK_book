fun main() {
    // HFK C2 page 124 - Mixed References exercise -
    // which array item variables refers to which objects/values at the end of the code?

    val x = arrayOf(0, 1, 2, 3, 4)

    println(x.joinToString())
    println()

    //
    x[3] = x[2]
    println(x.joinToString())
    x[4] = x[0]
    println(x.joinToString())
    x[2] = x[1]
    println(x.joinToString())
    x[1] = x[0]
    println(x.joinToString())
    x[0] = x[1]
    println(x.joinToString())
    x[4] = x[3]
    println(x.joinToString())
    x[3] = x[2]
    println(x.joinToString())
    x[2] = x[4]
    // end

    println()
    println(x.joinToString())
	
}
