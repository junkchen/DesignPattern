package jkotlin.builder

abstract class ColdDrink : Item {
    override fun packing(): Packing = Bottle()
}