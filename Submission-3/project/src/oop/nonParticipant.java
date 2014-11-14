package oop;
import java.io.*;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class nonParticipant implements proceedings
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/spree";
	static final String USER = "root";
	static final String PASS = "administrator";
	static BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
	public nonParticipant()
	{
		String name="";
		String passID="";
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
	
	public void register()throws IOException
	{
		BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
		String name="",email="",username="",password="",acco="",participations=" ",achievements=" ";
		int id=1,mobile=1;
		System.out.print("Enter Name:");
		name=op.readLine();
		System.out.print("Enter ID:");
		id=Integer.parseInt(op.readLine());
		System.out.println("Enter Email");
		email=op.readLine();
		System.out.println("Enter Mobile");
		mobile=Integer.parseInt(op.readLine());
		System.out.println("Enter Username");
		username=op.readLine();
		System.out.println("Enter passsword");
		password=op.readLine();
		System.out.println("EnterAcco:INSIDE or OUTSIDE");
		username=op.readLine();
		System.out.println("Enter Username");
		
		Connection conn = null;
		Statement stmt = null;
		String sql;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

			//STEP 4: Create registered users table
			//System.out.println("Creating database...");
			stmt = (Statement) conn.createStatement();
			
			sql = "INSERT INTO PARTICIPANT(name,id,email,mobile,username,password,acco,participations,achievements)"+"VALUES('"+name+"','"+id+"','"+email+"','"+mobile+"','"+username+"','"+password+"','"+acco+"','"+participations+"','"+achievements+"')";
			stmt.executeUpdate(sql);
		
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		}
	}
	
	

