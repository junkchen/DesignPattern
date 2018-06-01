package jkotlin.state

class Context() {
    private lateinit var state: State

    fun setState(state: State) {
        this.state = state
    }

    fun getState() = state
}