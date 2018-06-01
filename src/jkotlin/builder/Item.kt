package jkotlin.builder

interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Double
}