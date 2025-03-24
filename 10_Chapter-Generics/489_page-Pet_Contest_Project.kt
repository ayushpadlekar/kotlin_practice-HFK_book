// HFK C10 Page 489 - Generic Pet, Contest, Retailers, Vet
// Generic types - invariant, co-variant(out), contra-variant(in)

fun main() {

    // Cat Objects
    val catMancho = Cat("Mancho")
    val catRancho = Cat("Rancho")
    val catTancho = Cat("Tancho")
    val catDancho = Cat("Dancho")
    // Fish Objects
    val fishFinny = Fish("Finny")
    val fishMinny = Fish("Minny")
    val fishKinny = Fish("Kinny")
    // Vet Objects
    val petVet = Vet<Pet>()  // as we have used 'in' generic type in contest constructor,
    // val catVet = Vet<Cat>()  // there is no need for catVet object
    // val fishVet = Vet<Fish>() // and fishVet object.

    // Cat Contest
    println("--- Cat Contest -----------------------")
    val catContest = Contest<Cat>(petVet)
    catContest.addScore(catMancho, 30)
    catContest.addScore(catRancho, 80)
    catContest.addScore(catTancho, 60)
    catContest.addScore(catDancho, 95)
    println(catContest.scores)  // print all cats scores
    val catWon = catContest.getWinners().first() // get winner
    println("Winner: " + catWon.name) // print winner name
    println()

    // Fish Contest
    println("--- Fish Contest -----------------------")
    val fishContest = Contest<Fish>(petVet)
    fishContest.addScore(fishFinny, 50)
    fishContest.addScore(fishMinny, 65)
    fishContest.addScore(fishKinny, 85)
    println(fishContest.scores)  // print all fish scores
    val fishWon = fishContest.getWinners().first() // get winner
    println("Winner: " + fishWon.name) // print winner name
    println()

    // Pet Contest
    println("--- Pet Contest -----------------------")
    val petContest = Contest<Pet>(petVet)
    petContest.addScore(fishFinny, 45)
    petContest.addScore(fishMinny, 55)
    petContest.addScore(catMancho, 35)
    println(petContest.scores)  // print all pets scores
    val petWon = petContest.getWinners().first() // get winner
    println("Winner: " + petWon.name) // print winner name
    println()

    // Vet Treats Winners
    petVet.treat(catWon)
    petVet.treat(fishWon)
    petVet.treat(petWon)
    println()


    // Retailer sells
    println("--- Retailer Sells -----------------------")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    print("dogRetailer ")
    dogRetailer.sell() // Sell Dog

    val fishRetailer: Retailer<Fish> = FishRetailer()
    print("fishRetailer ")
    fishRetailer.sell() // Sell Fish

    val catRetailer: Retailer<Cat> = CatRetailer()
    print("catRetailer ")
    catRetailer.sell() // Sell Cat
    val petRetailer: Retailer<Pet> = CatRetailer()
    print("petRetailer ")
    petRetailer.sell() // Sell Cat
	

    println(); println()
}


// Pet Superclass Abstract
abstract class Pet(var name: String) {

}

// Cat Sub-class
class Cat(name: String): Pet(name) {

}

// Dog Sub-class
class Dog(name: String): Pet(name) {

}

// Fish Sub-class
class Fish(name: String): Pet(name) {

}



// Contest class Generic
class Contest<T: Pet>(var vet: Vet<in T>) {  // 'in' means Contra-variant

    var scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, scr: Int = 0) {

        if(scr >= 0 && scr <= 100) scores.put(t, scr)
    }

    fun getWinners() : MutableSet<T> {

        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()

        for((t, scr) in scores) {
            if (scr == highScore) {
                winners.add(t)
            }
        }
        return winners
    }
}

// Vet class
class Vet<T: Pet> {

    fun treat(t: T) {
        println("Vet Treated winner pet: ${t.name}")
    }
}



// Retailer interface Generic
interface Retailer<out T> { // 'out' means Co-variant

    fun sell(): T
}

// CatRetailer Sub-class
class CatRetailer: Retailer<Cat> {

    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }

}

// DogRetailer Sub-class
class DogRetailer: Retailer<Dog> {

    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}

// FishRetailer Sub-class
class FishRetailer: Retailer<Fish> {
    
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}


