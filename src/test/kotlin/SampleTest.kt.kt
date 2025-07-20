import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testAddition() {
        assertEquals(2, 1 + 1, "Test passes")
    }

    @Test
    fun testFailingCase() {
        assertEquals(5, 2 + 2, "Test fails")
    }
}