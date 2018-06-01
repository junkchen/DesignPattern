package jkotlin.observer

class OctalObserver(subject: Subject): Observer(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        println("Octal String: ${Integer.toOctalString(subject.state)}")
    }
}