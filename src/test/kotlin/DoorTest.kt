import org.example.BarkRecognise
import org.example.Door
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DoorTest {

    private lateinit var barkRecognise: BarkRecognise
    private lateinit var door : Door

    @BeforeEach
    fun setup() {
        barkRecognise = BarkRecognise()
        door = Door(barkRecognise)
    }

    @Test
    fun `should open the door provided a signal to open the door`() {
        door.open()

        assertEquals(true, door.isOpen())
    }

    @Test
    fun `should open the door when dog barks`() {
        barkRecognise.barked = true

        Thread.sleep(100)

        assertEquals(true, door.isOpen())
    }

    @Test
    fun `should close the door automatically after 2 seconds`() {

        barkRecognise.barked = true

        Thread.sleep(2_100)
        assertEquals(false, door.isOpen())

    }


}