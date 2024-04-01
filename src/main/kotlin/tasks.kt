import kotlin.concurrent.thread

fun task (todo: () -> Unit, interval: Long) {
    thread {
        Thread.sleep(interval)
        todo()
    }
}

fun task2 (todo : () -> Unit) {
    todo()
}