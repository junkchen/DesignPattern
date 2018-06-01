package jkotlin.prototype

import java.util.*

object ShapeCache {
    private val shapeMap = Hashtable<String, Shape>()

    fun getShape(shapeId: String): Shape {
        val cacheShape = shapeMap[shapeId]
        return cacheShape?.clone() as Shape
    }

    fun loadCache() {
        val circle = Circle()
        circle.id = "1"
        shapeMap[circle.id] = circle

        val square = Square()
        square.id = "2"
        shapeMap[square.id] = square

        val rectangle = Rectangle()
        rectangle.id = "3"
        shapeMap[rectangle.id] = rectangle
    }
}