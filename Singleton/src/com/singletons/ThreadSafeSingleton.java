/**
 *����д��������ν������ģʽ��
 *��ʹ�����ӳټ�������֤������û��ʹ��֮ǰ��
 *�ǲ�����г�ʼ���ġ�
 *���ǣ�ͨ�����ʱ�����Թ��ֻ������µ�����������һ�¡�
 *�����ʣ�����д���̰߳�ȫ��
 *�ش��Ȼ�ǣ�����ȫ��
 *������Ϊ�ڶ���߳̿���ͬʱ���е��ھ��У��ж�singObjΪnull��
 *����ͬʱ�����˳�ʼ����
 *���ԣ��������ٵ����������ʹ����������̰߳�ȫ��
 *�ܼ򵥣����Ǹ�����ǰ���һ��Synchronized��OK��
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
