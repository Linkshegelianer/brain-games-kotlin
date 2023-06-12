package code

import java.util.Scanner

class Greet {
    fun greet(): String {
        println("\n" +
                "Welcome to the Brain Games!")
        println("May I have your name? ")
        val console = Scanner(System.`in`)
        val username = console.nextLine()
        println("Hello, $username!")
        return username
    }
}