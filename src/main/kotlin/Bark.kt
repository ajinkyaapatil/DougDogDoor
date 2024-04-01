class Bark(private val sound : String) {

    fun getSound() = sound

    fun equals(other: Bark): Boolean {
        return sound == other.sound
    }


}