package JDBC.PreStmtJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id = "1";
		String first = "Noor";
		String last = "Pyaara";
		String age = "19";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement ps = conn.prepareStatement("Insert into registration values(?,?,?,?)");
		ps.setString(1, id);
		ps.setString(2, first);
		ps.setString(3, last);
		ps.setString(4, age);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}

}
