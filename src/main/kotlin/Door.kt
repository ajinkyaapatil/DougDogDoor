package org.example

import kotlin.concurrent.thread

abstract class Door {
    var openState = false
    fun isOpen() = openState
    fun close() {
        openState = false
    }
}