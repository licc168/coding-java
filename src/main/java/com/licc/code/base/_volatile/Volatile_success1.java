package com.licc.code.base._volatile;

/**
 * 调用setIsopen方法并设置isopen为true，由于isopen是volatile修饰的，所以一经修改，其他线程都可以拿到isopen的最新值，用户请求就可以执行促销逻辑了
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/14 13:12
 * @see
 */
public class Volatile_success1 {
    private volatile boolean isopen;
    public void run() {
        if (isopen) {
            //促销逻辑
        } else {
            //正常逻辑
        }
    }
    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }
}
