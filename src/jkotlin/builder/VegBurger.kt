package jkotlin.builder

class VegBurger : Burger() {
    override fun name(): String = "Veg Burger"

    override fun price(): Double = 25.0
}