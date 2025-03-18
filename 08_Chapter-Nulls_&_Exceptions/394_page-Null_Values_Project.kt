// HFK C8 page 394 - Null Values Project

// Wolf Class
class Wolf {

    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}

// myWolf Class
class myWolf {

    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

// getAlphaWolf Function
fun getAlphaWolf() : Wolf? {
    return Wolf()
}

// Main Function
fun main() {
	
    var w: Wolf? = Wolf() // nullable Wolf object in w variable

    // if approach to check w is null or not
    if (w != null) {
        w.eat()
    }

    // if w is not null, put value of hunger into x variable
    var x = w?.hunger
    println("The value of x is $x")

    // Use of Elvis operator - if w & hunger is null use -1 value
    // w = null
    var y = w?.hunger ?: -1
    println("The value of y is $y")

    // myWolf object to access Wolf object properties
    var myWolf = myWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")
    
    // This prints non null items of array - using 'let it'
    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let{
            println(it)
        }
    }

    // getAlphaWolf function call with 'let it' to access Wolf
    getAlphaWolf()?.let {
        it.eat()
    }

    // w = null
    // var z = w!!.hunger
}
