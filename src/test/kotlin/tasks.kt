import kotlin.concurrent.thread

fun task (todo: () -> Unit, interval: Long) {
    thread {
        Thread.sleep(interval)
        todo()
    }
}

fun task (todo : () -> Unit) {
    todo()
}