import AlgorithmWarmUp.Companion.aVeryBigSum
import AlgorithmWarmUp.Companion.compareTriplets
import AlgorithmWarmUp.Companion.diagonalDifference
import AlgorithmWarmUp.Companion.fizzBuzz
import AlgorithmWarmUp.Companion.miniMaxSum
import AlgorithmWarmUp.Companion.staircase
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class AlgorithmWarmUpTests {

    @Test
    fun compareTripletsTest() {
        val a = arrayOf(1, 2, 3)
        val b = arrayOf(3, 2, 1)
        assertThat(compareTriplets(a, b)).isEqualTo(arrayOf(1, 1))

        val a1 = arrayOf(5, 6, 7)
        val b1 = arrayOf(3, 6, 10)

        assertThat(compareTriplets(a1, b1)).isEqualTo(arrayOf(1, 1))

        val a2 = arrayOf(17, 28, 30)
        val b2 = arrayOf(99, 16, 8)

        assertThat(compareTriplets(a2, b2)).isEqualTo(arrayOf(2, 1))
    }

    @Test
    fun veryBigSumTest() {
        assertThat(aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005))).isEqualTo(
            5000000015
        )
    }

    @Test
    fun diagonalDifferenceTest() {
        assertThat(
            diagonalDifference(
                arrayOf(
                    arrayOf(3), arrayOf(
                        11, 2, 4
                    ), arrayOf(
                        4, 5, 6
                    ), arrayOf(
                        10, 8, -12
                    )
                )
            )
        ).isEqualTo(15)
    }

    @Test
    fun staircaseTest() {
        assertThat(staircase(6)).isEqualTo(
            "     #" +
                    "    ##" +
                    "   ###" +
                    "  ####" +
                    " #####" +
                    "######"
        )
    }

    @Test
    fun minMaxSumTest() {
        assertThat(miniMaxSum(arrayOf(1, 2, 3, 4, 5))).isEqualTo(arrayOf(10, 14))
    }

    @Test
    fun fizzBuzzTest() {
        assertThat(fizzBuzz(15)).isEqualTo(
            listOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            )
        )
    }

}