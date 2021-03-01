package top.gaoch.designpattern.structural.composite;

/**
 * 组合（Composite Pattern）模式的定义：有时又叫作整体-部分（Part-Whole）模式，它是一种将对象组合成树状的层次结构的模式，用来表示“整体-部分”的关系，使用户对单个对象和组合对象具有一致的访问性，属于结构型设计模式。
 * <p>
 * 在组合模式中，整个树形结构中的对象都属于同一种类型，带来的好处就是用户不需要辨别是树枝节点还是叶子节点，可以直接进行操作，给用户的使用带来极大的便利。
 * <p>
 * 组合模式的主要优点有：
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 * 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 * <p>
 * 其主要缺点是：
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 * 不容易限制容器中的构件；
 * 不容易用继承的方法来增加构件的新功能；
 *
 * @author gaoch
 * @date 2021/3/2 01:19
 */
public class Client {
  public static void main(String[] args) {
    Component c0 = new Composite();
    Component c1 = new Composite();
    Component leaf1 = new Leaf("1");
    Component leaf2 = new Leaf("2");
    Component leaf3 = new Leaf("3");
    c0.add(leaf1);
    c0.add(c1);
    c1.add(leaf2);
    c1.add(leaf3);
    c0.operation();
  }
}
