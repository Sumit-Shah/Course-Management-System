package course.management.system;

import java.sql.*;

public class Conn {
	Connection c;
    Statement s;
//	su_mit@1999
    
	Conn () {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///coursemanagementsystem", "root", "su_mit@1999");
            s = c.createStatement();
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
