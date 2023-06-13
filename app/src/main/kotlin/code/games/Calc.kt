package code.games

import code.Engine
import java.util.*

class Calc {

    companion object {
        private const val QUESTION_ROW_NUMBER = 0
        private const val ANSWER_ROW_NUMBER = 1
        private const val TASK = "What is the result of the expression?"
        private const val MAX_RANDOM_NUMBER = 100
        private val MATH_OPERATORS = charArrayOf('+', '-', '*')
    }

    fun start() {
        val questionsAnswers = Array(Engine.ROUNDS_COUNT) {
            arrayOfNulls<String>(
                2
            )
        }
        for (questionAnswer in questionsAnswers) {
            val random = Random()
            val firstNum = random.nextInt(MAX_RANDOM_NUMBER)
            val secondNum = random.nextInt(MAX_RANDOM_NUMBER)
            val randomIndexOperator = (Math.random() * MATH_OPERATORS.size).toInt()
            val operator = MATH_OPERATORS[randomIndexOperator]
            when (operator) {
                '+' -> questionAnswer[ANSWER_ROW_NUMBER] = (firstNum + secondNum).toString()
                '-' -> questionAnswer[ANSWER_ROW_NUMBER] = (firstNum - secondNum).toString()
                '*' -> questionAnswer[ANSWER_ROW_NUMBER] = (firstNum * secondNum).toString()
                else -> throw RuntimeException("Unknown input: $operator")
            }
            questionAnswer[QUESTION_ROW_NUMBER] = "$firstNum $operator $secondNum"
        }
        val engine = Engine()
        engine.startGame(TASK, questionsAnswers)
    }
}