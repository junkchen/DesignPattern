package jkotlin.factory

class ShapeFactory {
    fun getShape(type: ShapeType) = when (type) {
        ShapeType.CIRCLE -> Circle()
        ShapeType.RECTANGLE -> Rectangle()
        ShapeType.SQUARE -> Square()
    }
}