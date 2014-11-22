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
	public eventManager(String sportsName)
	{
		sportName=sportsName;
	}
	
	public String scheduleUpdate(Sport s)throws IOException
	{
		Connection conn = null;
		Statement stmt = null;
		String sql,t1,t2,time;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			//STEP 4: Create registered users table
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			System.out.println("Team 1:");
			t1=op.readLine();
			System.out.println("Team 2");
			t2=op.readLine();
			System.out.println("Enter time");
			time=op.readLine();
			System.out.println("Enter round");
			int round=Integer.parseInt(op.readLine());
			time=op.readLine();
			//Rectify
			
			switch(this.sportName)
			{
			case "Cricket":sql = "INSERT INTO CRICKET(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
							stmt.executeUpdate(sql);
							break;
			case "Football":sql = "INSERT INTO FOOTBALL(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "TT":sql = "INSERT INTO TT(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Basketball":sql = "INSERT INTO BASKETBALL(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Badminton":sql = "INSERT INTO BADMINTON(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Tennis":sql = "INSERT INTO TENNIS(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Volley":sql = "INSERT INTO VOLLEYteam1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Chess":sql = "INSERT INTO CHESS(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;
			case "Carrom":sql = "INSERT INTO CARROM(team1,team2,time,round,score,winner)"+"VALUES('"+t1+"','"+t2+"','"+time+"','"+round+"','"+""+"','"+""+"')";
			stmt.executeUpdate(sql);
			break;				
			}	
		}
		catch(Exception e)
		{
			
		}
		
		return "Updated Schedule";
	}
	public  String scoreUpdate(Sport s)throws IOException
	{Connection conn = null;
	Statement stmt = null;
	String sql,t1,t2,time;
	try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		//STEP 4: Create registered users table
		System.out.println("Creating database...");
		stmt = conn.createStatement();}catch(Exception e){}
		//Enter Score
	  switch(this.sportName){
	  
		case "Cricket":
			System.out.println("Enter Score");
			int sc=Integer.parseInt(op.readLine());
			System.out.println("Enter Score");
			int r=Integer.parseInt(op.readLine());
			System.out.println("Enter team name");
			String team=(op.readLine());
			
			sql = " UPDATE CRICKET " +
                   "SET score = sc WHERE (team.equals(team1) or team.equals(team2)) and r.equals(round)  ";
      stmt.executeUpdate(sql);
						break;
		case "Football":System.out.println("Enter Score");
		int sc2=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r2=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teama=(op.readLine());
		
		sql = " UPDATE FOOTBALL " +
               "SET score = sc2 WHERE (teama.equals(team1) or teama.equals(team2)) and r2.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "TT":System.out.println("Enter Score");
		int sc3=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r3=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamb=(op.readLine());
		
		sql = " UPDATE TT " +
               "SET score = sc3 WHERE (teamb.equals(team1) or teamb.equals(team2)) and r3.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Basketball":System.out.println("Enter Score");
		int sc4=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r4=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamc=(op.readLine());
		
		sql = " UPDATE BASKETBALL " +
               "SET score = sc4 WHERE (teamc.equals(team1) or teamc.equals(team2)) and r4.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Badminton":System.out.println("Enter Score");
		int sc5=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r5=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamd=(op.readLine());
		
		sql = " UPDATE BADMINTON " +
               "SET score = sc5 WHERE (teamd.equals(team1) or teamd.equals(team2)) and r5.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Tennis":System.out.println("Enter Score");
		int sc6=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r6=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teame=(op.readLine());
		
		sql = " UPDATE TENNIS " +
               "SET score = sc WHERE (teame.equals(team1) or teame.equals(team2)) and r5.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Volley":System.out.println("Enter Score");
		int sc7=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r7=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamf=(op.readLine());
		
		sql = " UPDATE VOLLEYBALL " +
               "SET score = sc7 WHERE (teamf.equals(team1) or teamf.equals(team2)) and r7.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Chess":System.out.println("Enter Score");
		int sc8=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r8=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamg=(op.readLine());
		
		sql = " UPDATE CHESS " +
               "SET score = sc8 WHERE (teamg.equals(team1) or teamg.equals(team2)) and r8.equals(round) ";
  stmt.executeUpdate(sql);
		break;
		case "Carrom":System.out.println("Enter Score");
		int sc9=Integer.parseInt(op.readLine());
		System.out.println("Enter Score");
		int r9=Integer.parseInt(op.readLine());
		System.out.println("Enter team name");
		String teamh=(op.readLine());
		
		sql = " UPDATE CARROM " +
               "SET score = sc2 WHERE (teamh.equals(team1) or teamh.equals(team2)) and r9.equals(round) ";
  stmt.executeUpdate(sql);
		break;				
		}	
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