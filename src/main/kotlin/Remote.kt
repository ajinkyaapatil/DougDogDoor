package org.example

class Remote(private val dougDoor: DougDoor) {
    fun press(): Boolean {
        if(dougDoor.isOpen()){
            dougDoor.close()
            return false
        }
        else {
            dougDoor.open()
            return true
        }
    }
}