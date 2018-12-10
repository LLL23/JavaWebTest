package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	//���ز��������ݿ�
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/user"
          		+ "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
          String user = "root";
          String password = "123456";
          Connection conn = DriverManager.getConnection(url,user,password);
		  return conn;
	}
	//�ر����ݿ����ӣ��ͷ���Դ
	public static void release(Statement stmt,Connection conn) {
		if(stmt != null) {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			stmt =null;
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			conn  =null;
		}
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			rs  =null;
		}
		release(stmt,conn);
		
	}

}
