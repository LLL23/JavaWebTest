package JDBCDemo;

public class FindUserByIdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDao ud = new UsersDao();
		User user = ud.find(1);
		System.out.println("idΪ1��User�����name��ֵΪ:"+user.getName());
		
	}

}
