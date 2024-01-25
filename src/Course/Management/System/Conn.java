package course.management.system;

public class Conn {
	Conn () {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
