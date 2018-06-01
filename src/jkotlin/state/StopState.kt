package jkotlin.state

class StopState: State {
    override fun doAction(context: Context) {
        println("Player is in stop state.")
        context.setState(this)
    }

    override fun toString(): String = "Stop State"
}