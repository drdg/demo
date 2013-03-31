/**
 * ���Ե�ʱ�򣬳����ᱻ�ʵ�����һ�����⣺
 * ����д��һ������ģʽ��Singleton Pattern���ɡ�
 * �ðɣ�д��д���⻹�����ס�˳��дһ����
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
