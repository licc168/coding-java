package com.licc.code.base._volatile;

/**
 * 对变量的写操作不依赖于当前值。
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/6/14 13:12
 * @see
 */
class Singleton {
    private volatile static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

//public class Singleton {
//    static class SingletonHolder {
//        static Singleton instance = new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return SingletonHolder.instance;
//    }
//}