fun main() {
    // HFK C2 page 113 - Phrase-O-Matic exercise

    // Title
    println("Phrase-O-Matic exercise :"); println() //


    // Arrays of words, Print them
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    println("Arr 1 : " + wordArray1.joinToString())
    println("Arr 2 : ${wordArray2.joinToString()}")
    println("Arr 3 : ${wordArray3.joinToString()}")

    println() //


    // get array size, print them
    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    println("Arr size 1 : $arraySize1")
    println("Arr size 2 : $arraySize2")
    println("Arr size 3 : $arraySize3")

    println() //
    

    // get random number in between array size, print them
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    println("Random 1 : $rand1")
    println("Random 2 : $rand2")
    println("Random 3 : $rand3")

    println() //


    // make phrase of random words from all the arrays, through putting those random numbers as an index in the arrays.
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    // print the phrase
    println("Phrase is : $phrase")
	
}
