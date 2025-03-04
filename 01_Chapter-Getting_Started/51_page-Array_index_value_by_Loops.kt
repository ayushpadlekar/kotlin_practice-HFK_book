fun main() {
    // HFK page 51 - Sharpen your pencil Exercise - Modidfied code for my own practice.

	val arr = arrayOf(1,2,3,4) // array of numbers

    // method 1 to print array
    val strArr = arr.joinToString()
    println("Array : $strArr")

    // method 2 to print array (remember {} in this)
    println("Array : ${arr.joinToString()}")
    println()
    
    // method 1 to print size of array
    val arrs = arr.size
    println("Size of array: $arrs")

    // method 2 to print size of array (remember {} in this)
    println("Size of array: ${arr.size}")
    println()

    var x = 0 // declare variable x
    
    whileLoop(arr, x)  // call whileLoop function, also pass parameters (arr, x).
    println()
    forLoop(arr)  // call forLoop function, also pass parameter (arr).
}


// whileLoop function
fun whileLoop(arr: Array<Int>, wx: Int) {
    println("While Loop------")

    var x = wx
    while (x < arr.size) {
        println("Item $x is ${arr[x]}")
        x += 1
    }
}


// forLoop function
fun forLoop(arr: Array<Int>) {
    println("For Loop------")

    for (i in 0 until arr.size) {
        println("Item $i is ${arr[i]}")
    }
}
