package jkotlin.builder

class ChickenBurger: Burger() {
    override fun name(): String  = "Chicken Burger"

    override fun price(): Double = 50.5
}