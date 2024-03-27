package org.example
import kotlin.concurrent.thread

class Door(barkRecognise: BarkRecognise) {

    private var open = false

    init {
        thread {
            for(i in 1..1000){
                Thread.sleep(50)
                if(barkRecognise.barked){
                    open()
                    break
                }
            }
        }
    }

    private fun close(){
        open = false
    }

    fun open() {
        open = true
        thread {
            Thread.sleep(2_000)
            println("Hit")
            close()
        }
    }

    fun isOpen() = open


}
