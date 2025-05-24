import Door

class Remote(private val door: Door) {
    fun press(): Boolean {
        return door.toggle()
    }
}