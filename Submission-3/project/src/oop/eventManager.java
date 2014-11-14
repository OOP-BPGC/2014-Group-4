package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
public class eventManager
{
	String emName,sportName;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/spree";
	static final String USER = "root";
	static final String PASS = "administrator";
	static BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
	public eventManager()
	{
	}
	public eventManager(String name,String sportsName)
	{
		emName=name;
		sportName=sportsName;
	}
	
	public String scheduleUpdate(Sport s)throws IOException
	{
		Connection conn = null;
		Statement stmt = null;
		String sql;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			//STEP 4: Create registered users table
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			System.out.println("Round?");
			int round=Integer.parseInt(op.readLine());
			System.out.println("New Schedule:");
			String sch=op.readLine();
			//Rectify
			sql = "UPDATE CRICKET " +
	                   "SET Round=?, Fixtures=?";
			
			stmt.executeUpdate(sql);
			
		}
		catch(Exception e)
		{
			
		}
		
		return "Updated Schedule";
	}
	public  String scoreUpdate(Sport s)throws IOException
	{
		//Enter Score
		return "Updated Score";
	}
	public String standings(Sport s)throws IOException
	{
		//Enter standings
		return "Updated Standings";
	}
	public void getFromInventory(Sport s)throws IOException
	{
		s.inv.updateStock(0-(s.equipments));
	}
	public  void returnToInventory(Sport s)throws IOException
	{
		s.inv.updateStock(s.equipments);
	}
	public static boolean adminLogin(String u,String p)throws IOException
	{
		
		return true;
	}
}