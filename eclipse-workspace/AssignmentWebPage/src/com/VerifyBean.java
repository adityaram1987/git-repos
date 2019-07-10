package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class VerifyBean {
	private String name;
	private String pswrd;
	private int correctDetails=0;
	private int wrongPassword=1;
	private int noDetails=2;
	public int verify(String name, String pswrd){
		try
		{
			this.name= name;
			this.pswrd = pswrd;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Sapient123");
			Statement stmt = con.createStatement();
			//stmt.executeUpdate("update emp set age= age+1");
			ResultSet rs= stmt.executeQuery("select * from loginDetails");
			while(rs.next()) {
				if(rs.getString(1).equals(name) && rs.getString(2).equals(pswrd)) {
					
					return correctDetails;
				}
				if(rs.getString(1).equals(name) && !rs.getString(2).equals(pswrd)) {
					
					return wrongPassword;
				}
			}
			rs.close();
			stmt.close();
			con.close();
			
			return noDetails;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return wrongPassword;
		}
	}
	
	public boolean register(String name, String pswrd) {
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Sapient123");
			PreparedStatement stmt = con.prepareStatement("insert into loginDetails values(?,?)");
			//stmt.executeUpdate("update emp set age= age+1");
			
			stmt.setString(1, name);
			stmt.setString(2, pswrd);
			stmt.execute();
			stmt.close();
			con.close();
			
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
}
