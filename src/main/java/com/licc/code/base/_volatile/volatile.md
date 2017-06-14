 # java volatile
  > ## 一.相关资料
   >1.  [java volatile 关键字解惑](http://www.jianshu.com/p/195ae7c77afe)
   >2.  [单例模式、双检测锁定DCL、volatile（转）](http://crud0906.iteye.com/blog/576321)
   >3.  [正确使用 Volatile 变量](https://www.ibm.com/developerworks/cn/java/j-jtp06197.html)
   >4.  [聊聊并发（一）深入分析Volatile的实现原理](http://ifeve.com/volatile/)
   
   > ## 二.volatile 注意事项
   >1. **运算结果并不依赖于当前值，或者能确保只有单一的线程能够修改变量的值**  </br>
      _eg_:[Volatile_error1](/src/main/java/com/licc/code/base/_volatile/Voliatile_error1.java)
   
   >2. **该变量没有包含在具有其他变量的不变式中**.  </br>
       _eg_:[Volatile_error2](/src/main/java/com/licc/code/base/_volatile/Voliatile_error2.java)
   > ## 三.volatile 适用场景
   > 1. 状态标识:  </br>
     eg:[Volatile_sussess1](/src/main/java/com/licc/code/base/_volatile/Volatile_success1.java "状态标识示例")

   > 2. double check 单列:  </br>
      eg:[Singleton](/src/main/java/com/licc/code/base/_volatile/Singleton.java)
   
   > 3. 开销较低的读－写锁策略:  </br>
      eg:[CheesyCounter](/src/main/java/com/licc/code/base/_volatile/CheesyCounter.java)
     
   
   
       