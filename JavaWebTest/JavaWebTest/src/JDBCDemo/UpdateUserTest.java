package JDBCDemo;

public class UpdateUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDao ud = new UsersDao();
		User user = new User();
		user.setName("����");
		user.setId(4);
		user.setSex("Ů");
		boolean b = ud.update(user);
		System.out.println(b);
	}

}
