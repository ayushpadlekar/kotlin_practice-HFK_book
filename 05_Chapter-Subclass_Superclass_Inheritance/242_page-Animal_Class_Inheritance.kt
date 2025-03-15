// HFK C5 page 242 - Animal Class Inheritance


// Animal Class
open class Animal {

    open val image = ""
    open val foodType = ""
    open val habitat = ""
    var hungerLevel = 10

    open fun makeNoise() {
        println("The animal is making a noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}


// Hippo Class
class Hippo : Animal() {

    override val image = "hippo.jpg"
    override val foodType = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $foodType.")
    }

}


// Main Function
fun main() {

    println("Hippo-")
    val hippo = Hippo()

    println("Image: ${hippo.image}")
    println("Habitat: ${hippo.habitat}")
    hippo.makeNoise()
    hippo.eat()

    println()
	
}
