fun main() {
    // HFK C2 page 122 - Be the Compiler exercise (little modified by me)

    a() // function A

    println()
    
    b() // function B
	
}

fun a() {

    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;

    while(x < 4) {  // correction is (x < 4) or (x < hobbits.size)
                    // because taking bigger number than array size (which is 4 here) gives this error :- Input string was not in a correct format.
        
        println("${hobbits[x]} is a good hobbit name.")
        x = x + 1
    }
}

fun b() {

    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0;

    while (firemanNo < 6) {

        println("Fireman number $firemanNo is ${firemen[firemanNo]}") // Correction : curly braces were missing.
        firemanNo = firemanNo + 1
    }

}

