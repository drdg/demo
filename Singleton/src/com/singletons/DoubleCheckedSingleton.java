/**
 *д��������Թٿ�����Ȼ��ƻ��Ŀ�����һ�ۣ�
 *�������ѵ������д����û��ʲô���������أ�
 *�𰸿϶����еģ�
 *ͬ���Ĵ��۱�Ȼ��һ���̶ȵ�ʹ����Ĳ����Ƚ��͡�
 *��ô��û��ʲô������һ�������̰߳�ȫ�ģ��п����кܸߵĲ������أ�
 *���ǹ۲쵽���̲߳���ȫ��ԭ����ʵ���ڳ�ʼ�������ʱ��
 *���ԣ�������취��ͬ�������Ƚ��ͣ�ֻ�ڳ�ʼ�������ʱ�����ͬ����
 *�����б�Ҫ���һ���µ����˼�롪��˫�ؼ������Double-Checked Lock����
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
