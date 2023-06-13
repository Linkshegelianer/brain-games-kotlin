package code.games

import code.Engine
import java.util.*

class Prime {

    companion object {
        private const val QUESTION_ROW_NUMBER = 0
        private const val ANSWER_ROW_NUMBER = 1
        private const val TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'."
        private const val MAX_RANDOM_NUMBER = 100
    }

    fun start() {
        val questionsAnswers = Array(Engine.ROUNDS_COUNT) {
            arrayOfNulls<String>(
                2
            )
        }

        for (questionAnswer in questionsAnswers) {
            val random = Random()
            val questionNumber = random.nextInt(MAX_RANDOM_NUMBER)
            questionAnswer[QUESTION_ROW_NUMBER] = questionNumber.toString()
            questionAnswer[ANSWER_ROW_NUMBER] = if (isPrime(questionNumber)) "yes" else "no"
        }
        val engine = Engine()
        engine.startGame(TASK, questionsAnswers)
    }

    private fun isPrime(currentNumber: Int): Boolean {
        if (currentNumber < 2) {
            return false
        }
        for (i in 2..currentNumber / 2) {
            if (currentNumber % i == 0) {
                return false
            }
        }
        return true
    }
}