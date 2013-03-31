/**
 * 面试的时候，常常会被问到这样一个问题：
 * 请您写出一个单例模式（Singleton Pattern）吧。
 * 好吧，写就写，这还不容易。顺手写一个：
 * @author Administrator
 */
package com.singletons;
public final class EagerSingleton {
	private static EagerSingleton singObj = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getSingleInstance() {
		return singObj;
	}
}
