import org.example.DougDoor
import org.example.Remote
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RemoteTest {
    @Test
    fun `pressing the remote button opens the door when initially closed`() {

        val dougDoor = DougDoor()
        val remote = Remote(dougDoor)

        val doorState = remote.press()

        assertTrue { doorState }

    }

    @Test
    fun `pressing the remote button closes the door when door is open`() {

        val dougDoor = DougDoor()
        val remote = Remote(dougDoor)

        remote.press()
        val finalDoorState = remote.press()

        assertFalse { finalDoorState }
    }

}