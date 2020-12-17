package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FindScreenSizeTests {
    @Test
    fun test4By3() {
        assertThat("1024x768").isEqualTo(findScreenHeight(1024, "4:3"))
    }

    @Test
    fun test16By9() {
        assertThat("1280x720").isEqualTo(findScreenHeight(1280, "16:9"))
    }

    @Test
    fun test32By9() {
        assertThat("3840x1080").isEqualTo(findScreenHeight(3840, "32:9"))
    }

    companion object {
        fun findScreenHeight(width: Int, ratio: String): String {
            val list = ratio.split(":").map {
                it.toDouble()
            }
            val height = ((list[1] / list[0]) * width).toInt()

            return "${width}x${height}"
        }
    }
}