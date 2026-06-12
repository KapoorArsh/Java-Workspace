package JDBC.PreStmtJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletedemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String first = "sweta";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from registration where first =?");
		ps.setString(1, first);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		conn.close();
	}

}
