// HFK Appendix-C Page 664 - Enum Classes

// Enum Class BandMember
enum class BandMember(val instrument: String) {

    JERRY("Lead Guitar"){
        override fun sings() = "Plaintively"
    },
    BOBBY("Rhythm Guitar"){
        override fun sings() = "Hoarsely"
    },
    PHIL("Bass");

    open fun sings() = "Ocassionally"
}

// Main Function
fun main() {
    var selectedBandMember: BandMember
    selectedBandMember = BandMember.JERRY

    println(selectedBandMember)
    println(selectedBandMember.instrument)
    println(selectedBandMember.sings())
}


