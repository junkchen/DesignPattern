package jkotlin.builder

abstract class Burger : Item{
    override fun packing(): Packing = Wrapper()
}