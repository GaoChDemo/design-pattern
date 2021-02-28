package top.gaoch.designpattern.creative.simplefactory;

/**
 * 简单工厂(Simple Factory)
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 *
 * @author gaoch
 * @date 2021/2/28 14:06
 */
public class SimpleFactory {

  public static Product createProduct(int type) {
    Product product;
    switch (type) {
      case 1:
        product = new Product1();
        break;
      case 2:
        product = new Product2();
        break;
      case 3:
        product = new Product3();
        break;
      default:
        product = null;
        break;
    }
    return product;
  }
}