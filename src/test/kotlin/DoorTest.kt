import org.example.Door
import kotlin.concurrent.thread
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

    @Test
    fun `should change the state to close when the door is closed`(){
        val door = Door()

        door.open()
        door.close()

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should close the door after 100 milliseconds automatically`(){
        val door = Door(100)

        door.open()

        Thread.sleep(100)

        assertFalse { door.isOpen() }
    }

}