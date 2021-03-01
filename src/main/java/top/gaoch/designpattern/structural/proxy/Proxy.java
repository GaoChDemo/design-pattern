package top.gaoch.designpattern.structural.proxy;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/2 01:27
 */
//抽象主题
interface Subject {
  void Request();
}
//真实主题
class RealSubject implements Subject {
  public void Request() {
    System.out.println("访问真实主题方法...");
  }
}
//代理
public class Proxy implements Subject {
  private RealSubject realSubject;
  public void Request() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    preRequest();
    realSubject.Request();
    postRequest();
  }
  public void preRequest() {
    System.out.println("访问真实主题之前的预处理。");
  }
  public void postRequest() {
    System.out.println("访问真实主题之后的后续处理。");
  }
}