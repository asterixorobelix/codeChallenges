package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class KeepHydratedTests {
    @Test
    fun testFixed() {
        assertThat(litres(2.0)).isEqualTo(1)
        assertThat(litres(1.4)).isEqualTo(0)
        assertThat(litres(12.3)).isEqualTo(6)
        assertThat(litres(0.82)).isEqualTo(0)
        assertThat(litres(11.8)).isEqualTo(5)
        assertThat(litres(1787.0)).isEqualTo(893)
        assertThat(litres(0.0)).isEqualTo(0)
    }

    companion object {
        //You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
        fun litres(time: Double) = (time * 0.5).toInt()
    }
}