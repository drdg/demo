/**
 *写到这里，面试官可能仍然会狡猾的看了你一眼，
 *继续刁难到：这个写法有没有什么性能问题呢？
 *答案肯定是有的！
 *同步的代价必然会一定程度的使程序的并发度降低。
 *那么有没有什么方法，一方面是线程安全的，有可以有很高的并发度呢？
 *我们观察到，线程不安全的原因其实是在初始化对象的时候，
 *所以，可以想办法把同步的粒度降低，只在初始化对象的时候进行同步。
 *这里有必要提出一种新的设计思想——双重检查锁（Double-Checked Lock）。
 */
package com.singletons;
public final class DoubleCheckedSingleton {
	private static DoubleCheckedSingleton singObj = null;

	private DoubleCheckedSingleton() {
	}

	public static DoubleCheckedSingleton getSingleInstance() {
		if (null == singObj) {
			synchronized (DoubleCheckedSingleton.class) {
				if (null == singObj)
					singObj = new DoubleCheckedSingleton();
			}
		}
		return singObj;
	}
}
