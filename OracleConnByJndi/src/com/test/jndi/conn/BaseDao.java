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
 * 需要在TOMCAT的配置文件中写入配置数据链接数据库 本次为链接oracle数据库
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
	 * JDBC获得数据库链接
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
	 * JNDI获得数据库链接
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
	 * 关闭数据库
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
