 # java volatile
  > ## 一.相关资料
   >1.  [java volatile 关键字解惑](http://www.jianshu.com/p/195ae7c77afe)
   >2.  [单例模式、双检测锁定DCL、volatile（转）](http://crud0906.iteye.com/blog/576321)
   >3.  [正确使用 Volatile 变量](https://www.ibm.com/developerworks/cn/java/j-jtp06197.html)
   >4.  [聊聊并发（一）深入分析Volatile的实现原理](http://ifeve.com/volatile/)
   
   > ## 二.volatile 注意事项
   >1. 运算结果并不依赖于当前值，或者能确保只有单一的线程能够修改变量的值。
      eg:[Volatile_error1](/Voliatile_error1.java)
        