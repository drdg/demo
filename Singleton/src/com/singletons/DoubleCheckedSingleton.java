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
