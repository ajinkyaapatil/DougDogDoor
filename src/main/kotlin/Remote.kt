import Door

class Remote(private val door: Door) {
    fun press(): Boolean {
        if(door.isOpen()){
            door.close()
            return false
        }
        else {
            door.open()
            return true
        }
    }
}