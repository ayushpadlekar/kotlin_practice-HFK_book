// HFK C5 page 270 - Be the Compiler - Exercise

// Expected Output:-
// Fancy a bite?
// Fire!
// Aargh!

open class Monster {

    open fun frighten(): Boolean {
        println("Aargh!")

        return true
    }

}

class Vampyre: Monster() {

    override fun frighten(): Boolean {
        println("Fancy a bite?")

        return true
    }
}

class Dragon: Monster() {

    override fun frighten(): Boolean {
        println("Fire!")

        return true
    }
}

fun main() {

    val m = arrayOf(Vampyre(), Dragon(), Monster())

    for(item in m) {
        item.frighten()
    }
	
}
