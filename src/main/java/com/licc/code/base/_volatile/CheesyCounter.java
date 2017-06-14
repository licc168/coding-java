package com.licc.code.base._volatile;
/**
 * 对变量的写操作不依赖于当前值。
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/14 13:12
 * @see
 **/
public class CheesyCounter {

    private volatile int value;
 
    public int getValue() { return value; }
 
    public synchronized int increment() {
        return value++;
    }
}