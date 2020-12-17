package sevenKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CodewarsLeaderboardClimber {

    @Test
    fun basicTests() {
        assertThat("To beat g964's score, I must complete 5365 Beta kata and 2 8kyu kata. Dammit!").isEqualTo(
            leaderBoard("g964", 36097, 20000)
        )
        assertThat("To beat GiacomoSorbi's score, I must complete 15 Beta kata and 2 8kyu kata.").isEqualTo(
            leaderBoard(
                "GiacomoSorbi",
                23914,
                23867
            )
        )
        assertThat("To beat ZozoFouchtra's score, I must complete 1330 Beta kata and 1 8kyu kata. Dammit!").isEqualTo(
            leaderBoard("ZozoFouchtra", 15991, 12000)
        )
    }

    companion object {

        /*
        We all want to climb the leaderboard. Even given some of the massive scores on there, it's nice to know how close you are...
        In this kata you will be given a username and their score, your score (not your real score) and you need to calculate how many kata you need to complete to beat their score, by 1 point exactly.
        As this is the easy version (harder one to folow at some point in the future), let's assume only Beta kata and 8kyu kata are available. Worth 3 and 1 point respectively.
        Return a string in this format: "To beat <user>'s score, I must complete <x> Beta kata and <y> 8kyu kata."
        If the total number of kata you need to complete >1000, add "Dammit!" to the end of the string, like so: "To beat <user>'s score, I must complete <x> Beta kata and <y> 8kyu kata. Dammit!"
        If your score is higher than the user's already, return "Winning!" and if they are equal, return "Only need one!"
        Note: You are looking to complete as few kata as possible to get to your target.
         */
        fun leaderBoard(user: String, userScore: Int, yourScore: Int): String {
            val difference = userScore - yourScore
            val betaKata = difference / 3
            val statement =
                "To beat $user's score, I must complete $betaKata Beta kata and ${difference - (betaKata * 3)} 8kyu kata."
            return when {
                difference == 0 -> "Only need one!"
                difference < 0 -> "Winning!"
                difference < 1000 -> statement
                else -> "$statement Dammit!"
            }
        }
    }
}