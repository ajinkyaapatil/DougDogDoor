class Bark(private val sound : String) {

    fun equals(other: Bark): Boolean {
        return sound == other.sound
    }


}