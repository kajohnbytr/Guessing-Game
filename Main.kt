import kotlin.random.Random
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val numGes = Random.nextInt(1, 10) // Generates a random number between 1 and 10
    print("How many lives: ")
    var lives = scan.nextInt()

    while (lives > 0) {
        if (game(numGes, scan)) {
            println("Congrats! You guessed the right number.")
            break
        } else {
            lives--
            if (lives > 0) {
                println("Try again. Lives remaining: $lives")
            } else {
                println("Game over! The correct number was $numGes.")
            }
        }
    }
}

fun game(numGes: Int, scan: Scanner): Boolean {
    print("Guess the number: ")
    val guess = scan.nextInt()

    return when {
        guess > numGes -> {
            println("Lower")
            false
        }
        guess < numGes -> {
            println("Higher")
            false
        }
        else -> true
    }
}
