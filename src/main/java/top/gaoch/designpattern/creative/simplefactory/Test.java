package top.gaoch.designpattern.creative.simplefactory;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/2/28 23:21
 */
public class Test {
  public static void main(String[] args) {
    Product product = SimpleFactory.createProduct(2);
    System.out.println(product instanceof Product);
    System.out.println(product instanceof Product1);
    System.out.println(product instanceof Product2);
    System.out.println(product instanceof Product3);
  }
}
