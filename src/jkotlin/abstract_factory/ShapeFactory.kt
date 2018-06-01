package jkotlin.abstract_factory

class ShapeFactory: AbstractFactory() {
    override fun getShape(shapeType: ShapeType): Shape =
            when (shapeType) {
                ShapeType.CIRCLE -> Circle()
                ShapeType.RECTANGLE -> Rectangle()
                ShapeType.SQUARE -> Square()
            }

    override fun getColor(colorType: ColorType): Color? = null
}