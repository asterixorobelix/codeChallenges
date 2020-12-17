package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TwoOldestAgesTests {

    @Test
    fun tests() {
        assertThat(twoOldestAges(listOf(1, 5, 87, 45, 8, 8))).isEqualTo(listOf(45, 87))
        assertThat(twoOldestAges(listOf(6, 5, 83, 5, 3, 18))).isEqualTo(listOf(18, 83))
    }

    companion object {
        fun twoOldestAges(ages: List<Int>) = ages.sorted().takeLast(2)
    }
}