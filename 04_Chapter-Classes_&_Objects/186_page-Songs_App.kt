// HFK C4 page 186 - Songs App

class Song(val title: String, val artist: String) {

    fun play() {
        println("Playing song '$title' by '$artist'")
    }

    fun stop() {
        println("Stopped playing '$title' by '$artist'")
    }

}

fun main() {

    val song1 = Song("Pachtaoge", "Arijit Singh")
    val song2 = Song("Not Afraid", "Eminem")
    val song3 = Song("Humdard", "Arijit Singh")
    val song4 = Song("Runaway", "Aurora")

    // Song 1
    song1.play()
    song1.stop()

    println()

    // Song 2
    song2.play()
    song2.stop()

    println()

    // Song 3
    song3.play()
    song3.stop()

    println()

    // Song 4
    song4.play()
    song4.stop()
	
}
