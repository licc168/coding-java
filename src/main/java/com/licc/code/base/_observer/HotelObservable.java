package com.licc.code.base._observer;

import java.util.Observable;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/20 10:38
 * @see
 */
public class HotelObservable  extends Observable{
  public void doSomething(){
    System.out.println("I am doing something");
    setChanged();
    notifyObservers("嘎嘎嘎");
  }
}
