package code

import code.games.Calc
import java.util.Scanner

class App {
    companion object {
        const val GREET = "1"
        const val EVEN = "2"
        const val CALC = "3"
        const val GCD = "4"
        const val PROGRESSION = "5"
        const val PRIME = "6"
        const val EXIT = "0"
    }
}

fun main() {
    println("Please enter the game number and press Enter.")
    println("1 - Greet")
    println("3 - Calc ")
    print("Your choice: ")
    val console = Scanner(System.`in`)
    val response = console.nextLine()
    when (response) {
        App.GREET -> {
            val greet = Greet()
            greet.greet()
        }

        App.CALC -> {
            val calc = Calc()
            calc.start()
        }

        App.EXIT -> println("Bye!")
        else -> println("Incorrect command!")
    }
}
