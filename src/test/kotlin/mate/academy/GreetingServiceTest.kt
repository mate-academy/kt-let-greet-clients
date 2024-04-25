package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreetingServiceTest {

    private val greetingService = GreetingService()

    @Test
    fun `should return empty list when clientNames is empty`() {
        val result = greetingService.getGreetings(emptyList())
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun `should return greeting for single name`() {
        val result = greetingService.getGreetings(listOf("John"))
        assertEquals(listOf("Hello, John!"), result)
    }

    @Test
    fun `should return greetings for multiple names`() {
        val result = greetingService.getGreetings(listOf("John", "Jane", "Doe"))
        assertEquals(listOf("Hello, John!", "Hello, Jane!", "Hello, Doe!"), result)
    }

    @Test
    fun `should skip null names`() {
        val result = greetingService.getGreetings(listOf("John", null, "Doe"))
        assertEquals(listOf("Hello, John!", "Hello, Doe!"), result)
    }

    @Test
    fun `should return empty list for all null names`() {
        val result = greetingService.getGreetings(listOf(null, null, null))
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun `should return greetings for mixed names`() {
        val result = greetingService.getGreetings(listOf("Alice", null, "Bob", null, "Charlie"))
        assertEquals(listOf("Hello, Alice!", "Hello, Bob!", "Hello, Charlie!"), result)
    }

    @Test
    fun `should maintain case sensitivity`() {
        val result = greetingService.getGreetings(listOf("john", "JOHN", "John"))
        assertEquals(listOf("Hello, john!", "Hello, JOHN!", "Hello, John!"), result)
    }

    @Test
    fun `should include whitespace in names`() {
        val result = greetingService.getGreetings(listOf(" John", " Jane "))
        assertEquals(listOf("Hello,  John!", "Hello,  Jane !"), result)
    }
}
