import org.example.Door
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread
import kotlin.test.assertEquals

class DoorTest {
    @Test
    fun `should open the door provided a signal to open the door`(){
        val door = Door()

        door.open()

        assertEquals(true, door.isOpen())
    }

    @Test
    fun `should close the door automatically after 5 seconds`(){
        val door = Door()

        door.open()

        Thread.sleep(5100)

        assertEquals(false, door.isOpen())
    }
}