package jkotlin.interpreter

/**
 * 解释器模式（Interpreter Pattern）
 *
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，
 * 该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 *
 * 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 *
 * 何时使用：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。
 * 这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。
 *
 * 应用实例：编译器、运算表达式计算。
 *
 * 使用场景： 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 * 2、一些重复出现的问题可以用一种简单的语言来进行表达。 3、一个简单语法需要解释的场景。
 *
 */
fun main(args: Array<String>) {
    // 规则： Robert 和 John 是男性
    fun getMaleExpression(): Expression {
        val robert = TerminalExpression("Robert")
        val john = TerminalExpression("John")
        return OrExpression(robert, john)
    }

    // 规则： Julie 是一个已婚女性
    fun getMarriedWomanExpression() = AndExpression(
            TerminalExpression("Julie"),
            TerminalExpression("Married"))

    val isMale = getMaleExpression()
    val isMarriedWoman = getMarriedWomanExpression()

    println("John is male? ${isMale.interpret("John")}")
    println("Julie is a married woman? ${isMarriedWoman.interpret("Married Julie")}")
}