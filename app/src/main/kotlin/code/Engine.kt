package code

import java.util.*

class Engine {

    companion object {
        const val QUESTION_ROW_NUMBER = 0
        const val ANSWER_ROW_NUMBER = 1
        const val ROUNDS_COUNT = 3
    }

    fun startGame(task: String, questionsAnswers: Array<Array<String?>>) {
        println("\n" +
                "Welcome to the Brain Games!")
        println("May I have your name? ")
        val console = Scanner(System.`in`)
        val username = console.nextLine()
        println("Hello, $username!")
        println(task)

        for (questionAnswer: Array<String?> in questionsAnswers) {
            val correctAnswer = questionAnswer[ANSWER_ROW_NUMBER]
            println("Question: " + questionAnswer[QUESTION_ROW_NUMBER])
            print("Your answer: ")
            val currentAnswer = console.nextLine()
            val isAnswerCorrect = currentAnswer == correctAnswer
            if (isAnswerCorrect) {
                println("Correct!")
            } else {
                println(
                    "'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer + "'."
                )
                println("Let's try again, $username!")
                return
            }
        }
        println("Congratulations, $username!")
    }
}