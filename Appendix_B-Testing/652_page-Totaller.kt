// HFK Appendix B Page 652 - Testing
// Totaller Class - adds numbers in total variable

class Totaller(var total: Int = 0) {

    fun add(num: Int): Int {
        total += num

        return  total
    }
}
