package jkotlin.abstract_factory

class ColorFactory : AbstractFactory() {
    override fun getShape(shapeType: ShapeType): Shape? = null

    override fun getColor(colorType: ColorType): Color =
            when (colorType) {
                ColorType.RED -> Red()
                ColorType.GREEN -> Green()
                ColorType.BLUE -> Blue()
            }
}