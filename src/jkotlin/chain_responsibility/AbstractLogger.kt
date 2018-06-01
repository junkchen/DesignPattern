package jkotlin.chain_responsibility

abstract class AbstractLogger(var level: Int) {
    companion object {
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }

    // 责任链的下一个元素
    var nextLogger: AbstractLogger? = null

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        if (nextLogger != null) {
            nextLogger?.logMessage(level, message)
        }
    }

    protected abstract fun write(message: String)
}