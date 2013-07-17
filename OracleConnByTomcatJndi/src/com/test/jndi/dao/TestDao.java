package com.test.jndi.dao;

import java.sql.SQLException;

import com.test.jndi.conn.BaseDao;

public class TestDao extends BaseDao{

	private static final String  JndiName = "java:comp/env/jdbc/OracleConnByTomcatJndi"; //数据库的JNDI连接串

	public static void main(String[] args) {
		new TestDao().getAllBySql();
	}
	
	public void getAllBySql(){
		
		System.out.println("获得数据库连接");
		super.openConn(JndiName);

		System.out.println("获得数据库EMP表数据");
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
