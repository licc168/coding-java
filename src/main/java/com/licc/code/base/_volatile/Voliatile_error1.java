package com.licc.code.base._volatile;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/14 13:12
 * @see
 */
public class Voliatile_error1  {
  public static volatile int i = 0;
  public static void main(String args[]){

    new Thread(new Runnable(){
      public void run(){
        for(int j = 0; j < 100; j++)
          i++;
        System.out.println("Thread1 end...");
      }
    }).start();

    new Thread(new Runnable(){
      public void run(){
        for(int j = 0; j < 100; j++)
          i++;
        System.out.println("Thread2 end...");
      }
    }).start();

    i++;

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("i = " + i);
  }
}
