package top.gaoch.designpattern.behavitives.templatemethod;

/**
 * 抽象类
 *
 * @author gaoch
 * @date 2021/3/2 00:56
 */
public abstract class AbstractClass {
  //模板方法
  public void TemplateMethod() {
    SpecificMethod();
    abstractMethod1();
    abstractMethod2();
  }

  //具体方法
  public void SpecificMethod() {
    System.out.println("抽象类中的具体方法被调用...");
  }

  //抽象方法1
  public abstract void abstractMethod1();

  //抽象方法2
  public abstract void abstractMethod2();
}


//具体子类
class ConcreteClass extends AbstractClass {
  public void abstractMethod1() {
    System.out.println("抽象方法1的实现被调用...");
  }

  public void abstractMethod2() {
    System.out.println("抽象方法2的实现被调用...");
  }
}
