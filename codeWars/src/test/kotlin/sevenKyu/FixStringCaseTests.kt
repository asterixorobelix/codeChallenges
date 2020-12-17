package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FixStringCaseTests {
    /*
    In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:
    * make as few changes as possible.
    * if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
     */
    @Test
    fun basicTests() {
        assertThat("code").isEqualTo(solve("code"))
        assertThat("CODE").isEqualTo(solve("CODe"))
        assertThat("code").isEqualTo(solve("COde"))
        assertThat("code").isEqualTo(solve("Code"))
        assertThat("").isEqualTo(solve(""))
    }

    fun solve(s: String): String {
        val lowerCaseStrings = s.filter { it.isLowerCase() }.count()
        val upperCaseStrings = s.count() - lowerCaseStrings

        return s.map {
            when(lowerCaseStrings in 1 until upperCaseStrings){
                true -> it.toUpperCase()
                else -> {
                    if (it.isUpperCase())it.toLowerCase() else it
                }
            }
        }.joinToString("")
    }
}