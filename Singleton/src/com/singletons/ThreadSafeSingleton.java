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
