/**
 *这种写法就是所谓的懒汉模式。
 *它使用了延迟加载来保证对象在没有使用之前，
 *是不会进行初始化的。
 *但是，通常这个时候面试官又会提问新的问题来刁难一下。
 *他会问：这种写法线程安全吗？
 *回答必然是：不安全。
 *这是因为在多个线程可能同时运行到第九行，判断singObj为null，
 *于是同时进行了初始化。
 *所以，这是面临的问题是如何使得这个代码线程安全？
 *很简单，在那个方法前面加一个Synchronized就OK了
 */
package com.singletons;
public final class ThreadSafeSingleton   
{   
    private static ThreadSafeSingleton singObj = null;   
   
    private ThreadSafeSingleton(){   
    }   
   
    public static synchronized ThreadSafeSingleton getSingleInstance(){   
        if(null == singObj ) singObj = new ThreadSafeSingleton(); 
            return singObj; 
    }   
}   
