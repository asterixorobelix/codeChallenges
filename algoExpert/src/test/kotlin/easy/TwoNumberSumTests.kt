import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TwoNumberSumTests {

    @Test
    fun test() {
        /*
        If any two numbers in the input array sum up to the target sum, return them. Else, return an empty array.
        You cant add an integer to itself
         */
        assertThat(twoNumberSum(mutableListOf(3, 5, -4, 8, 11, 1, -1, 6), 10)).isEqualTo(listOf( 11,-1))
        assertThat(twoNumberSum(mutableListOf(4,6,1), 5)).isEqualTo(listOf(4, 1))
    }

    fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        val secondNumber = mutableListOf<Pair<Int,Int>>()
        array.forEach{
            secondNumber.add(Pair(it,targetSum - it))
        }
        val filteredNumbers = secondNumber.firstOrNull {
            it.second in array && it.second != it.first
        }

        return if (filteredNumbers == null) emptyList() else listOf(filteredNumbers.first, filteredNumbers.second)
    }
}