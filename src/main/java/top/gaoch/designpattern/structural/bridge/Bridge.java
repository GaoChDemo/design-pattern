package top.gaoch.designpattern.structural.bridge;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/2 01:13
 */
//实现化角色
interface Implementor {
  public void OperationImpl();
}


//具体实现化角色
class ConcreteImplementorA implements Implementor {
  public void OperationImpl() {
    System.out.println("具体实现化(Concrete Implementor)角色被访问");
  }
}


//抽象化角色
abstract class Abstraction {
  protected Implementor imple;

  protected Abstraction(Implementor imple) {
    this.imple = imple;
  }

  public abstract void Operation();
}


//扩展抽象化角色
class RefinedAbstraction extends Abstraction {
  protected RefinedAbstraction(Implementor imple) {
    super(imple);
  }

  public void Operation() {
    System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
    imple.OperationImpl();
  }
}
