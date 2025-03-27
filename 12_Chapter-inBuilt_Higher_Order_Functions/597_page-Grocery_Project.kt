// HFK C12 Page 597 - Built-in Higher Order Functions -
// Grocery Project
// - use built-in higher order functions like -
// maxByOrNull, minByOrNull, sumOf, sumByDouble

// Grocery data class
data class Grocery (
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

// main Function
fun main() {

    // 7 items in groceries list
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Onion", "Vegetable", "lb", 5.0, 2),
        Grocery("Brocolli", "Vegetable", "lb", 4.5, 5),
        Grocery("Bagel", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 4),
        Grocery("Ice Cream", "Frozen", "Pack", 7.0, 2)
    )
    // print the whole list
    println("List:- ")
    for (i in groceries) {
        println(i)
    }
    println(); println()
    

    println("---Highest unitPrice ----------") // .maxByOrNull
    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    println("name: ${highestUnitPrice?.name}, unitPrice: ${highestUnitPrice?.unitPrice}")
    println()

    println("---Lowest quantity ----------") // .minByOrNull
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("name: ${lowestQuantity?.name}, quantity: ${lowestQuantity?.quantity}")
    println()

    println("---Sum quantity ----------") // .sumOf
    // use .sumOf instead of .sumBy or .sumByDouble , as .sumBy is deprecated.
    val sumQuantity = groceries.sumOf { it.quantity }
    println("Sum quantity: $sumQuantity")
    println()

    println("---Total price ----------") // .sumOf
    val totalPrice = groceries.sumOf { it.unitPrice }
    println("Total price: $totalPrice")
    println()

    


    println(); println()
}

