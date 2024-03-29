package org.example

import kotlin.concurrent.thread

class Door(val delay: Long = 0) {
    private var openState = false
    fun isOpen() = openState
    fun open() {
        openState = true

        thread {
            Thread.sleep(delay)
            close()
        }
    }
    fun close() {
        openState = false
    }
}
