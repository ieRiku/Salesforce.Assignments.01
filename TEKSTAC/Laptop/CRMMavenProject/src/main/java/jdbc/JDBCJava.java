package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCJava {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort", "root", "orcl1234");
		
		//use statement interface and send data to database
		Statement st = c.createStatement();	
		String str = "insert into students values (5,'Amit Dey')";
		st.executeUpdate(str);
		
//		//use statement interface and send dynamic data to database	
//		String str = "insert into employee values (?,?,?,?)";
//		PreparedStatement ps = c.prepareStatement(str);
//		ps.setInt(1, 6);
//		ps.setString(2, "ccc");
//		ps.setString(3, "associate");
//		ps.setInt(4, 20000);
//		ps.executeUpdate();
		
		c.close();
	}
}
