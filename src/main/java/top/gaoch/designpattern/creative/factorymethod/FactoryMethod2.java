package top.gaoch.designpattern.creative.factorymethod;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/2/28 23:30
 */
public class FactoryMethod2 extends Factory{

  @Override
  public Product createProduct() {
    return new Product2();
  }
}
