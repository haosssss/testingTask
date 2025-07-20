import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SampleTest {
    @Test
    fun testAddition() {
        assertEquals(2, 1 + 1, "Test passes")
    }

    @Test
    fun testFailingCase() {
        assertEquals(4, 2 + 2, "Test fails")
    }
}