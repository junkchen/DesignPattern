package jkotlin.iterator

/**
 * 迭代器模式（Iterator Pattern）
 *
 * 迭代器模式是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 属于行为型模式。
 *
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 *
 * 主要解决：不同的方式来遍历整个整合对象。
 *
 * 关键代码：定义接口：hasNext, next。
 *
 * 应用实例：JAVA 中的 iterator。
 *
 * 使用场景： 1、访问一个聚合对象的内容而无须暴露它的内部表示。 2、需要为聚合对象提供多种遍历方式。
 * 3、为遍历不同的聚合结构提供一个统一的接口。
 *
 *
 */
fun main(args: Array<String>) {
    val nameRepository = NameRepository()

    with(nameRepository.names) {
        add("Robert")
        add("John")
        add("Julie")
        add("Lora")
    }

    val nameIterator = nameRepository.NameIterator()
    while (nameIterator.hasNext()) {
        println("Name: ${nameIterator.next() as String}")
    }
}