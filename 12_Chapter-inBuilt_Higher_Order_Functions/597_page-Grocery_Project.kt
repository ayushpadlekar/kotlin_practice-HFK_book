// HFK C12 Page 597 - Built-in Higher Order Functions -
// Grocery Project
// - use built-in higher order functions like -
// maxByOrNull, minByOrNull, sumOf, sumByDouble,
// filter, filterNot, map, forEach, groupBy, fold

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
    for (g in groceries) {
        println(g)
    }
    println(); println()
    

    println("---Highest unitPrice ---------- .maxByOrNull") // .maxByOrNull
    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    println("name: ${highestUnitPrice?.name}, unitPrice: ${highestUnitPrice?.unitPrice}")
    println()

    println("---Lowest quantity ---------- .minByOrNull") // .minByOrNull
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("name: ${lowestQuantity?.name}, quantity: ${lowestQuantity?.quantity}")
    println()

    println("---Sum quantity ---------- .sumOf") // .sumOf
    // use .sumOf instead of .sumBy or .sumByDouble , as .sumBy is deprecated.
    val sumQuantity = groceries.sumOf { it.quantity }
    println("Sum quantity: $sumQuantity")
    println()

    println("---Total price ---------- .sumOf") // .sumOf
    val totalPrice = groceries.sumOf { it.unitPrice }
    println("Total price: $totalPrice")
    println()

    println("---Filter by Vegetable category ---------- .filter") // .filter
    val filterVegetables = groceries.filter { it.category == "Vegetable" }
    for(f in filterVegetables) {
        println(f)
    }
    println()

    println("---Items with unitPrice > 4.0 ---------- .filter") // .filter
    val filterByUnitPrice = groceries.filter { it.unitPrice > 4.0 }
    for(f in filterByUnitPrice) {
        println(f)
    }
    println()

    println("---Filter by Not Vegetable category ---------- .filterNot") // .filterNot
    val filterNoVegetables = groceries.filterNot { it.category == "Vegetable" }
    for(f in filterNoVegetables) {
        println(f)
    }
    println()

    println("---Map the List of Grocery Names in new list ---------- .map") // .map
    val groceryNames = groceries.map { it.name }
    println(groceryNames) // here groceryNames is a new List of names.
    println()

    println("---Map Grocery unitPrice multiplied by 0.5 in new list ---------- .map") // .map
    val halfUnitPrices = groceries.map { it.unitPrice * 0.5 }
    println(halfUnitPrices) // here halfUnitPrices is a new List of unitPrice reduced to half the og unitPrice.
    println()

    println("---Chain together - unitPrice multiplied by 2 if > 4.0 ---------- .filter & .map") // .filter .map
    val filterMapUnitPrices = groceries.filter { it.unitPrice > 4.0 }.map { it.unitPrice * 2}
    for(f in filterMapUnitPrices) {
        println(f)
    }
    println()

    println("---Print names of groceries using forEach ---------- .forEach") // .forEach
    groceries.forEach { print("${it.name}, ") }
    println(); println()

    println("---Print names of groceries with unitPrice > 4.0 ---------- .filter .forEach") // .filter .forEach
    groceries.filter {it.unitPrice > 4.0}.forEach { print("${it.name}, ") }
    println(); println()

    println("---Print names of groceries stored in variable, using forEach ---------- .forEach") // .forEach
    var itemNames = ""
    groceries.forEach { itemNames += "${it.name}  " }
    println(itemNames) 
    println()

    println("---Groceries grouped by category ---------- .groupBy .forEach") // .groupBy .forEach
    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("   ${it.name}") }
    }
    println()

    // .fold example on list of ints.
    foldSumInts()

    println("---Concatenate name of each grocery items ---------- .fold") // .fold
    val groceryNamesConcatenate = groceries.fold("") {initial, item -> initial + "${item.name} "}
    println(groceryNamesConcatenate)
    println()

    println("---Subtract initial amount after buying groceries ---------- .fold") // .fold
    var amount = 100.0
    println("Initial amount: $amount")
    val totalCost = groceries.sumOf { it.unitPrice * it.quantity }
    println("Total cost of all items: $totalCost")
    val change = groceries.fold(amount) { amount, item -> amount - item.unitPrice * item.quantity }
    println("Amount left: $change")
    println()

    


    println(); println()
}

// .fold example on list of ints
fun foldSumInts() {
    println("---Running sum, product of ints using fold ------- .fold")
    val ints = listOf(1,2,3,4)
    print("Ints: ")
    ints.forEach { print("$it ") }
    println()
    val sumOfInts = ints.fold(0) { initial, item -> initial + item }
    println("sumOfInts: $sumOfInts")
    val productOfInts = ints.fold(1) { initial, item -> initial * item }
    println("productOfInts: $productOfInts")
    println()
}

