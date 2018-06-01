package jkotlin.state

interface State {
    fun doAction(context: Context)
}