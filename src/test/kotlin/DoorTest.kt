import org.example.Door
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DoorTest {
    @Test
    fun `door is initially closed`(){
        val door = Door()

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should change the state to open when the door is opened`(){
        val door = Door()

        door.open()

        assertTrue { door.isOpen() }
    }
}