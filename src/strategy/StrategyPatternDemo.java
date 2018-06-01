package strategy;

/**
 * 策略模式（Strategy Pattern）
 *
 * 在策略模式中，一个类的行为或算法可以在运行时更改。属于行为型模式。
 *
 * 意图：定义一系列算法，把它们一个个封装起来，并且使他们可以相互替换。
 *
 * 主要解决：在使用多种算法相似的情况下，使用 if...else 所带来的难以维护。
 *
 * 应用实例：1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。 2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是
 * 一个策略。3、JAVA AWT 中的 LayoutManager。
 *
 * 使用场景：1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多
 * 行为中选择一种行为。 2、一个系统需要动态地在几种算法中选择一种。 3、如果一个对象有很多的行为，如果不用恰当的模式，这
 * 些行为就只好使用多重的条件选择语句来实现。
 *
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
