package top.gaoch.designpattern.creative.abstractfactory;

/**
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * <p>
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 * <p>
 * 使用抽象工厂模式一般要满足以下条件。
 * 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
 * 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
 * <p>
 * 抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。
 * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 * 当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品组。
 * 抽象工厂增强了程序的可扩展性，当增加一个新的产品族时，不需要修改原代码，满足开闭原则。
 * <p>
 * 其缺点是：当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。增加了系统的抽象性和理解难度。
 *
 * @author gaoch
 * @date 2021/3/1 00:45
 */
public class Client {
  public static void main(String[] args) {
    AbstractFactory abstractFactory = new ConcreteFactoryB();
    Product1 product1 = abstractFactory.newProduct1();
    Product2 product2 = abstractFactory.newProduct2();

    assert product1 instanceof ConcreteProductB1;
    assert product2 instanceof ConcreteProductB2;
    System.out.println("ok");
  }
}
