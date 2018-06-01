package jkotlin.composite

/**
 * 组合模式（Composite Pattern）
 *
 * 组合模式又叫部分整体模式，适用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及
 * 整体层次。属于结构型模式。
 * 这种模式提供了包含自己对象组的类。该类提供了修改相同对象组的方式。
 *
 * 意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 * 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从
 * 而使得客户程序与复杂元素的内部结构解耦。
 *
 * 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 *
 * 应用实例： 1、算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作数、操作符和另一个操作数。
 * 2、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。
 *
 * 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
 *
 */

fun main(args: Array<String>) {
    val CEO = Employee("John", "CEO", 30000)

    val headSales = Employee("Robert", "Head Sales", 20000)

    val headMarketing = Employee("Michel", "Head Marketing", 20000)

    val clerk1 = Employee("Laura", "Marketing", 10000)
    val clerk2 = Employee("Bob", "Marketing", 10000)

    val salesExecutive1 = Employee("Richard", "Sales", 10000)
    val salesExecutive2 = Employee("Rob", "Sales", 10000)

    CEO.add(headSales)
    CEO.add(headMarketing)

    headSales.add(salesExecutive1)
    headSales.add(salesExecutive2)

    headMarketing.add(clerk1)
    headMarketing.add(clerk2)

    // 打印该组织所有员工
    println(CEO)
    for (headEmployee in CEO.subordinates) {
        println(headEmployee)
        for (employee in headEmployee.subordinates) {
            println(employee)
        }
    }
}