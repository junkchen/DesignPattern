package decorator;

/**
 * 装饰器模式（Decorator Pattern）
 *
 * 装饰器模式允许向现有的类添加新的功能，同时又不改变其结构。属于结构型模式，它是作为现有的类的一个包装。
 * 这种模式创建了一个装饰类，用来用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 *
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 *
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 *
 * 应用实例： 1、孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 2、不论一幅画有没有
 * 画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；
 * 这时画、玻璃和画框形成了一个物体。
 *
 * 使用场景：1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 *
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
