package jkotlin.chain_responsibility

class ErrorLogger(level: Int) : AbstractLogger(level) {
    override fun write(message: String) {
        println("Error Console::Logger: $message")
    }
}