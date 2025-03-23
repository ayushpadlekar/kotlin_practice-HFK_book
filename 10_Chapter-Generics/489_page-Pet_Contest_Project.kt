// HFK C10 Page 489 - Generic Pet, Contest, Retailers, Vet

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

    // Cat Contest
    println("--- Cat Contest -----------------------")
    val catContest = Contest<Cat>()
    catContest.addScore(catMancho, 30)
    catContest.addScore(catRancho, 80)
    catContest.addScore(catTancho, 60)
    catContest.addScore(catDancho, 95)
    println(catContest.scores)
    val catWon = catContest.getWinners().first()
    println("Winner: " + catWon.name)
    println()

    // Fish Contest
    println("--- Fish Contest -----------------------")
    val fishContest = Contest<Fish>()
    fishContest.addScore(fishFinny, 50)
    fishContest.addScore(fishMinny, 65)
    fishContest.addScore(fishKinny, 85)
    println(fishContest.scores)
    val fishWon = fishContest.getWinners().first()
    println("Winner: " + fishWon.name)
    println()

    // Pet Contest
    println("--- Pet Contest -----------------------")
    val petContest = Contest<Pet>()
    petContest.addScore(fishFinny, 45)
    petContest.addScore(fishMinny, 55)
    petContest.addScore(catMancho, 35)
    println(petContest.scores)
    val petWon = petContest.getWinners().first()
    println("Winner: " + petWon.name)
    println()


	

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
class Contest<T: Pet> {

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
class Vet<T> {

}



// Retailer interface Generic
interface Retailer<T> {

}

// CatRetailer Sub-class
class CatRetailer: Retailer<Cat> {

}

// DogRetailer Sub-class
class DogRetailer: Retailer<Dog> {

}

// FishRetailer Sub-class
class FishRetailer: Retailer<Fish> {
    
}

