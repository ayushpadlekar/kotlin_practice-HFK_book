// HFK C4 page 195 - Code Magnets Exercise
// Output should be :-
// ding ding ba-da-bing!
// bang bang bang!
// ding ding ba-da-bing!


class drumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {

    fun playTopHat() {

        if (hasTopHat) println("ding ding ba-da-bing!")
    }

    fun playSnare() {

        if (hasSnare) println("bang bang bang!")
    }
}

fun main() {
	
    var d = drumKit(true, true)

    d.playTopHat()
    d.playSnare()

    d.hasSnare = false

    d.playTopHat()
    d.playSnare()
}

