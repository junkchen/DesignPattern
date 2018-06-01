package jkotlin.builder

class Pepsi : ColdDrink() {
    override fun name(): String = "Pepsi"

    override fun price(): Double = 35.0
}