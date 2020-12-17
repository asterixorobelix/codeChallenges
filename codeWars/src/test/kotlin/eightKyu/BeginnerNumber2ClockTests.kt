package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class BeginnerNumber2ClockTests {
    @Test
    fun basicTests() {
        assertThat(past(0, 1, 1)).isEqualTo(61000)
        assertThat( past(1, 1, 1)).isEqualTo(3661000)
        assertThat( past(0, 0, 0)).isEqualTo(0)
        assertThat( past(1, 0, 1)).isEqualTo(3601000)
        assertThat( past(1, 0, 0)).isEqualTo(3600000)
    }

    companion object{
        fun past(h: Int, m: Int, s: Int)=(60*60*h +60*m +s)*1000
    }
}