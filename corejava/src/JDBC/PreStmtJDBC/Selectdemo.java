package JDBC.PreStmtJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Selectdemo {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from registration");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String id1 = rs.getString("id");
			System.out.println(id1);
			String firstname = rs.getString("first");
			System.out.println(firstname);
			String lastname = rs.getString("last");
			System.out.println(lastname);
			String age1 = rs.getString("age");
			System.out.println(age1);
		}
	}
}
