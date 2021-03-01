package top.gaoch.designpattern.behavitives.chainofresponsibility;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 01:59
 */
public class ChainOfResponsibilityPattern {

}


//抽象处理者角色
abstract class Handler {
  private Handler next;

  public void setNext(Handler next) {
    this.next = next;
  }

  public Handler getNext() {
    return next;
  }

  //处理请求的方法
  public abstract void handleRequest(String request);
}


//具体处理者角色1
class ConcreteHandler1 extends Handler {
  public void handleRequest(String request) {
    if (request.equals("one")) {
      System.out.println("具体处理者1负责处理该请求！");
    } else {
      if (getNext() != null) {
        getNext().handleRequest(request);
      } else {
        System.out.println("没有人处理该请求！");
      }
    }
  }
}


//具体处理者角色2
class ConcreteHandler2 extends Handler {
  public void handleRequest(String request) {
    if (request.equals("two")) {
      System.out.println("具体处理者2负责处理该请求！");
    } else {
      if (getNext() != null) {
        getNext().handleRequest(request);
      } else {
        System.out.println("没有人处理该请求！");
      }
    }
  }
}
