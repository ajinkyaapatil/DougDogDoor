import Door

class Remote(private val door: Door) {
    fun press(): Boolean {
        door.toggle()
        return true
    }
}