package eightKyu

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ReturningStringsTests {
    @Test
    fun `Basic tests`() {
        assertThat(greet("Ryan")).isEqualTo( "Hello, Ryan how are you doing today?")
        assertThat(greet("Shingles")).isEqualTo( "Hello, Shingles how are you doing today?")
    }

    companion object{
        fun greet(name: String)= "Hello, $name how are you doing today?"
    }
}