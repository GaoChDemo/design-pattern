package top.gaoch.designpattern.creative.singleton;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 23:27
 */
public class Singleton {
}


/**
 * 懒汉模式 - 线程不安全
 */
class Singleton1 {
  private static Singleton1 uniqueInstance;

  private Singleton1() {
  }

  public static Singleton1 getUniqueInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton1();
    }
    return uniqueInstance;
  }
}


/**
 * 饿汉模式 - 线程安全
 */
class Singleton2 {
  private static Singleton2 uniqueInstance = new Singleton2();

  private Singleton2() {
  }

  public static Singleton2 getUniqueInstance() {
    return uniqueInstance;
  }
}


/**
 * 懒汉模式 - 线程安全
 */
class Singleton3 {
  private static Singleton3 uniqueInstance;

  private Singleton3() {
  }

  public static synchronized Singleton3 getUniqueInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton3();
    }
    return uniqueInstance;
  }
}


/**
 * 双重校验 - 线程安全
 */
class Singleton4 {
  private volatile static Singleton4 uniqueInstance;

  private Singleton4() {
  }

  public static Singleton4 getUniqueInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton4.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton4();
        }
      }
    }
    return uniqueInstance;
  }
}


/**
 * 静态内部类 - 线程安全
 */
class Singleton5 {
  private volatile static Singleton5 uniqueInstance;

  private Singleton5() {
  }

  public static Singleton5 getUniqueInstance() {
    return Singleton5Holder.INSTANCE;
  }

  public static class Singleton5Holder {
    private static final Singleton5 INSTANCE = new Singleton5();
  }
}


/**
 * 枚举 - 线程安全
 */
enum Singleton6 {
  INSTANCE;
}