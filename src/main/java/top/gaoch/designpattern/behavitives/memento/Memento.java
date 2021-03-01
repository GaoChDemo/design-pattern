package top.gaoch.designpattern.behavitives.memento;

/**
 * //备忘录
 *
 * @author gaoch
 * @date 2021/3/2 00:39
 */
public class Memento {
  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}


//发起人
class Originator {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public Memento createMemento() {
    return new Memento(state);
  }

  public void restoreMemento(Memento m) {
    this.setState(m.getState());
  }
}


//管理者
class Caretaker {
  private Memento memento;

  public void setMemento(Memento m) {
    memento = m;
  }

  public Memento getMemento() {
    return memento;
  }
}
