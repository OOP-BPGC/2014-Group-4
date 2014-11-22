package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class nonSportEvent 
{	
	static Connection conn = null;
	static Statement stmt = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/spree";
	static final String USER = "root";
	static final String PASS = "administrator";
	

	private String attractions;
	private String Time;
	public nonSportEvent(String a,String t)
	{try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		//STEP 4: Create registered users table
		System.out.println("Creating database...");
	}
	catch(Exception e){}
		attractions="";
		Time="";
	}
	public static String getAttractions()throws IOException
	{try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		//STEP 4: Create registered users table
		System.out.println("Creating database...");
	stmt = conn.createStatement();
	}
	catch(Exception e){}
		//Get from database
		return "";
	}
	
	public static String getTime()throws IOException
	{try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		//STEP 4: Create registered users table
		System.out.println("Creating database...");
	stmt = conn.createStatement();
	}
	catch(Exception e){}
		//Get from database
		return "";
	}
	
}
