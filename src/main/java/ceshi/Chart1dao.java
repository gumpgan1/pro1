package ceshi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Chart1dao {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://10.11.112.202/SHUINI?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static String username = "user";
	private static String password = "123456";

	static {
		try {
			// 加载驱动
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		// 创建连接对象
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	// 关闭流
	public static void close(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(PreparedStatement pst, Connection conn) {
		close(null, pst, conn);
	}
}
