package com.licc.code.base._null;

import com.licc.code.base._lock.spinlock.SpinLock1;
import com.licc.code.base._lock.spinlock.Test1;

import java.util.Optional;

public class TestNull {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

      //不同类型的相比 不同
      String s = "2";
      Integer i = 2;
      if(s.equals(i)){
          System.out.printf("相同");
      }

    Null1 null1 = new Null1();
     Optional<String> a =  null1.getA(null);
   String sss = a.map(va ->{
            System.out.println(va);
            return va;
        }).orElse("123123");
        System.out.println(sss);
    }
}
