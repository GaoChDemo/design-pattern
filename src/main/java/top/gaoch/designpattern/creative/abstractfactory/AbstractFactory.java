package top.gaoch.designpattern.creative.abstractfactory;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 00:47
 */
interface AbstractFactory {
  public Product1 newProduct1();

  public Product2 newProduct2();
}

// 产品
interface Product1 {
}


class ConcreteProductA1 implements Product1 {

}


class ConcreteProductB1 implements Product1 {

}


interface Product2 {
}


class ConcreteProductA2 implements Product2 {

}


class ConcreteProductB2 implements Product2 {

}

// 具体工厂B
class ConcreteFactoryA implements AbstractFactory {
  public Product1 newProduct1() {
    System.out.println("具体工厂 1 生成-->具体产品 A1...");
    return new ConcreteProductA1();
  }

  public Product2 newProduct2() {
    System.out.println("具体工厂 1 生成-->具体产品 A2...");
    return new ConcreteProductA2();
  }
}

// 具体工厂A
class ConcreteFactoryB implements AbstractFactory {
  public Product1 newProduct1() {
    System.out.println("具体工厂 2 生成-->具体产品 B1...");
    return new ConcreteProductB1();
  }

  public Product2 newProduct2() {
    System.out.println("具体工厂 2 生成-->具体产品 B2...");
    return new ConcreteProductB2();
  }
}