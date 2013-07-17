package com.test.jndi.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * 
 * ��Ҫ��TOMCAT�������ļ���д�����������������ݿ� ����Ϊ����oracle���ݿ�
 * 
 * @author FUZHENGWEI
 * 
 */
public class BaseDao {

	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	protected Statement st = null;

	/**
	 * JDBC������ݿ�����
	 */
	protected void openConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.0.1.88:1521:orcl", "scott", "tiger");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * JNDI������ݿ�����
	 */
	protected void openConn(String strJndiName) {
		try {
			InitialContext context = new InitialContext();
			DataSource ds = (DataSource) context.lookup(strJndiName.trim());
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �ر����ݿ�
	 */
	protected boolean closeResource() {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
