package com.licc.code.base._volatile;

/**
 *该变量没有包含在具有其他变量的不变式中。
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/14 16:16
 * @see
 */
public class Voliatile_error2 {
  private volatile int lower = 0;
  private volatile int upper = 10;


  public int getLower() { return lower; }
  public int getUpper() { return upper; }

  public void setLower(int value) {
    if (value > upper)
      throw new IllegalArgumentException("");
    lower = value;
  }

  public void setUpper(int value) {
    if (value < lower)
      throw new IllegalArgumentException("");
    upper = value;
  }


}
