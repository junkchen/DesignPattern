package jkotlin.observer

class BinaryObserver(subject: Subject): Observer(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        println("Binary String: ${Integer.toBinaryString(subject.state)}")
    }
}