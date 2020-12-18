package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PrinterErrorTests {
    /*
    In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
    The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
    Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
    You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string.
    Don't reduce this fraction to a simpler expression.
     */
    @Test
    fun testFixed() {
        assertThat(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")).isEqualTo("3/56")
        assertThat(printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")).isEqualTo("6/60")
        assertThat(printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu")).isEqualTo("11/65")
        assertThat(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmm")).isEqualTo("0/53")
    }

    fun printerError(s: String): String {
        val (errors, noErrors) = s.fold(Pair(0, 0)) { acc: Pair<Int, Int>, c: Char ->
            Pair(acc.first + if (c in 'a'..'m') 0 else 1, acc.second + if (c in 'a'..'m') 1 else 0)
        }
        return "$errors/${s.count()}"
    }
}