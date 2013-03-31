package com.singletons;
/**
 * 那么有没有什么更好的写法呢？
 * 有！这里又要提出一种新的模式——Initialization on Demand Holder. 
 * 这种方法使用内部类来做到延迟加载对象，在初始化这个内部类的时候，
 * JLS(Java Language Sepcification)会保证这个类的线程安全。
 * 这种写法最大的美在于，完全使用了Java虚拟机的机制进行同步保证，
 * 没有一个同步的关键字。
 */
public class Singleton {
	private static class SingletonHolder {
		public final static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
