package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MultiplyTests {

    @Test
    @Throws(Exception::class)
    fun test_Associativity_Of_Multiplication() {
        for (i in 0..99) {
            val a = Math.random()
            val b = Math.random()
            val c = Math.random()
            println( String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c))
            assertThat(
                multiply(multiply(a, b), c)
            ).isEqualTo(
                multiply(a, multiply(b, c))
            )
        }
    }

    companion object{
        fun multiply(x: Double, y: Double) = (x * y)
    }
}