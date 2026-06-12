package JDBC.PreStmtJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id = "7";
		String first = "Baani";
		String last = "Cute";
		String age = "2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement ps = conn.prepareStatement("Insert into registration values('"+id+"','"+first+"','"+last+"','"+age+"')");
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
}
