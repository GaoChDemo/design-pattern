package top.gaoch.designpattern.behavitives.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 13:16
 */
public interface Interpreter {
}


//抽象表达式类
interface Expression {
  boolean interpret(String info);
}


//终结符表达式类
class TerminalExpression implements Expression {
  private Set<String> set = new HashSet<String>();

  public TerminalExpression(String[] data) {
    for (int i = 0; i < data.length; i++) {
        set.add(data[i]);
    }
  }

  public boolean interpret(String info) {
    if (set.contains(info)) {
      return true;
    }
    return false;
  }
}


//非终结符表达式类
class AndExpression implements Expression {
  private Expression city = null;
  private Expression person = null;

  public AndExpression(Expression city, Expression person) {
    this.city = city;
    this.person = person;
  }

  public boolean interpret(String info) {
    String s[] = info.split("的");
    return city.interpret(s[0]) && person.interpret(s[1]);
  }
}


//环境类
class ConcreteInterpreter implements Interpreter {
  private String[] citys = {"韶关", "广州"};
  private String[] persons = {"老人", "妇女", "儿童"};
  private Expression cityPerson;

  public ConcreteInterpreter() {
    Expression city = new TerminalExpression(citys);
    Expression person = new TerminalExpression(persons);
    cityPerson = new AndExpression(city, person);
  }

  public void freeRide(String info) {
    boolean ok = cityPerson.interpret(info);
    if (ok) {
      System.out.println("您是" + info + "，您本次乘车免费！");
    } else {
      System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
    }
  }
}