// HFK C11 Page 555 - Mixed Messages Exercise

fun main() {

    println("--------- Mixed Messages Exercise ---------")
	
    print("Candidate 1: ")
    candidate1()

    print("Candidate 2: ")
    candidate2()

    print("Candidate 3: ")
    candidate3()

    print("Candidate 4: ")
    candidate4()

    println(); println()
}

// Candidate 1
fun candidate1() {

    val x = 20
    val y = 2.3
    //
    val lam1 = {x: Int -> x}
    println(lam1(x + 6)) // 26
}

// Candidate 2
fun candidate2() {

    val x = 20
    val y = 2.3
    //
    val lam2: (Double) -> Double
    lam2 = { (it * 2) + 5 }
    println(lam2(y)) // 9.6
}

// Candidate 3
fun candidate3() {

    val x = 20
    val y = 2.3
    //
    val lam3: (Double, Double) -> Unit
    lam3 = { x, y -> println(x + y) }
    lam3(y, y) // 4.6
}

// Candidate 4
fun candidate4() {

    val x = 20
    val y = 2.3
    //
    var lam3 = { y: Int -> (y/2).toDouble() }
    print(lam3(x)) // 10.0
    lam3 = { it + 6.3 }
    print(lam3(7)) // 13.3
    // Final Output - 10.013.3
}
