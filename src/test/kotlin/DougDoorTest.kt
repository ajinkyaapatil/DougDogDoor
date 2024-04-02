import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DougDoorTest {

    private val interval = 5000L

    @Test
    fun `door is initially closed`(){

        val door = Door { todo -> task(todo, interval) }

        assertEquals(DoorState.CLOSED, door.isOpen())
    }

    @Test
    fun `should change the state to open when the door is opened`(){
        val door = Door { todo -> task(todo, interval) }

        door.open()

        assertEquals(DoorState.OPEN, door.isOpen())
    }

    @Test
    fun `should change the state to close when the door is closed`(){
        val door = Door { todo -> task(todo, interval) }

        door.open()
        door.close()

        assertEquals(DoorState.CLOSED, door.isOpen())
    }

    @Test
    fun `should close the door automatically`(){
        val door = Door { todo -> task(todo) }

        door.open()

        assertEquals(DoorState.CLOSED, door.isOpen())
    }

}