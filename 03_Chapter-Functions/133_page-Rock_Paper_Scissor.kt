import kotlin.random.Random

fun main() {
    // HFK C3 page 133-176 - Rock, Paper, Scissor game -

    // Computer will choose any random out of these 3 options.
    // User will also enter his choice out of these 3 options.
    // Both the choices will be matched with each other & Result will be shown.
    // Result will be based upon the rules of the game.

    println("Rock🤜, Paper🫱, Scissor✌️- Game __________________________")
    println(); println()

    // Array of Rock, Paper, Scissor options
	val optionsArray = arrayOf("Rock", "Paper", "Scissor")


    val userChoice = getUserChoice(optionsArray) // User choice

    println(); println()

    val compChoice = getComputerChoice(optionsArray) // Computer choice
    
    printResult(userChoice, compChoice)

}


// Computer Choice function
fun getComputerChoice(options: Array<String>): String {

    val compRandom = Random.nextInt(options.size)

    return options[compRandom]
}


// User Choice function
fun getUserChoice(options: Array<String>): String {

    print("Enter any one of these 3 options :- ")
    for(items in options) print("$items ")
    println(); println()

    val userInput: String? = readLine()

    if (userInput != null && userInput in options) {
        println("You have entered : $userInput.")
        println("It's a valid option.")
        return userInput
    } else {
        println("You entered invalid option : '$userInput'.")
        return getUserChoice(options)
    }
}


// Print Result function
fun printResult(userChoice: String, compChoice: String) {

    // var whoWin = if () "its Draw" else if () "You win" else "I win"
    
    println("$userChoice, $compChoice")

}
