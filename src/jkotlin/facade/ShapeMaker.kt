package jkotlin.facade

class ShapeMaker {
    private val circle: Shape = Circle()
    private val rectangle: Shape = Rectangle()
    private val square: Shape = Square()

    fun drawCircle() {
        circle.draw()
    }

    fun drawRectangle() {
        rectangle.draw()
    }

    fun drawSquare() {
        square.draw()
    }
}