package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ATMTests {
    /*
    There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.
    You are given money in nominal value of n with 1<=n<=1500.
    Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.
     */

    @Test
    fun `ATM Payment Possible`() {
        assertThat(count(770)).isEqualTo(4)
        assertThat(count(10)).isEqualTo(1)
    }

    @Test
    fun `ATM Payment Impossible`() {
        assertThat(count(125)).isEqualTo(-1)
        assertThat(count(238)).isEqualTo(-1)
    }

    fun count(number: Int): Int {
        val remainingNotes = listOf(
            200, 100, 50, 20, 10
        )
        val fiveHundredNotes = number / 500
        var amountRemaining = number - (fiveHundredNotes * 500)

        val isBase10 = number.toDouble().rem(10.0)==0.0

        return if(isBase10){
            remainingNotes.fold(fiveHundredNotes) { acc, value ->
                val numberNotes = amountRemaining / value
                if (numberNotes > 0) {
                    amountRemaining -= numberNotes * value
                    acc + numberNotes
                } else
                    acc
            }
        } else
            -1
    }
}