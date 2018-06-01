package jkotlin.builder

class Coke : ColdDrink() {
    override fun name(): String = "Coke"

    override fun price(): Double = 30.0
}