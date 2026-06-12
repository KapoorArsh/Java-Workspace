package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertvalues {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st = con.createStatement();
		System.out.println("Inserting records into the table...");
		String sql = "insert into registration values (100,'sweta','sharma',19)";
		st.executeUpdate(sql);
		sql = "insert into registration values (101,'lina','shahane',35)";
		st.executeUpdate(sql);
		sql = "insert into registration values (102,'vidya','sachdeva',31)";
		st.executeUpdate(sql);
		sql = "insert into registration values (103,'poonam','verma',25)";
		st.executeUpdate(sql);
		sql = "insert into registration values (104,'noorpal','singh',19)";
		st.executeUpdate(sql);
		System.out.println("Values inserted into the table");
		
	}
}
