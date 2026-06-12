package JDBC.PreStmtJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into registration values('5','arsh','kapoor','22')");
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
}
}
