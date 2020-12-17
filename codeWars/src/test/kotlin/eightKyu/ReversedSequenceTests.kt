package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

//8 kyu
class ReversedSequenceTests {
    @Test
    fun exampleTestCases() {
        assertThat(listOf(5, 4, 3, 2, 1)).isEqualTo(revereSeq(5))
    }

    companion object {
        //Build a function that returns an array of integers from n to 1 where n>0.
        fun revereSeq(n: Int): List<Int> = n.downTo(1).toList()
    }
}