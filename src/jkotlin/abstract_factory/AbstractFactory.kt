package jkotlin.abstract_factory

abstract class AbstractFactory {
    abstract fun getShape(shapeType: ShapeType): Shape?
    abstract fun getColor(colorType: ColorType): Color?
}
