class Door(private val task: (() -> Unit) -> Unit) {

    private var openState = DoorState.CLOSED
    fun isOpen() = openState
    private fun close() {
        openState = DoorState.CLOSED
    }

    fun open() {
        openState = DoorState.OPEN
        closeAutomatically()
    }

    fun toggle(): Boolean {
        if(openState == DoorState.OPEN){
            open()
            return true
        }
        else {
            close()
            return false
        }
    }

    private fun closeAutomatically() {
        task { close() }
    }

}