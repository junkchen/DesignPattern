package jkotlin.chain_responsibility

class ConsoleLogger(level: Int) : AbstractLogger(level) {
    override fun write(message: String) {
        println("Standard Console::Logger: $message")
    }
}