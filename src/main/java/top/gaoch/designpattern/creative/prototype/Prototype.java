package top.gaoch.designpattern.creative.prototype;

import java.util.Objects;

/**
 * TODO
 *
 * @author gaoch
 * @date 2021/3/1 01:43
 */
public class Prototype implements Cloneable {
  private String field;

  Prototype(String field) {
    this.field = field;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Prototype(this.field);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prototype prototype = (Prototype) o;
    return Objects.equals(field, prototype.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field);
  }
}
