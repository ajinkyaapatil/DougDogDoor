import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DougDoorTest {

    private val interval = 5000L

    @Test
    fun `door is initially closed`(){

        val door = Door { todo -> task(todo, interval) }

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should change the state to open when the door is opened`(){
        val door = Door { todo -> task(todo, interval) }

        door.open()

        assertTrue { door.isOpen() }
    }

    @Test
    fun `should change the state to close when the door is closed`(){
        val door = Door { todo -> task(todo, interval) }

        door.open()
        door.close()

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should close the door automatically`(){
        val door = Door { todo -> task(todo) }

        door.open()

        assertFalse { door.isOpen() }
    }

    @Test
    fun `should close the door if button is pressed on the remote before automatic closed`(){
        val door = Door {todo -> task(todo, 10L)}

        val recogniser = Recogniser(door)
        val remote = Remote(door)

        recogniser.addAllowedBarks(Bark("braw"))

        var doorState = recogniser.recognise(Bark("braw"))

        assertTrue { doorState }

        doorState = remote.press()

        assertFalse { doorState }
    }

}