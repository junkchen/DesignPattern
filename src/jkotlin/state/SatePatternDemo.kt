package jkotlin.state

/**
 * 状态模式（State Pattern）
 *
 * 在状态模式中，类的行为是基于它的状态改变的。属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 *
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 *
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 *
 * 何时使用：代码中包含大量与对象状态有关的条件语句。
 *
 * 应用实例： 1、打篮球的时候运动员可以有正常状态、不正常状态和超常状态。
 * 2、曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
 *
 * 使用场景： 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 *
 * 注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
 */
fun main(args: Array<String>) {
    val context = Context()

    val startState = StartState()
    startState.doAction(context)
    println(context.getState())

    println()

    val stopState = StopState()
    stopState.doAction(context)
    println(context.getState())
}