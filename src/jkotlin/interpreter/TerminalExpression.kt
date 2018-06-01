package jkotlin.interpreter

class TerminalExpression(val data: String): Expression {
    override fun interpret(context: String): Boolean = context.contains(data)
}