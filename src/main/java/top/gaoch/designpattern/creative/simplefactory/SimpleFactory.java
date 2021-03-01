package top.gaoch.designpattern.creative.simplefactory;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/2/28 14:06
 */
public class SimpleFactory {

  public static Product makeProduct(int kind) {
    switch (kind) {
      case Const.PRODUCT_A:
        return new ConcreteProduct1();
      case Const.PRODUCT_B:
        return new ConcreteProduct2();
    }
    return null;
  }
}


//抽象产品
interface Product {
  void show();
}


//具体产品：ProductA
class ConcreteProduct1 implements Product {
  public void show() {
    System.out.println("具体产品1显示...");
  }
}


//具体产品：ProductB
class ConcreteProduct2 implements Product {
  public void show() {
    System.out.println("具体产品2显示...");
  }
}


final class Const {
  static final int PRODUCT_A = 0;
  static final int PRODUCT_B = 1;
  static final int PRODUCT_C = 2;
}