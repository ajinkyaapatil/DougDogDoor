import org.example.DougDoor
import org.example.Recogniser
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class RecogniserTest {
    @Test
    fun `should open the door when dog barks`(){

        val dougDoor = DougDoor()

        val recogniser = Recogniser(dougDoor)

        val doorState = recogniser.recognise()

        assertTrue { doorState }
    }
}