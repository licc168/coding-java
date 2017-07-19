package com.licc.code.base._lock.spinlock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁-简单版本
 * @author lichangchao
 */
public class SpinLock1 {
    AtomicReference<Thread> owner =  new AtomicReference<>();
    //获得锁
    public  void lock(){
        Thread thread =  Thread.currentThread();
        while (!owner.compareAndSet(null,thread));
    }
    //释放锁
    public void unLock(){
        Thread thread = Thread.currentThread();
        if(thread == owner.get()){
            owner.compareAndSet(thread,null);
        }
    }
}
