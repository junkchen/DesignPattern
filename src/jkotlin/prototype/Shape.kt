package jkotlin.prototype

abstract class Shape: Cloneable {
    lateinit var id: String
    lateinit var type: String

    abstract fun draw()

    public override fun clone(): Any {
        return super.clone()
    }
}