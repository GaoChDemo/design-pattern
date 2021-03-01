package top.gaoch.designpattern.behavitives.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 22:10
 */
//抽象迭代器
public interface Iterator {
  Object first();

  Object next();

  boolean hasNext();
}


//具体迭代器
class ConcreteIterator implements Iterator {
  private List<Object> list = null;
  private int index = -1;

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  public boolean hasNext() {
    if (index < list.size() - 1) {
      return true;
    } else {
      return false;
    }
  }

  public Object first() {
    index = 0;
    Object obj = list.get(index);
    ;
    return obj;
  }

  public Object next() {
    Object obj = null;
    if (this.hasNext()) {
      obj = list.get(++index);
    }
    return obj;
  }
}


//抽象聚合
interface Aggregate {
  void add(Object obj);

  void remove(Object obj);

  Iterator getIterator();
}


//具体聚合
class ConcreteAggregate implements Aggregate {
  private List<Object> list = new ArrayList<Object>();

  public void add(Object obj) {
    list.add(obj);
  }

  public void remove(Object obj) {
    list.remove(obj);
  }

  public Iterator getIterator() {
    return (new ConcreteIterator(list));
  }
}
