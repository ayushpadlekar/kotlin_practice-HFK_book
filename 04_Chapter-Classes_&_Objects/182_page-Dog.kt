
class Dog(val name: String, var weight: Int, val breed: String) {

    fun bark() {

        println(if (weight < 20) "aau" else "bhau")
    }

}

fun main() {
	var myDog = Dog("Fido", 70, "Mixed")

    println(myDog.name)

    myDog.bark()
}
