// HFK C4 page 182 - Dog class

//Dog Class
class Dog(val name: String, weight_param: Int, val breed: String) {

    init {
        println("Dog $name has been created.")
    }

    var activities = arrayOf("Walks", "Runs", "Jumps")

    var weight = weight_param
    set(value) {
        field = if (value > 0) value else 0
    }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "aau!" else "bhau!")
    }
}

// Main function
fun main() {

	var myDog = Dog("Fido", 15, "Mixed")

    var friendsDog = Dog("Hudo", -1, "Golden Retreiver")
    println()

    println(myDog.name)
    myDog.bark()
    println("Weight: ${myDog.weight}")
    println("Weight in kg: ${myDog.weightInKgs}")
    myDog.activities = arrayOf("Walks", "Runs", "Jumps", "Catching Ball")
    print("My dog enjoys: ")
    for (item in myDog.activities) print("$item, ")

    println(); println()

    println(friendsDog.name)
    friendsDog.bark()
    println("Weight: ${friendsDog.weight}")
    println("Weight in kg: ${friendsDog.weightInKgs}")
    friendsDog.activities = arrayOf("Walks", "Runs", "Jumps", "Frisbee")
    print("Friends dog enjoys: ")
    for (item in friendsDog.activities) print("$item, ")
}
