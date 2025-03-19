// HFK C9 page 423 - Array functions use

fun main() {
	
    var array = arrayOf(1, 3, 2, 4, 5)
    println("Array: ${array.joinToString()}")

    println("Array size: ${array.size}")

    array.reverse()
    println("Array Reverse: ${array.joinToString()}")

    array += 8
    println("Array+= 8: " + array.joinToString())

    println("Array size: ${array.size}")

    array.sort()
    println("Array sort: " + array.joinToString())

    println("Array contains 2: " + array.contains(2))

    println("Array sum: " + array.sum())

    println("Array average: " + array.average())
    println("Array average to int: " + array.average().toInt())

    println("Array min: " + array.minOrNull())
    println("Array max: " + array.maxOrNull())


    var nullArray: Array<String?> = arrayOfNulls(3)
    println("Array of Nulls: " + nullArray.joinToString())

}
