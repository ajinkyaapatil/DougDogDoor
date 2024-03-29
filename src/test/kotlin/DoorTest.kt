import org.example.Door
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DoorTest {
    @Test
    fun `door is initially closed`(){
        val door = Door(1000)

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should change the state to open when the door is opened`(){
        val door = Door(1000)

        door.open()

        assertTrue { door.isOpen() }
    }

    @Test
    fun `should change the state to close when the door is closed`(){
        val door = Door(1000)

        door.open()
        door.close()

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should close the door after 1000 milliseconds automatically`(){
        val door = Door(1000)

        door.open()

        assertFalse { door.isOpen() }
    }

}