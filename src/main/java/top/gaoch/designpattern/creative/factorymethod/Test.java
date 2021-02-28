package top.gaoch.designpattern.creative.factorymethod;

import top.gaoch.designpattern.creative.simplefactory.Product1;
import top.gaoch.designpattern.creative.simplefactory.Product2;
import top.gaoch.designpattern.creative.simplefactory.Product3;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/2/28 23:30
 */
public class Test {
  public static void main(String[] args) {
    Factory factory = new FactoryMethod2();
    Product product = factory.createProduct();
    System.out.println(product instanceof Product);
    System.out.println(product instanceof Product1);
    System.out.println(product instanceof Product2);
    System.out.println(product instanceof Product3);
  }
}
