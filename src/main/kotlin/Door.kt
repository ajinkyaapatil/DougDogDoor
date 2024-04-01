class Door(private val task: (() -> Unit) -> Unit) {

    private var openState = false
    fun isOpen() = openState
    fun close() {
        openState = false
    }
    fun open() {
        openState = true
        closeAutomatically()
    }

    private fun closeAutomatically() {
        task { close() }
    }

}