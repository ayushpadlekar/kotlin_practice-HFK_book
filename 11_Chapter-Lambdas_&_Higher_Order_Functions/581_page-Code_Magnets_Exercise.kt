// HFK C11 Page 581 - Code Magnets Exercise -
// - print name of grocery item when certain condition is true, like a filter.

// Grocery data class
data class Grocery (
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double
)

// main Function
fun main() {

    // 7 items in groceries list
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
        Grocery("Onion", "Vegetable", "lb", 5.0),
        Grocery("Brocolli", "Vegetable", "lb", 4.5),
        Grocery("Bagel", "Bakery", "Pack", 1.5),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0),
        Grocery("Ice Cream", "Frozen", "Pack", 7.0)
    )
    // print the whole list
    println("List:- ")
    for (i in groceries) {
        println(i)
    }
    println(); println()

    println("---Expensive items > 5.0 ----------")
    search(groceries) { it.unitPrice > 5.0 }
    println()

    println("---Vegetable category ----------")
    search(groceries) { it.category == "Vegetable" }
    println()

    println("---Pack units ----------")
    search(groceries) { it.unit == "Pack" }
    println()

    println("---Vegetables > 4.0 ----------")
    search(groceries) { it.category == "Vegetable" && it.unitPrice > 4.0 }
    println()


    println(); println()
}

// search Function
fun search (list: List<Grocery>, criteria: (Grocery) -> Boolean) {

    for(l in list) {
        if (criteria(l)) {
            println("${l.name}  ${l.unitPrice}")
        }
    }
}


