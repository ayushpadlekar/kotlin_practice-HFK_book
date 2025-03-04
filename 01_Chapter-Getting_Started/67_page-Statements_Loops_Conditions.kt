fun main() {
    // HFK Page 67 - Statements, Loops, Conditions

    // Do something :- Statements
    var x = 3
    val name = "Ayush"
    x = x * 10
    println("x is $x.")
    println()
	
    // Do something again & again :- Loops
    while (x > 20) {
        x = x - 1
        println("x is now $x")
    }
    println()

    for (i in 1..10) {
        x = x + 1
        println("x is now $x")
    }
    println()


    // Do something under a condition :- Branching
    // if-else with braces
    if (x == 20) {
        println("x must be 20")
    } else {
        println("x is not 20, it's $x.")
    }
    // if-else without braces
    if (name.equals("Ayush"))
        println("$name Strike")
    else
        println("incorrect name")


}
