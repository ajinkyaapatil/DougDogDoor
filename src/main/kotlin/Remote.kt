package org.example

class Remote(private val door: Door) {
    fun press() {
        door.open()
    }

}