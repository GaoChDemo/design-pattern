package top.gaoch.designpattern.behavitives.command;

/**
 * 抽象命令
 *
 * @author gaoch
 * @date 2021/3/1 02:07
 */
public interface Command {
  void execute();
}


//调用者
class Invoker {
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call() {
    System.out.println("调用者执行命令command...");
    command.execute();
  }
}


//具体命令
class ConcreteCommand implements Command {
  private Receiver receiver;

  ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  public void execute() {
    receiver.action();
  }
}


//接收者
class Receiver {
  public void action() {
    System.out.println("接收者的action()方法被调用...");
  }
}
