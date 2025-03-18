// HFK C8 page 415 - Code Magnets Exercise
// Expected Output:-
// if value of test is "Yes" :- thaws
// if value of test is "No" :- throws

fun main() {
    // put "No" or "Yes" to test
	myFunction("Yes")
    println()
    myFunction("No")
}

class BadException : Exception()

fun myFunction(test: String) {
	try {
		print("t")
		print("h")
		riskyCode(test)
	} catch (e: BadException) {
		print("a")
	} finally {
		print("w")
		print("s")
	}
}

fun riskyCode(test: String) {
	if (test == "Yes") {
		throw BadException()
	}
	print("r")
	print("o")
}
