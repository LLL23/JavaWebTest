package JDBCDemo;

import java.util.ArrayList;

public class FindAllUsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsersDao ud = new UsersDao();
		//将UserDao对象的findAll方法执行后的结果放入list集合
		ArrayList<User> list = ud.findAll();
		for(int i=0;i<list.size();i++) {
			System.out.println("第"+(i+1)+"条数据的name的值为:"+list.get(i).getName());
		}
	}

}
