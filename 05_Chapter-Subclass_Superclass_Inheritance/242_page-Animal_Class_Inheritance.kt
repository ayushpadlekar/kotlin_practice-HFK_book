// HFK C5 page 242 - Animal Class Inheritance


// Animal Class Open
open class Animal {

    open val name = ""
    open val image = ""
    open val foodType = ""
    open val habitat = ""
    var hungerLevel = 10

    open fun makeNoise() {
        println("The Animal is making a noise.")
    }

    open fun eat() {
        println("The Animal is eating.")
    }

    open fun roam() {
        println("The Animal is roaming.")
    }

    fun sleep() {
        println("The Animal is sleeping.")
    }
}


// Hippo Class
class Hippo : Animal() {

    override val name = "Hippo"
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

// Canine Class Open
open class Canine : Animal() {

    override fun roam() {
        println("The Canine is roaming.")
    }

}

// Wolf Class
class Wolf : Canine() {

    override val name = "Wolf"
    override val image = "wolf.jpg"
    override val foodType = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Hooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $foodType.")
    }

}

// Vet Class
class Vet {

    fun giveShot(animal: Animal) {
        print("Vet-given shot: ")
        animal.makeNoise()
    }
}


// Main Function
fun main() {

    // Separate-Separate approach

    // Hippo
    println("HIPPO---------------------")
    val hippo = Hippo()
    println("Image: ${hippo.image}")
    println("Habitat: ${hippo.habitat}")
    println("Hunger Level: ${hippo.hungerLevel}")
    hippo.makeNoise()
    hippo.eat()
    hippo.roam()
    hippo.sleep()

    println()

    // Wolf
    println("WOLF---------------------")
    val wolf = Wolf()
    println("Image: ${wolf.image}")
    println("Habitat: ${wolf.habitat}")
    println("Hunger Level: ${wolf.hungerLevel}")
    wolf.makeNoise()
    wolf.eat()
    wolf.roam()
    wolf.sleep()

    println(); println()
    //--------------------------------------------------------//

    // Array of classes with for loop approach.
    val animals = arrayOf(Hippo(), Wolf())

    for(item in animals) {
        println("${item.name.uppercase()}---------------------")
        println("Image: ${item.image}")
        println("Habitat: ${item.habitat}")
        println("Hunger Level: ${item.hungerLevel}")
        item.makeNoise()
        item.eat()
        item.roam()
        item.sleep()

        println()
    }

    val vet = Vet()
    vet.giveShot(hippo)
    vet.giveShot(wolf)
	
}
