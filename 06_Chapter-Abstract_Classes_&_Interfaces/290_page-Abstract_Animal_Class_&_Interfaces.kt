// HFK C6 page 290, 297, 308-310 - Abstract Animal Class & Interfaces

// Roamable Interface
interface Roamable {
    fun roam()
}

// Vehicle Class
class Vehicle: Roamable {
    override fun roam() {
        println("The Vehicle is roaming.")
    }
}

// Animal Class Open
abstract class Animal: Roamable {

    abstract val name: String
    abstract val image: String
    abstract val foodType: String
    abstract val habitat: String
    var hungerLevel = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
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
abstract class Canine : Animal() {

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

    println()
    val vehicle = Vehicle()
    vehicle.roam()

    println(); println()
    //--------------------------------------------------------//

    // Array of classes with for loop approach.
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())

    for(item in roamables) {
        if (item is Animal) {

            println("${item.name.uppercase()}---------------------")
            println("Image: ${item.image}")
            println("Habitat: ${item.habitat}")
            println("Hunger Level: ${item.hungerLevel}")
            item.makeNoise()
            item.eat()
            item.roam()
            item.sleep()

            println()

        } else if (item is Vehicle) { // or (!is Animal) // or just else {} condition.
            item.roam()
            println()
        }
    }

    val vet = Vet()
    vet.giveShot(hippo)
    vet.giveShot(wolf)
    println(); println()
	
}
