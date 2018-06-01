package jkotlin.observer

abstract class Observer(val subject: Subject) {

    abstract fun update()
}