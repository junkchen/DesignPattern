package jkotlin.interpreter

class AndExpression(val expr1: Expression, val expr2: Expression): Expression {

    override fun interpret(context: String): Boolean =
            expr1.interpret(context) && expr2.interpret(context)
}