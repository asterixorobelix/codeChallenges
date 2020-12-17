package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ShortestWordTests {
    @Test
    fun testFixed() {
        assertThat(findShort("bitcoin take over the world maybe who knows perhaps")).isEqualTo(3)
        assertThat(findShort("turns out random test cases are easier than writing out basic ones")).isEqualTo(3)
    }

    companion object {
        fun findShort(s: String) = s.split(" ").minByOrNull { it.length }?.length
    }
}