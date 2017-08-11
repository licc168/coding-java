package com.licc.code.base._algorithm;

/**
 *
 *2元一瓶啤酒，2个空瓶换一瓶，4个瓶盖换一瓶，10块钱一共几瓶
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/8/7 14:34
 * @see
 */
public class Pjw {
  public static void main(String arge[]){
    double money = 10;
    double price = 2;
    double x =1;
    double y = 0.5;
    //不允许赊账  瓶盖能换空瓶
    count(10,2,0);
    Integer i2 = -129;

    Integer i3 = -129;

    if(i2 == i3){
      System.out.println("123213");
    }
  }

  static void   count(double money,double price,int count) {
    int j = (int) (money / price);
    double w = j * 1.5 + money % price;
    if (w >= 2) {
      count(w, price, j + count);
    } else {

      System.out.println(j + count);
    }
  }








}
