package jkotlin.command

/**
 * 命令模式（Command Pattern）
 *
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 *
 * 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 *
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、
 * 事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 *
 * 何时使用：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，
 * 如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
 *
 * 使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
 */
fun main(args: Array<String>) {
    val abcStock = Stock()

    val buyStockOrder = BuyStock(abcStock)
    val sellStockOrder = SellStock(abcStock)

    val broker = Broker()
    broker.takeOrder(buyStockOrder)
    broker.takeOrder(sellStockOrder)
    broker.placeOrders()
}