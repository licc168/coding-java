package com.licc.jsoup;

import java.io.IOException;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/6 16:13
 * @see
 */
public class TestJsoup {
  public static void main(String arge[]) throws IOException {

      for(int i =0 ;i<10;i++){
        try {
        if(i == 6){
          String s = "asd";
          Integer ii = Integer.parseInt(s);
        }
        System.out.println(i);
      }catch (Exception e){


        }
    }

  }
}
