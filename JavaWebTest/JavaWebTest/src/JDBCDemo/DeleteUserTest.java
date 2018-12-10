package JDBCDemo;

public class DeleteUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDao ud = new UsersDao();
		boolean b = ud.delete(4);
		System.out.println(b);
	}

}
