package top.gaoch.designpattern.behavitives.nulloperation;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/2 01:03
 */

abstract class AbstractOperation {
  abstract void request();
}

public class NullOperation extends AbstractOperation {
  @Override
  void request() {
    // do nothing
  }
}
class RealOperation extends AbstractOperation {
  @Override
  void request() {
    System.out.println("do something");
  }
}