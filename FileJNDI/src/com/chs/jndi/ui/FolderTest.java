package com.chs.jndi.ui;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;

public class FolderTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");  //����JNDI����
		env.put(Context.PROVIDER_URL, "file://d:/");                                             //����JNDI�ļ�·��
		try {
			Context ctx = new InitialContext(env);
			NamingEnumeration list = ctx.list("/");
			while(list.hasMore()){
				NameClassPair nc =  (NameClassPair)list.next();
				System.out.println(nc.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
