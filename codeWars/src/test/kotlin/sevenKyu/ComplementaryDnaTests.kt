package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ComplementaryDnaTests {
    @Test
    fun test01() {
        assertThat("TTTT").isEqualTo(makeComplement("AAAA"))
    }

    @Test
    fun test02() {
        assertThat("TAACG").isEqualTo(makeComplement("ATTGC"))
    }

    companion object {
        fun makeComplement(dna: String): String {
            return dna.map {
                when(it){
                    'A'->'T'
                    'T'-> 'A'
                    'C'->'G'
                    else -> 'C'
                }
            }.joinToString("")
        }
    }
}