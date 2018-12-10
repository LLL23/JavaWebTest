package JDBCDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsersDao {

	public boolean insert(User user) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//获取数据连接
			conn = JDBCUtils.getConnection();
			//获取Statement对象
			stmt = conn.createStatement();
			
			String sql1 = "INSERT INTO userinformation (username,password,phone,email,sex) VALUES"
					+ "('"+user.getUsername()+"','"+
			user.getPassword()+"','"+user.getPhone()+"','"+user.getEmail()+"','"+user.getSex()+"')"; 
//			String sql = "INSERT INTO student (name,id,sex)"+
//			"VALUES("
//					+user.getName()
//					+",'"
//					+user.getId()
//					+"','"
//					+user.getSex()+"')";
					int num =stmt.executeUpdate(sql1);
					if(num >0) {
						return true;
					}
					return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt,conn);
		}
		return false;
	}
	//查询所有的User对象
	public ArrayList<User> findAll(){
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<User> list=new ArrayList<User>();
		try {
			//获取数据连接
			conn = JDBCUtils.getConnection();
			//获取Statement对象
			stmt = conn.createStatement();
			String sql = "SELECT * FROM userinformation";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				User user = new User();
				user.setName(rs.getString("username"));
//				user.setId(rs.getInt("id"));
//				user.setSex(rs.getString("sex"));
				list.add(user);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return null;
	}
	//根据id查找指定的user
	public User find(int id) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//获取数据连接
			conn = JDBCUtils.getConnection();
			//获取Statement对象
			stmt = conn.createStatement();
			String sql="SELECT * FROM userinformation WHERE id = " +id;
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				User user = new User();
				user.setName(rs.getString("name"));
//				user.setId(rs.getInt("id"));
//				user.setSex(rs.getString("sex"));
				return user;
			}
			return null;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return null;
	}
	//删除用户
	public boolean delete(int id) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//获取数据连接
			conn = JDBCUtils.getConnection();
			//获取Statement对象
			stmt = conn.createStatement();
			String sql = "DELETE FROM userinformation WHERE id =" +id;
			int num = stmt.executeUpdate(sql);
			if(num >0) {
				return true;
			}
			return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return false;
	}
	//修改用户
	public boolean update(User user) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//获取数据连接
			conn = JDBCUtils.getConnection();
			//获取Statement对象
			stmt = conn.createStatement();
			String sql ="UPDATE userinformation set name='"+user.getName()
			+"',id="+user.getEmail()+",sex='"
			+user.getName()+"'WHERE id ="+user.getEmail();
			int num = stmt.executeUpdate(sql);
			if (num >0) {
				return true;
			}
			return false;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs, stmt, conn);
		}
		return false;
		
	}
	
}
