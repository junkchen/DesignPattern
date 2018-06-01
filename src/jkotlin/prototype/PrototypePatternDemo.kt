package jkotlin.prototype

/**
 * 原型模式（Prototype Pattern）
 *
 * 原型模式是用于创建重复对象，同时又能保证性能。属于创建型模式。
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 *
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。 2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 * 3、为了避免创建一个与产品类层次平行的工厂类层次时。 4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目
 * 的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *
 * 应用实例： 1、细胞分裂。 2、JAVA 中的 Object clone() 方法。
 *
 * 使用场景： 1、性能和安全要求的场景。2、通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 * 3、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。
 */
fun main(args: Array<String>) {
    ShapeCache.loadCache()

    val cloneShape = ShapeCache.getShape("1")
    println("Shape: ${cloneShape.type}")

    val cloneShape2 = ShapeCache.getShape("2")
    println("Shape: ${cloneShape2.type}")

    val cloneShape3 = ShapeCache.getShape("3")
    println("Shape: ${cloneShape3.type}")
}
