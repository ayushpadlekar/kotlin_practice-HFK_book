// HFK C7 page 344, 361 - Recipes project

// Recipe Data Class
data class Recipe(
    val title: String,
    val mainIngredient: String,
    val isVeg: Boolean = false,
    val difficulty: String = "Easy") {
}

// Mushroom Class
class Mushroom(val size: Int, val isMagic: Boolean) {

    constructor(isMagic_param: Boolean) : this(0, isMagic_param){
    }
}

// findRecipes Function
fun findRecipes(
    title: String = "",
    ingredient: String = "",
    isVeg: Boolean = false,
    difficulty: String = "") : Array<Recipe> {

    return arrayOf(Recipe(title, ingredient, isVeg, difficulty))
}

// addNumbers Function
fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}
// addNumbers Function Overloaded
fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}


// Main Function
fun main() {

    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Biryani")

    println("r1 Hashcode: ${r1.hashCode()}")
    println("r2 Hashcode: ${r2.hashCode()}")
    println("r3 Hashcode: ${r3.hashCode()}")
    println()

    println("r1 toString: ${r1.toString()}")
    println("r2 toString: ${r2.toString()}")
    println("r3 toString: ${r3.toString()}")
    println()

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    println()
    

    val (title, mainIngredient, isVeg, difficulty) = r1
    println("Title: $title \nmainIngredient: $mainIngredient \nisVeg: $isVeg \ndifficulty: $difficulty")
    println()

    val m1 = Mushroom(6, false)
    println("m1 Size: ${m1.size} \nisMagic: ${m1.isMagic}")

    val m2 = Mushroom(true)
    println("m2 Size: ${m2.size} \nisMagic: ${m2.isMagic}")
    println()

    println(addNumbers(2, 5))
    println(addNumbers(1.6, 7.3))
	
    println()
}
