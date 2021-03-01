package top.gaoch.designpattern.structural.bridge;

/**
 * 桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 * 通过上面的讲解，我们能很好的感觉到桥接模式遵循了里氏替换原则和依赖倒置原则，最终实现了开闭原则，对修改关闭，对扩展开放。这里将桥接模式的优缺点总结如下。
 *
 * 桥接（Bridge）模式的优点是：
 * 抽象与实现分离，扩展能力强
 * 符合开闭原则
 * 符合合成复用原则
 * 其实现细节对客户透明
 *
 * 缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，能正确地识别出系统中两个独立变化的维度，这增加了系统的理解与设计难度。
 *
 * @author gaoch
 * @date 2021/3/2 01:13
 */
public class Client {
  public static void main(String[] args) {
    Implementor imple = new ConcreteImplementorA();
    Abstraction abs = new RefinedAbstraction(imple);
    abs.Operation();
  }
}
