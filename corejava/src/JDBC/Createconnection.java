package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createconnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		System.out.println("Connection is created: ");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		System.out.println("Connection is created: ");
		Statement st = conn.createStatement();
		String sql = "create Database Student";
		st.executeUpdate(sql);
		System.out.println("Database is created: ");
	}
}
