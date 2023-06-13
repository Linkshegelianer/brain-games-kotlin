package code.games

import code.Engine
import java.util.*

class Even {

    companion object {
        private const val QUESTION_ROW_NUMBER = 0
        private const val ANSWER_ROW_NUMBER = 1
        private const val TASK = "Answer 'yes' if the number is even, otherwise answer 'no'."
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
            questionAnswer[ANSWER_ROW_NUMBER] = if (isEven(questionNumber)) "yes" else "no"
        }
        val engine = Engine()
        engine.startGame(TASK, questionsAnswers)
    }

    private fun isEven(currentNumber: Int): Boolean {
        return currentNumber % 2 == 0
    }
}