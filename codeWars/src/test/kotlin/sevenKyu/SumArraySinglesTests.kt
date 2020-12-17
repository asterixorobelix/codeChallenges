package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SumArraySinglesTests {
    /*
    Given an array of numbers in which two numbers occur once and the rest occur only twice.
    Your task will be to return the sum of the numbers that occur only once.
    For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.
    Every other number occurs twice.
     */
    @Test
    fun basicTests() {
        assertThat(repeats(intArrayOf(4, 5, 7, 5, 4, 8)).toLong()).isEqualTo(15)
        assertThat(repeats(intArrayOf(9, 10, 19, 13, 19, 13)).toLong()).isEqualTo(19)
        assertThat(repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)).toLong()).isEqualTo(12)
    }

    companion object {
        fun repeats(arr: IntArray): Int = arr.groupBy {
            it
        }.filter {
            it.value.size == 1
        }.keys.sum()
    }

}