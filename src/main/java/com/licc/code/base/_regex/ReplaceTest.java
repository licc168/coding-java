package com.licc.code.base._regex;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/20 9:52
 * @see
 */
public class ReplaceTest {
   public static void main(String arge[]){
     //驼峰修改成下划线  分组
      String s = "userCreateTime";
      s = s.replaceAll("([A-Z]+)","_$1").toLowerCase();
     System.out.println(s);

     //去掉前后逗号
     String s1 = ",wwwTwwwWtttt,";
     s1 = s1.replaceAll("^,|,$","");
     System.out.println(s1);

   }
}
