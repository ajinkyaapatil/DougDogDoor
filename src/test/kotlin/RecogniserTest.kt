import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RecogniserTest {

    private val interval = 5000L
    @Test
    fun `should open the door when dog barks in correct sound`(){

        val door = Door { todo -> task(todo, interval) }

        val recogniser = Recogniser(door)

        recogniser.addAllowedBarks(Bark("rowlf"))

        val recognised = recogniser.recognise(Bark("rowlf"))

        assertTrue { recognised }
    }

    @Test
    fun `should not open door when dog barks in incorrect sound`(){
        val door = Door { todo -> task(todo, interval) }

        val recogniser = Recogniser(door)

        recogniser.addAllowedBarks(Bark("rowlf"))

        val recognised = recogniser.recognise(Bark("roowlf"))

        assertFalse { recognised }
    }
}