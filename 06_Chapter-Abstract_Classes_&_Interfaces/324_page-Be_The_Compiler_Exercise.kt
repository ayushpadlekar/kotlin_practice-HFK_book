// HFK C6 page 324 - Be the Compiler Exercise
// Expected Output:-
// Plane is flying
// Superhero is flying

interface Flyable {
    val x: String

    fun fly() {
        println("$x is flying")
    }
}

class Bird : Flyable {
    override val x = "Bird"
}


class Plane : Flyable {
    override val x = "Plane"
}


class Superhero : Flyable {
    override val x = "Superhero"
}


fun main() {
	val f = arrayOf(Bird(), Plane(), Superhero())

    var x = 0

    while(x in 0..2) {

        // 1st method
        when(f[x]) {
            is Bird -> {
                x++
                f[x].fly()
            }
            is Plane, is Superhero -> f[x].fly()
        }

        // 3rd method
        when(f[x]) {
            is Plane, is Superhero -> f[x].fly()
        }

        // 4th method
        val y = when(f[x]) {
            is Bird -> false
            else -> true
        }
        if (y) { f[x].fly() }

        //
        x++
    }
}
