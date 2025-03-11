fun main() {
    // HFK C3 page 163 - Mixed Messages - Exercise
	
    println("Candidate 1:  x += 6")
    candidate1()

    println()

    println("Candidate 2:  x--")
    candidate2()

    println()

    println("Candidate 3:  y = x + y")
    candidate3()

    println(); println()

    println("Candidate 4:  y = 7")
    candidate4()

    println(); println()

    println("Candidate 5:  x = x + y;  y = x - 7")
    candidate5()

    println(); println()

    println("Candidate 6:  x = y;  y++")
    candidate6()
    

}

// Candidate 1
fun candidate1() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            x += 6  // case 1

            y++
            x += 3
        } 
        // x9, x18, x27  // y21, y22, y23
        // x36, x45, x54  // y22, y23, y24
        // x63, x72, x81  // y23, y24, y25

        y -= 2
        // y21
        // y22
        // y23
    }

    // x27 y21
    // x54 y22
    // x81 y23

    println("$x $y")
    // Candidate 1-  x += 6
    // output-  81 23
}

// Candidate 2
fun candidate2() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            x--  // case 2

            y++
            x += 3
        } 
        // x2, x4, x6  // y21, y22, y23
        // x8, x10, x12  // y22, y23, y24
        // x14, x16, x18  // y23, y24, y25

        y -= 2
        // y21
        // y22
        // y23
    }

    // x6 y21
    // x12 y22
    // x18 y23

    println("$x $y")  // output:  18 23
}

// Candidate 3
fun candidate3() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            y = x + y  // case 3

            y++
            x += 3
            print("$x,$y  ")
        }
        // x3, x6, x9  // y21, y25, y32
        // x12, x15, x18  // y40, y53, y69
        // x21, x24, x27  // y86, y108, y133
        

        y -= 2
        println("->$y")
        // y30
        // y67
        // y131
    }

    // x9 y30
    // x18 y67
    // x27 y131

    println()
    println("$x $y")  // output:  27 131
}

// Candidate 4
fun candidate4() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            y = 7  // case 4

            y++
            x += 3
            print("$x,$y  ")
        }
        // x3, x6, x9  // y8, y8, y8
        // x12, x15, x18  // y8, y8, y8
        // x21, x24, x27  // y8, y8, y8
        

        y -= 2
        println("->$y")
        // y6
    }

    // x9 y8
    // x18 y8
    // x27 y8

    println()
    println("$x $y")  // output:  27 8
}

// Candidate 5
fun candidate5() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            x = x + y  // case
            y = x - 7  // 5


            y++
            x += 3
            print("$x,$y  ")
        }
        // x23, x40, x74  // y14, y31, y65
        // x140, x274, x542  // y131, y265, y533
        // x1076, x2146, x4286  // y1067, y2137, y4277
        

        y -= 2
        println("->$y")
        // y63
        // y531
        // y4275
    }

    // x74 y63
    // x542 y531
    // x4286 y4275

    println()
    println("$x $y")  // output:  4286 4275
}

// Candidate 6
fun candidate6() {

    var x = 0
    var y = 20

    for (outer in 1..3) {

        for (innerr in 4 downTo 2) {

            x = y  // case
            y++  // 6


            y++
            x += 3
            print("$x,$y  ")
        }
        // x23, x25, x27  // y22, y24, y26
        // x27, x29, x31  // y26, y28, y30
        // x31, x33, x35  // y30, y32, y34
        

        y -= 2
        println("->$y")
        // y24
        // y28
        // y32
    }

    // x27 y24
    // x31 y28
    // x35 y32

    println()
    println("$x $y")  // output:  35 32
}

