import org.example.Door
import org.example.Recogniser
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class RecogniserTest {
    @Test
    fun `should open the door when door barks`(){

        val door = Door()

        val recogniser = Recogniser(door)

        val doorState = recogniser.recognise()

        assertTrue { doorState }
    }
}