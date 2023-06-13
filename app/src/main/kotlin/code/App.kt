package code

import code.games.*
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
    println("2 - Even")
    println("3 - Calc")
    println("4 - GCD")
    println("5 - Progression")
    println("6 - Prime")
    println("0 - Exit")
    print("Your choice: ")
    val console = Scanner(System.`in`)
    val response = console.nextLine()
    when (response) {
        App.GREET -> {
            val greet = Greet()
            greet.greet()
        }

        App.EVEN -> {
            val even = Even()
            even.start()
        }

        App.CALC -> {
            val calc = Calc()
            calc.start()
        }

        App.GCD -> {
            val gcd = Gcd()
            gcd.start()
        }

        App.PROGRESSION -> {
            val prog = Prog()
            prog.start()
        }

        App.PRIME -> {
            val prime = Prime()
            prime.start()
        }

        App.EXIT -> println("Bye!")
        else -> println("Incorrect command!")
    }
}
