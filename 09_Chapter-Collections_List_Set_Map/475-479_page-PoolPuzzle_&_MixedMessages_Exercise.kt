// HFK C9 Page 475 - Pool Puzzle Exercise
// HFK C9 Page 479 - Mixed Messages Exercise

fun main() {

    poolPuzzle()

    println(); println()
    
    mixedMessages()

    println(); println()
}


// Pool Puzzle Function
fun poolPuzzle() {
    println("----------- Pool Puzzle -----------"); println()

    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Holds values in no particular order."
    val def2 = "Holds key/value pairs."
    val def3 = "Holds values in a sequence."
    val def4 = "Can be updated."
    val def5 = "Can't be updated."
    val def6 = "Can be resized."
    val def7 = "Can't be resized."

    val glossary = mapOf(
        term4 to "$def3 $def4 $def6",
        term7 to "$def1 $def5 $def7",
        term1 to "$def3 $def4 $def7",
        term5 to "$def2 $def4 $def6",
        term2 to "$def3 $def5 $def7",
        term6 to "$def1 $def4 $def6",
        term3 to "$def2 $def5 $def7")

    for ((key, value) in glossary) {
        
        println("$key:  $value")
        println()
    }
}


// Mixed Messages Function
fun mixedMessages() {
    println("----------- Mixed Messages -----------"); println()

    val mList = mutableListOf("Football", "Baseball", "Basketball")
    println("Original List: " + mList)
    println()

    print("Candidate 1 :- ")
    candidate1()
    println() // output - [Baseball, Basketball, Football]

    print("Candidate 2 :- ")
    candidate2()
    println() // output - [Basketball]

    print("Candidate 3 :- ")
    candidate3()
    println() // output - [Basketball, Baseball, Football]

    print("Candidate 4 :- ")
    candidate4()
    println() // output - [Football, Basketball, Baseball]

}

// candidate1 function
fun candidate1() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    mList.sort()
    println(mList)
}

// candidate2 function
fun candidate2() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for(item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)
}

// candidate3 function
fun candidate3() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    
    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)
}

// candidate4 function
fun candidate4() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    
    mList.sort()
    mList.reverse()
    println(mList)
}
