
public class SingletonMain {

	public static void main(String[] args) {
		DBConn dbconn = DBConn.getInstance();
		System.out.println(dbconn);
		
	}
}

