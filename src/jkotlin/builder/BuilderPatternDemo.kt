package jkotlin.builder

/**
 * 建造者模式（Builder Pattern）
 *
 * 建造者模式使用多个简单的对象一步一步构建成一个复杂的对象。属于创建型模式，它提供了一种创建对象的最佳方式。
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 *
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于
 * 需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。
 * 2、JAVA 中的 StringBuilder。
 *
 * 使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
 */
fun main(args: Array<String>) {
    val mealBuilder = MealBuilder()

    val vegMeal = mealBuilder.prepareVegBurger()
    println("Veg Meal:")
    vegMeal.showItems()
    println("Total cost: ${vegMeal.getCost()}")

    println()

    val nonVegMeal = mealBuilder.prepareNonVegBurger()
    println("Non-Veg Meal:")
    nonVegMeal.showItems()
    println("Total cost: ${nonVegMeal.getCost()}")
}
