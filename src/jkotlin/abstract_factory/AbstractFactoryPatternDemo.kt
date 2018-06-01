package jkotlin.abstract_factory

/**
 * 抽象工厂模式（Abstract Factory Pattern）
 *
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 *
 * 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 * 主要解决：主要解决接口选择的问题。
 *
 * 使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 */

fun main(args: Array<String>) {
    // 获取形状工厂
    val shapeFactory = FactoryProducer.getFactory(Type.SAHPE)

    // 获取形状对象
    val shape1 = shapeFactory.getShape(ShapeType.CIRCLE)!!
    val shape2 = shapeFactory.getShape(ShapeType.RECTANGLE)!!
    val shape3 = shapeFactory.getShape(ShapeType.SQUARE)!!
    shape1.draw()
    shape2.draw()
    shape3.draw()

    // 获取颜色工厂
    val colorFactory = FactoryProducer.getFactory(Type.COLOR)

    // 获取颜色对象
    val color1 = colorFactory.getColor(ColorType.RED)!!
    val color2 = colorFactory.getColor(ColorType.GREEN)!!
    val color3 = colorFactory.getColor(ColorType.BLUE)!!
    color1.fill()
    color2.fill()
    color3.fill()
}