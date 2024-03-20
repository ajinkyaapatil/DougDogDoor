package org.example
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class Door {

    private var open = false

    private fun close(){
        open = false
    }

    fun open() {
        open = true
        thread {
            Thread.sleep(5_000)
            close()
        }

    }

    fun isOpen() = open


}
