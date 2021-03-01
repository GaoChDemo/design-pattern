package top.gaoch.designpattern.structural.composite;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/2 01:19
 */
//抽象构件
interface Component {
  public void add(Component c); // 删除掉就是安全模式

  public void remove(Component c);

  public Component getChild(int i);

  public void operation();
}


//树叶构件
class Leaf implements Component {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  public void add(Component c) {
  }

  public void remove(Component c) {
  }

  public Component getChild(int i) {
    return null;
  }

  public void operation() {
    System.out.println("树叶" + name + "：被访问！");
  }
}


//树枝构件
public class Composite implements Component {
  private ArrayList<Component> children = new ArrayList<Component>();

  public void add(Component c) {
    children.add(c);
  }

  public void remove(Component c) {
    children.remove(c);
  }

  public Component getChild(int i) {
    return children.get(i);
  }

  public void operation() {
    for (Object obj : children) {
      ((Component) obj).operation();
    }
  }
}
