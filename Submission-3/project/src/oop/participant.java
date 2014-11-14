package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class participant implements proceedings
{
	String email,name,username,pwd,acco,part,ach;
	//long mobile;
	int id,mobile;
	boolean login=false;
	boolean match=false;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/spree";
	static final String USER = "root";
	static final String PASS = "administrator";
	
	public participant()
	{
	}
	
	public static participant login(String user, String pass)throws IOException
	{
		participant z=new participant();
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
			sql = "SELECT name,id,email,mobile,username,password,acco,participations,achievements FROM PARTICIPANT";
			 ResultSet rs = stmt.executeQuery(sql);
			 while(rs.next())
			 {
				 if((rs.getString("user").compareTo(user)==0)&&rs.getString(pass).compareTo(pass)==0)
				 z.name=rs.getString("name");
				 z.id=rs.getInt("id");
				 z.email=rs.getString("email");
				 z.mobile=rs.getInt("mobile");
				 z.username=rs.getString("username");
				 z.pwd=rs.getString("password");
				 z.acco=rs.getString("acco");
				 z.part=rs.getString("participations");
				 z.ach=rs.getString("achievements");
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return z;
		
	}
	public String regForSport(Sport s)throws IOException
	{
		if(s.slots>0)
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
			
			sql =  "UPDATE Participant" +
	                   "SET part=s.tableID";
			stmt.executeUpdate(sql);
		
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Registered";
		}
		else
			return "Slots Full";
	}
	public String cancelReg(Sport s)throws IOException
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
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Check Already registered
		//Increase slots
		convener.queue[convener.ind]=this;
		convener.ind++;
		convener.approveCancel(this);
		return "Cancelled";
	}
	
	public void play(Sport s)throws IOException
	{
		match=true;
	}
	public String getEmail()throws IOException
	{
		//output
		return this.email;
	}
	
	public boolean checkEmail(String emailID)throws Exception
	{
		//Check format
		return true;
	}
	public String getSchedule(Sport s)
	{
		return "";
	}

	public String getScore(Sport s) {
		return "";
	}

	public String getStandings(Sport s) {
		return null;
	}

	public String regForNonSport(nonSportEvent n) {
		return null;
	}

	public String getNonSportSchedule(nonSportEvent n) {
		return null;
	}
}