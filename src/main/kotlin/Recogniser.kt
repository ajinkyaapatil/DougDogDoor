package org.example

class Recogniser(val door: Door) {
    fun recognise(): Boolean {
        door.open()
        return true
    }

}
