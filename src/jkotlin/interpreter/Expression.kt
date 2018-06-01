package jkotlin.interpreter

interface Expression {
    fun interpret(context: String): Boolean
}