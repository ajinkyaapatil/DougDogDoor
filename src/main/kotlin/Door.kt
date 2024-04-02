class Door(private val task: (() -> Unit) -> Unit) {

    private var openState = DoorState.CLOSED
    fun isOpen() = openState
    fun close() {
        openState = DoorState.CLOSED
    }

    fun open() {
        openState = DoorState.OPEN
        closeAutomatically()
    }

    fun toggle(): Boolean {
        if(openState == DoorState.OPEN){
            openState = DoorState.CLOSED
            return true
        }
        else {
            openState = DoorState.CLOSED
            return false
        }
    }

    private fun closeAutomatically() {
        task { close() }
    }

}