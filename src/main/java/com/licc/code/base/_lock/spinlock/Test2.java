package com.licc.code.base._lock.spinlock;

/**
 * 自旋锁-简单版本测试类
 * @author  lichangchao
 * @time 2017-07-19
 */
public class Test2 implements  Runnable  {
    static int sum;
    private SpinLock2 lock;

    public Test2(SpinLock2 lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        this.lock.lock();//@1
        this.lock.lock();//@2
        sum++;
        this.lock.unLock();
        this.lock.unLock();
    }


    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        SpinLock2 lock = new SpinLock2();
        for (int i = 0; i < 100; i++) {
            Test2 test = new Test2(lock);
            Thread t = new Thread(test);
            t.start();
        }

        Thread.currentThread().sleep(1000);
        System.out.println(sum);
    }
}
/**
 * 分析：
 @1：当前线程获取自旋锁lock()
 @2：再次获取锁lock(),等待当前线程释放锁,由于当前线程是自己并已获取了锁 所以出现了死循环
 * 解决方案：判断自己是否已获得锁  见spinLock2
 *
 **/