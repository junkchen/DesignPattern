package jkotlin.observer

class Subject {
    val observers = ArrayList<Observer>()
    var state: Int = 0
        set(value) {
            field = value
            notifyAllObservers()
        }

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    private fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}