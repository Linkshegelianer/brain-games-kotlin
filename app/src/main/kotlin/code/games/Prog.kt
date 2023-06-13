package code.games

import code.Engine
import java.util.*

class Prog {

    companion object {
        private const val QUESTION_ROW_NUMBER = 0
        private const val ANSWER_ROW_NUMBER = 1
        private const val TASK = "What number is missing in the progression?"
        private const val MAX_RANDOM_NUMBER = 100
        private const val MIN_NUMBERS_IN_A_ROW = 5
        private const val MAX_NUMBERS_IN_A_ROW = 10
        private const val MIN_INCREMENT = 5
        private const val MAX_INCREMENT = 30
    }

    fun start() {
        val questionsAnswers: Array<Array<String?>> = generateProg()
        val engine = Engine()
        engine.startGame(TASK, questionsAnswers)
    }

    private fun generateProg(): Array<Array<String?>> {
        val questionsAnswers = Array(Engine.ROUNDS_COUNT) {
            arrayOfNulls<String>(
                2
            )
        }
        for (questionAnswer in questionsAnswers) {
            val random = Random()
            val numbersInARow = random.nextInt(MIN_NUMBERS_IN_A_ROW, MAX_NUMBERS_IN_A_ROW)
            val hiddenNumberIndex = random.nextInt(0, numbersInARow - 1)
            val increment = random.nextInt(MIN_INCREMENT, MAX_INCREMENT)
            var currentNumber = random.nextInt(0, MAX_RANDOM_NUMBER)
            val progression = arrayOfNulls<String>(numbersInARow)
            for (j in 0 until numbersInARow) {
                if (j != hiddenNumberIndex) {
                    progression[j] = currentNumber.toString()
                } else {
                    progression[j] = ".."
                    questionAnswer[ANSWER_ROW_NUMBER] = currentNumber.toString()
                }
                currentNumber += increment
            }
            questionAnswer[QUESTION_ROW_NUMBER] = java.lang.String.join(" ", *progression)
        }
        return questionsAnswers
    }
}