import Door

class Recogniser(private val door: Door) {

    private val allowedBarks = mutableListOf<Bark> ()

    fun addAllowedBarks (bark : Bark) {
        allowedBarks.add(bark)
    }

    fun recognise(bark: Bark): Boolean {
        val matchedBark = allowedBarks.find { it.equals(bark) }

        if(matchedBark !== null){
            door.open()
            return true
        }
        return false
    }

}
