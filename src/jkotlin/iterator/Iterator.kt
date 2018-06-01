package jkotlin.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any?
}