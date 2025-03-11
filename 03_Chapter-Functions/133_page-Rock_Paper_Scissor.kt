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
    
    if (userChoice in optionsArray) {
    printResult(userChoice, compChoice) // Print Result
    }

}



// Computer Choice function
fun getComputerChoice(options: Array<String>): String {

    val compRandom = Random.nextInt(options.size)

    return options[compRandom]
}


// User Choice function
fun getUserChoice(options: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""

    while(!isValidChoice) {

        print("Enter any one :- ")
        for(items in options) print("$items ")
        println(); println()

        val userInput = readLine()

        if (userInput != null && userInput in options) {

            isValidChoice = true
            userChoice = userInput

            println("You entered : $userInput")
            println("It's a valid option.")

        } else {
            println("Invalid option")
        }

        if (!isValidChoice) println("Please enter a valid choice")
    }

    return userChoice
}


// Print Result function
fun printResult(userChoice: String, compChoice: String) {
    
    println("You chose $userChoice, I chose $compChoice")
    println()

    // var whoWin = if () "its Draw" else if () "You win" else "I win"
    // println(whoWin)

    if (userChoice == compChoice) {

        println("Its a Tie! Lets play again 😼")

    } else if (
        (userChoice == "Rock" && compChoice == "Scissor") ||
        (userChoice == "Paper" && compChoice == "Rock") ||
        (userChoice == "Scissor" && compChoice == "Paper")
    ) {
        println("Congrats! You Win 🥳🎉")
    } else {
        println("You Lose 😔. Lets play again.")
    }
    
}
