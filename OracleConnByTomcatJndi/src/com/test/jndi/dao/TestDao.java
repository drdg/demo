package com.test.jndi.dao;

import java.sql.SQLException;

import com.test.jndi.conn.BaseDao;

public class TestDao extends BaseDao{

	private static final String  JndiName = "java:comp/env/jdbc/OracleConnByTomcatJndi"; //���ݿ��JNDI���Ӵ�

	public static void main(String[] args) {
		new TestDao().getAllBySql();
	}
	
	public void getAllBySql(){
		
		System.out.println("������ݿ�����");
		super.openConn(JndiName);

		System.out.println("������ݿ�EMP������");
		try {
			ps = conn.prepareStatement("select * from emp");
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
