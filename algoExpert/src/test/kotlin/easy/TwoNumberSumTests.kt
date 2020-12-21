import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TwoNumberSumTests {

    @Test
    fun test() {
        /*
        If any two numbers in the input array sum up to the target sum, return them. Else, return an empty array.
        You cant add an integer to itself
         */
        assertThat(twoNumberSum(mutableListOf(3, 5, -4, 8, 11, 1, -1, 6), 10)).isEqualTo(listOf(11, -1))
        assertThat(twoNumberSum(mutableListOf(4, 6, 1), 5)).isEqualTo(listOf(4, 1))
        assertThat(twoNumberSum(mutableListOf(4, 6), 10)).isEqualTo(listOf(4, 6))
        assertThat(twoNumberSum(mutableListOf(4, 6, 1, -3), 3)).isEqualTo(listOf(6,-3))
        assertThat(twoNumberSum(mutableListOf(1,2,3,4,5,6,7,8,9), 17)).isEqualTo(listOf(8,9))
        assertThat(twoNumberSum(mutableListOf(-21,301,12,5,65,56,210,356,9,-47), 163)).isEqualTo(listOf(210,-47))
        assertThat(twoNumberSum(mutableListOf(15), 15)).isEqualTo(emptyList<Int>())
    }

    @Test
    fun test2() {
        /*
        If any two numbers in the input array sum up to the target sum, return them. Else, return an empty array.
        You cant add an integer to itself
         */
        assertThat(twoNumberSumOption2(mutableListOf(3, 5, -4, 8, 11, 1, -1, 6), 10)).isEqualTo(listOf(-1, 11))
        assertThat(twoNumberSumOption2(mutableListOf(4, 6, 1), 5)).isEqualTo(listOf( 1,4))
    }

    fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        val secondNumber = mutableListOf<Pair<Int, Int>>()
        array.forEach {
            secondNumber.add(Pair(it, targetSum - it))
        }
        val filteredNumbers = secondNumber.firstOrNull {
            it.second in array && it.second != it.first
        }

        return if (filteredNumbers == null) emptyList() else listOf(filteredNumbers.first, filteredNumbers.second)
    }

    fun twoNumberSumOption2(array: MutableList<Int>, targetSum: Int): List<Int> {
        array.sort()
        var left = 0
        var right = array.size - 1

        while (left < right) {
            var leftValue = array[left]
            var rightValue = array[right]
            var combinedValues = leftValue + rightValue
            if (combinedValues == targetSum) {
                return listOf(leftValue, rightValue)
            } else {
                if (combinedValues > targetSum){
                    right --
                }
                else{
                    left ++
                }
            }
        }
        return emptyList()
    }
}