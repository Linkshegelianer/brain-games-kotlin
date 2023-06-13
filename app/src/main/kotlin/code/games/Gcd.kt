package code.games

import code.Engine
import java.util.*

class Gcd {

    companion object {
        private const val QUESTION_ROW_NUMBER = 0
        private const val ANSWER_ROW_NUMBER = 1
        private const val TASK = "Find the greatest common divisor of given numbers."
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
            val questionNumber1 = random.nextInt(MAX_RANDOM_NUMBER)
            val questionNumber2 = random.nextInt(MAX_RANDOM_NUMBER)
            questionAnswer[QUESTION_ROW_NUMBER] = questionNumber1.toString() + " " + questionNumber2
            questionAnswer[ANSWER_ROW_NUMBER] = gcd(questionNumber1, questionNumber2).toString()
        }
        val engine = Engine()
        engine.startGame(TASK, questionsAnswers)
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (a == 0) b else gcd(b % a, a)
    }
}