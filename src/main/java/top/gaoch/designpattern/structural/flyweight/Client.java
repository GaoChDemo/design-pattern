package top.gaoch.designpattern.structural.flyweight;

/**
 * 享元（Flyweight）模式的定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 * <p>
 * 享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 * <p>
 * 其主要缺点是：
 * 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 读取享元模式的外部状态会使得运行时间稍微变长。
 *
 * @author gaoch
 * @date 2021/3/2 01:26
 */
public class Client {
  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight f01 = factory.getFlyweight("a");
    Flyweight f02 = factory.getFlyweight("a");
    Flyweight f03 = factory.getFlyweight("a");
    Flyweight f11 = factory.getFlyweight("b");
    Flyweight f12 = factory.getFlyweight("b");
    f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
    f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
    f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
    f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
    f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
  }
}
