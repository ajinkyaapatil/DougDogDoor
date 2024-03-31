package org.example

import kotlin.concurrent.thread

class DoorMock : Door() {
    fun open() {
        close()
    }
}