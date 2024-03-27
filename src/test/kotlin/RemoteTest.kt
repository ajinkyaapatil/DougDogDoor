import org.example.Door
import org.example.Remote
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class RemoteTest {
    @Test
    fun `pressing the remote button opens the door`(){

        val door = Door()
        val remote = Remote(door)

        remote.press()

        assertTrue { door.isOpen() }


    }
    
}