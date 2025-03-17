// HFK C7 page 347 - Mixed Messages - Exercise

// Movie Data Class
data class Movie(val title: String, val year: String)

// Song Class
class Song(val title: String, val artist: String)

// Main Function
fun main() {

    var m1 = Movie("Black Panther", "2018")
    var m2 = Movie("Jurassic World", "2015")
    var m3 = Movie("Jurassic World", "2015")

    var s1 = Song("Love Cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love Cats", "The Cure")

    candidate1(m2, m3)
    println()

    candidate2(s1, s3)
    println()

    candidate3(m1)
    println()

    candidate4(m1)
    println()

    candidate5(m2, m3)
    println()
	
}

// Candidate 1
fun candidate1(m2: Movie, m3: Movie) {

    println("Candidate 1:  \n println(m2 == m3)")
    println(m2 == m3)
    // true
}

// Candidate 2
fun candidate2(s1: Song, s3: Song) {

    println("Candidate 2:  \n println(s1 == s3)")
    println(s1 == s3)
    // false
}

// Candidate 3
fun candidate3(m1: Movie) {

    println("Candidate 3:  \n var m4 = m1.copy() \n println(m1 == m4)")
    var m4 = m1.copy()
    println(m1 == m4)
    // true
}

// Candidate 4
fun candidate4(m1: Movie) {

    println("Candidate 4:  \n var m5 = m1.copy() \n println(m1 === m5)")
    var m5 = m1.copy()
    println(m1 === m5)
    // false
}

// Candidate 5
fun candidate5(m2: Movie, m3: Movie) {

    println("Candidate 5:  \n var m6 = m2 \n m2 = m3 \n println(m3 == m6)")
    var m6 = m2
    // m2 = m3  //...Val cannot be reassigned
    println(m3 == m6)
    // true
}

