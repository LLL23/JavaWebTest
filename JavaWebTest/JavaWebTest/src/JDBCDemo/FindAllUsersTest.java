package JDBCDemo;

import java.util.ArrayList;

public class FindAllUsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsersDao ud = new UsersDao();
		//��UserDao�����findAll����ִ�к�Ľ������list����
		ArrayList<User> list = ud.findAll();
		for(int i=0;i<list.size();i++) {
			System.out.println("��"+(i+1)+"�����ݵ�name��ֵΪ:"+list.get(i).getName());
		}
	}

}
