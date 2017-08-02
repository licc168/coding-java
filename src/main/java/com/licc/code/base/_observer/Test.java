package com.licc.code.base._observer;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/20 10:45
 * @see
 */
public class Test {
 public static void main(String arge[]){
   HotelObservable observable = new HotelObservable();
   HotelA a =  new HotelA();
   observable.addObserver(a);
   HotelB b =  new HotelB();
   observable.addObserver(b);
   observable.doSomething();
 }
}
