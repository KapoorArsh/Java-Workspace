package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {
public static void main(String[] args) throws SQLException {
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement st = conn.createStatement();
	String sql = "Create table Registration" + 
			     "(id integer not NULL," +
			     "first varchar(255)," +
			     "last varchar(255)," + 
			     "age integer," +
			     "primary key(id))";
	st.executeUpdate(sql);
	System.out.println("Table created");
}
}