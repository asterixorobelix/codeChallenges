import AlgorithmWarmUp.Companion.compareTriplets
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class AlgorithmWarmUpTests {

    @Test
    fun compareTripletsTest(){
        val a = arrayOf(1,2, 3)
        val b = arrayOf(3, 2, 1)
        assertThat(compareTriplets(a, b)).isEqualTo(arrayOf(1,1))
    }
}