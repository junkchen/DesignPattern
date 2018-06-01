package jkotlin.chain_responsibility

/**
 * 责任链模式（Chain of Responsibility Pattern）
 *
 * 责任链模式为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。属于行为型模式。
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 *
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 *
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以
 * 职责链将请求的发送者和请求的处理者解耦了。
 *
 * 使用场景： 1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 2、在不明确指定接收者的情况下，
 * 向多个对象中的一个提交一个请求。 3、可动态指定一组对象处理请求。
 *
 *
 */

fun main(args: Array<String>) {

    val loggerChain = getChainLoggers()

    loggerChain.logMessage(AbstractLogger.INFO, "This is a information.")
    loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug information.")
    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.")
}

fun getChainLoggers(): AbstractLogger {
    val errorLogger = ErrorLogger(AbstractLogger.ERROR)
    val fileLogger = FileLogger(AbstractLogger.DEBUG)
    val consoleLogger = ConsoleLogger(AbstractLogger.INFO)

    errorLogger.nextLogger = fileLogger
    fileLogger.nextLogger = consoleLogger

    return errorLogger
}