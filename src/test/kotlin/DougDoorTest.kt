import org.example.DoorMock
import org.example.DougDoor
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DougDoorTest {
    @Test
    fun `door is initially closed`(){
        val dougDoor = DougDoor()

        assertFalse { dougDoor.isOpen() }
    }

    @Test
    fun `should change the state to open when the door is opened`(){
        val dougDoor = DougDoor()

        dougDoor.open()

        assertTrue { dougDoor.isOpen() }
    }

    @Test
    fun `should change the state to close when the door is closed`(){
        val dougDoor = DougDoor()

        dougDoor.open()
        dougDoor.close()

        assertFalse { dougDoor.isOpen() }
    }

    @Test
    fun `should close the door automatically`(){
        val door = DoorMock()

        door.open()

        assertFalse { door.isOpen() }
    }

}