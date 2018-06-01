package jkotlin.factory


/**
 * 工厂模式（Factory Pattern）
 *
 * 工厂模式是 Java 中最常用的设计模式之一。属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 *
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 *
 * 主要解决：主要解决接口选择的问题。
 *
 * 应用实例： 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。
 *
 * 使用场景： 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 * 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 3、设计一个连接服务器的框架，
 * 需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 *
 *
 */

fun main(args: Array<String>) {
    val shapeFactory = ShapeFactory()

    val shape1 = shapeFactory.getShape(ShapeType.CIRCLE)
    shape1.draw()

    val shape2 = shapeFactory.getShape(ShapeType.RECTANGLE)
    shape2.draw()

    val shape3 = shapeFactory.getShape(ShapeType.SQUARE)
    shape3.draw()
}
