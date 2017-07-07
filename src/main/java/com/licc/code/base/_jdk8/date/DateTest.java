package com.licc.code.base._jdk8.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
   public static void main(String arge[]) throws ParseException {
      System.out.println(Date.from(Instant.now().minus(12,ChronoUnit.HOURS)));
      String upTimeString = "2016-05-12";
      SimpleDateFormat formatter = new SimpleDateFormat("YYYY-mm-dd");
      Date upTime = formatter.parse(upTimeString);
      Instant instant = upTime.toInstant();
      ZoneId zone = ZoneId.systemDefault();
      LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
      LocalDate localDate = localDateTime.toLocalDate();
      System.out.println(localDate.toString());
   }
}
