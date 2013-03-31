package com.singletons;
/**
 * ��ô��û��ʲô���õ�д���أ�
 * �У�������Ҫ���һ���µ�ģʽ����Initialization on Demand Holder. 
 * ���ַ���ʹ���ڲ����������ӳټ��ض����ڳ�ʼ������ڲ����ʱ��
 * JLS(Java Language Sepcification)�ᱣ֤�������̰߳�ȫ��
 * ����д�����������ڣ���ȫʹ����Java������Ļ��ƽ���ͬ����֤��
 * û��һ��ͬ���Ĺؼ��֡�
 */
public class Singleton {
	private static class SingletonHolder {
		public final static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
