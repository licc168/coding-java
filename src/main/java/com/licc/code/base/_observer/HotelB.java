package com.licc.code.base._observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/20 10:39
 * @see
 */
public class HotelB implements Observer {


  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("HotelB"+arg);
  }
}
