package top.gaoch.designpattern.behavitives.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 抽象访问者
 *
 * @author gaoch
 * @date 2021/3/2 00:59
 */
public interface Visitor {
  void visit(ConcreteElementA element);

  void visit(ConcreteElementB element);
}


//具体访问者A类
class ConcreteVisitorA implements Visitor {
  public void visit(ConcreteElementA element) {
    System.out.println("具体访问者A访问-->" + element.operationA());
  }

  public void visit(ConcreteElementB element) {
    System.out.println("具体访问者A访问-->" + element.operationB());
  }
}


//具体访问者B类
class ConcreteVisitorB implements Visitor {
  public void visit(ConcreteElementA element) {
    System.out.println("具体访问者B访问-->" + element.operationA());
  }

  public void visit(ConcreteElementB element) {
    System.out.println("具体访问者B访问-->" + element.operationB());
  }
}


//抽象元素类
interface Element {
  void accept(Visitor visitor);
}


//具体元素A类
class ConcreteElementA implements Element {
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String operationA() {
    return "具体元素A的操作。";
  }
}


//具体元素B类
class ConcreteElementB implements Element {
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String operationB() {
    return "具体元素B的操作。";
  }
}


//对象结构角色
class ObjectStructure {
  private List<Element> list = new ArrayList<Element>();

  public void accept(Visitor visitor) {
    Iterator<Element> i = list.iterator();
    while (i.hasNext()) {
      ((Element) i.next()).accept(visitor);
    }
  }

  public void add(Element element) {
    list.add(element);
  }

  public void remove(Element element) {
    list.remove(element);
  }
}
