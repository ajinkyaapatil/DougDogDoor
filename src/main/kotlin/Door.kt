package org.example

class Door {
    private var openState = false
    fun isOpen() = openState
    fun open() {
        openState = true
    }
}
