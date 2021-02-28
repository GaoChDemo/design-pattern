package top.gaoch.designpattern.creative.factorymethod;

/**
 * 工厂方法(Factory Method)
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 *
 * @author gaoch
 * @date 2021/2/28 23:20
 */
public abstract class Factory {
  abstract public Product createProduct();
}