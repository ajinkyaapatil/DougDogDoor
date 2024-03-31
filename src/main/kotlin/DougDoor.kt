package org.example

import kotlin.concurrent.thread

class DougDoor() : Door() {
    fun open() {
        openState = true
        thread {
            Thread.sleep(5000)
            close()
        }
    }
}
