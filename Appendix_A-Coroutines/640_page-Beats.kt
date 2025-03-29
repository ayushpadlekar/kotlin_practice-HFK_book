// HFK Appendix A Page 640 - Coroutines
// Beats Project

import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if(count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(File(file))
    clip.open(audioInputStream)
    clip.start()
}

fun main() {

    // This creates a new separate background thread & runs code in it.
    // GlobalScope.launch { playBeats("x-----x--x--x--x--x--x--", "toms.aiff") }

    // This doesn't create a separate thread, but runs code in separate coroutine instead, & in the same thread.
    runBlocking {
        launch { playBeats("x-----x--x--x--x--x--x--", "toms.aiff") }
        playBeats("x-----x-----x-----", "crash_cymbal.aiff")
    }
}
