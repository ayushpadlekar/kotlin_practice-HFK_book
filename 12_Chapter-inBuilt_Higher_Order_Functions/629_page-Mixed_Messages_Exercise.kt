// HFK C12 Page 629 - Mixed Messages Exercise

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

    print("Candidate 5: ")
    candidate5()

    print("Candidate 6: ")
    candidate6()

    println(); println()
}

// Candidate 1
fun candidate1() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x1 = myMap.keys.fold("") { x, y -> x + y }
    x2 = myMap.entries.fold(0) { x, y -> x * y.value }

    println("$x1$x2")
}

// Candidate 2
fun candidate2() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x2 = myMap.values.groupBy{ it }.keys.sumOf{ it }

    println("$x1$x2")
}

// Candidate 3
fun candidate3() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x1 = "ABCDE"
    x2 = myMap.values.fold(12) { x, y -> x - y }

    println("$x1$x2")
}

// Candidate 4
fun candidate4() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x2 = myMap.entries.fold(1) { x, y -> x * y.value }

    println("$x1$x2")
}

// Candidate 5
fun candidate5() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x1 = myMap.values.fold("") { x, y -> x + y }

    println("$x1$x2")
}

// Candidate 6
fun candidate6() {

    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0
    //
    x1 = myMap.values.fold(0) { x, y -> x + y }.toString()
    x2 = myMap.keys.groupBy{ it }.size

    println("$x1$x2")
}

