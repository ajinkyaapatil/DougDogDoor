package org.example

import kotlinx.coroutines.delay
import kotlin.concurrent.thread

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