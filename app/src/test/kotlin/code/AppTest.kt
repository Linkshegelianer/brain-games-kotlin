package code

import code.Greet
import code.games.Calc
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.*
import kotlin.test.assertEquals

class AppTest {

    @Test
    fun testGreet() {
        val input = ByteArrayInputStream("John".toByteArray())
        val output = ByteArrayOutputStream()
        System.setIn(input)
        System.setOut(PrintStream(output))

        val result = Greet().greet()

        val expectedOutput = "\nWelcome to the Brain Games!\nMay I have your name? \nHello, John!\n"
        assertEquals(expectedOutput, output.toString())

        assertEquals("John", result)
    }
}
