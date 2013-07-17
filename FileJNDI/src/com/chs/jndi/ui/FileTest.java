package com.chs.jndi.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class FileTest {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");  	//����JNDI����
		env.put(Context.PROVIDER_URL, "file://e:/");                                             	//����JNDI�ļ�·��
		try {
			Context ctx = new InitialContext(env);
			File file = (File)ctx.lookup("/����.txt");		                    //JNDI����ļ�����	
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while(line != null){
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		

	}

}
