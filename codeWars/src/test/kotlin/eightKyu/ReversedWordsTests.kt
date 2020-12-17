package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ReversedWordsTests {
    @Test
    fun sample() {
        assertThat(reverseWords("I like eating")).isEqualTo("eating like I")
        assertThat(reverseWords("I like flying")).isEqualTo("flying like I")
        assertThat(reverseWords("The world is nice")).isEqualTo("nice is world The")
        assertThat(reverseWords("Just Split it!!")).isEqualTo("it!! Split Just")
        assertThat(reverseWords("! !! !!!")).isEqualTo("!!! !! !")
        assertThat(reverseWords("7 77 777 7777")).isEqualTo("7777 777 77 7")
        assertThat(reverseWords("Jpazzy : D")).isEqualTo("D : Jpazzy")
    }

    companion object {
        //Complete the solution so that it reverses all of the words within the string passed in.
        fun reverseWords(str: String): String = str.split(" ").reversed().joinToString().replace(",","")
    }
}