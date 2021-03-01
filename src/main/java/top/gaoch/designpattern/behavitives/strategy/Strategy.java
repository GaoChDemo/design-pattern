package top.gaoch.designpattern.behavitives.strategy;

/**
 * 抽象策略类
 *
 * @author gaoch
 * @date 2021/3/2 00:53
 */
public interface Strategy {
  void strategyMethod();    //策略方法
}


//具体策略类A
class ConcreteStrategyA implements Strategy {
  public void strategyMethod() {
    System.out.println("具体策略A的策略方法被访问！");
  }
}


//具体策略类B
class ConcreteStrategyB implements Strategy {
  public void strategyMethod() {
    System.out.println("具体策略B的策略方法被访问！");
  }
}


//环境类
class Context {
  private Strategy strategy;

  public Strategy getStrategy() {
    return strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void strategyMethod() {
    strategy.strategyMethod();
  }
}
