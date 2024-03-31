package org.example

class Recogniser(private val dougDoor: DougDoor) {
    fun recognise(): Boolean {
        dougDoor.open()
        return true
    }

}
