package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class GrasshopperSummationTests {
    @Test
    fun test1() {
        assertThat(summation(1)).isEqualTo(1)
    }
    @Test
    fun test2() {
        assertThat(summation(8)).isEqualTo(36)
    }

    companion object{
        //Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
        fun summation(n:Int)=(1..n).sum()
    }
}