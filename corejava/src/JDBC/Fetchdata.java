package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetchdata {
	private static final String QUERY = "SELECT id, first,last, age From Registration";

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
		Statement st = conn.createStatement();
		System.out.println("fetching data: ");
		ResultSet rs = st.executeQuery(QUERY);
		
		System.out.println("Fetching Records: ");
		String sql = "Select id, first, last, age From Registration where id>=100";
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			//display values
			System.out.println("ID " + rs.getInt("id"));
			System.out.println(", Age "+rs.getInt("age"));
			System.out.println(", first "+rs.getString("first"));
			System.out.println(", last " + rs.getString("last"));
		}
		rs.close();
	}
}
