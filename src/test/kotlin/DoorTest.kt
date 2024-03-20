import org.example.Door
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DoorTest {
    @Test
    fun `should open the door provided a signal to open the door`(){
        val door = Door()

        door.open()

        assertEquals(true, door.isOpen())
    }
}