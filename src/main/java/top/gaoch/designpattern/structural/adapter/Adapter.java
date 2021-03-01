package top.gaoch.designpattern.structural.adapter;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/2 01:09
 */
interface Target {
  void request();
}


//适配者接口
public class Adapter {
  public void specificRequest() {
    System.out.println("适配者中的业务代码被调用！");
  }
}


//类适配器类
class ClassAdapter extends Adapter implements Target {
  public void request() {
    specificRequest();
  }
}


class ObjectAdapter implements Target {
  private Adapter adapter;

  public ObjectAdapter(Adapter adapter) {
    this.adapter = adapter;
  }

  public void request() {
    adapter.specificRequest();
  }
}
