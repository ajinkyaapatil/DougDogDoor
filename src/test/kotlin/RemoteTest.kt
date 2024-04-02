import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RemoteTest {

    private val interval = 5000L
    @Test
    fun `pressing the remote button toggles the door state`() {

        val door = Door { todo -> task(todo, interval) }

        val remote = Remote(door)

        val doorState = remote.press()

        assertTrue { doorState }

    }

//    @Test
//    fun `pressing the remote button closes the door when door is already open`() {
//
//        val door = Door { todo -> task(todo, interval) }
//
//        val remote = Remote(door)
//
//        remote.press()
//
//        val finalDoorState = remote.press()
//
//        assertFalse { finalDoorState }
//    }

}