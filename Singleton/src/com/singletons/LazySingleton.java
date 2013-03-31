package com.singletons;

/**
 * ����д��������ν������ģʽ��
 * ��ʹ�����ӳټ�������֤������û��ʹ��֮ǰ��
 * �ǲ�����г�ʼ���ġ�
 * ���ǣ�ͨ�����ʱ�����Թ��ֻ������µ�����������һ�¡�
 * �����ʣ�����д���̰߳�ȫ��
 * �ش��Ȼ�ǣ�����ȫ��������Ϊ�ڶ���߳̿���ͬʱ���е��ھ��У�
 * �ж�singObjΪnull������ͬʱ�����˳�ʼ����
 * ���ԣ��������ٵ����������ʹ����������̰߳�ȫ��
 * �ܼ򵥣����Ǹ�����ǰ���һ��Synchronized��OK�ˡ�
 */
public final class LazySingleton {
	private static LazySingleton singObj = null;

	private LazySingleton() {
	}

	public static LazySingleton getSingleInstance(){   
        if(null == singObj ) singObj = new LazySingleton(); 
          return singObj; 
    }}