package loginDataBase.loginCheck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Checking {
	public static void main(String args[]) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Sapient123");
			Statement stmt = con.createStatement();
			//stmt.executeUpdate("update emp set age= age+1");
			ResultSet rs= stmt.executeQuery("select * from loginDetails");
			while(rs.next()) {
				System.out.println("Name: "+ rs.getString(1));
				System.out.println("Password: "+ rs.getString(2));
				System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
