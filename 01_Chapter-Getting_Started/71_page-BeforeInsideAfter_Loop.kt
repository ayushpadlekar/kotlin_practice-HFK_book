fun main(args: Array<String>) {
    // HFK page 71 - Loopy Example

	var x = 1
    println("x is $x before the loop.")
    println()

    while (x < 4) {
        println("x is $x inside the loop")
        x = x + 1
    }

    println()
    println("x is $x after the loop.")
}
