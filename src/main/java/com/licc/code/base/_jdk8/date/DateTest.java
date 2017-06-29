package com.licc.code.base._jdk8.date;

import java.time.Instant;

import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/28 9:35
 * @see
 */
public class DateTest {
   public static void main(String arge[]){
      System.out.println(Date.from(Instant.now().minus(12,ChronoUnit.HOURS)));
   }
}
