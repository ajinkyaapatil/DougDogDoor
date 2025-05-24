import kotlin.test.*

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
    fun `should close the door automatically`(){
        val door = Door { todo -> task(todo) }

        door.open()

        assertEquals(DoorState.CLOSED, door.isOpen())
    }

    @Test
    fun `should change the state with toggle function`(){
        val door = Door { todo -> task(todo) }

        val doorState = door.toggle()

        assertFalse { doorState }
    }
}