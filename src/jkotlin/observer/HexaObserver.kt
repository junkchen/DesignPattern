package jkotlin.observer

class HexaObserver(subject: Subject): Observer(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        println("Hex String: ${Integer.toHexString(subject.state)}")
    }
}