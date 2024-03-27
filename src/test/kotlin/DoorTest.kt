import org.example.Door
import kotlin.test.Test
import kotlin.test.assertFalse

class DoorTest {
    @Test
    fun `door is initially closed`(){
        val door = Door()

        assertFalse { door.isOpen() }
    }
}