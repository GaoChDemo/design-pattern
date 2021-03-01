package top.gaoch.designpattern.behavitives.state;

/**
 * //抽象状态类
 *
 * @author gaoch
 * @date 2021/3/2 00:43
 */
public abstract class State {
  public abstract void Handle(Context context);
}


//具体状态A类
class ConcreteStateA extends State {
  public void Handle(Context context) {
    System.out.println("当前状态是 A.");
    context.setState(new ConcreteStateB());
  }
}


//具体状态B类
class ConcreteStateB extends State {
  public void Handle(Context context) {
    System.out.println("当前状态是 B.");
    context.setState(new ConcreteStateA());
  }
}


//环境类
class Context {
  private State state;

  //定义环境类的初始状态
  public Context() {
    this.state = new ConcreteStateA();
  }

  //设置新状态
  public void setState(State state) {
    this.state = state;
  }

  //读取状态
  public State getState() {
    return (state);
  }

  //对请求做处理
  public void Handle() {
    state.Handle(this);
  }
}
