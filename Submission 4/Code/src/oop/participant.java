package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class participant implements proceedings
{static BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
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
			System.out.println("Select Sport");
			
			System.out.println("1:Cricket");
			System.out.println("2:Football");
			System.out.println("3:Basketball");
			System.out.println("4:Volleyball");
			System.out.println("5.Tabletennis");
			System.out.println("6.Chess");
			System.out.println("7.Carrom");
			System.out.println("8.Badminton");
			System.out.println("9.Tennis");
			int choice=Integer.parseInt(op.readLine());
			
			
			sql =  "UPDATE Participant" +
	                   "SET part=s.tableID";
			
			stmt.executeUpdate(sql);
		sql=" UPDATE PART "+
			"SET cricket=this.id";
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
	public String getSchedule(Sport s) throws NumberFormatException, IOException{
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
			}catch(Exception e){e.printStackTrace();}
		
			System.out.println("Select Sport");
			
			System.out.println("1:Cricket");
			System.out.println("2:Football");
			System.out.println("3:Basketball");
			System.out.println("4:Volleyball");
			System.out.println("5.Tabletennis");
			int choice=Integer.parseInt(op.readLine());
			switch(choice)
			{
		
			case 1:System.out.println("The Schedule for Cricket ");
				   break;
			case 2:System.out.println("The Schedule for football");
				   break;
			case 3:System.out.println("The Schedule for BasketBall");
					break;
			case 4:	System.out.println("The Schedule for Volleyball");
					break;
			case 5:	System.out.println("The Schedule for Tabletennis");
					break;
			default:System.out.println("INVALID CHOICE");
			
			}
			return "Done";	   

	}


	public String getScore(Sport s) throws NumberFormatException, IOException, SQLException {
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
			}catch(Exception e){e.printStackTrace();}
		
		System.out.println("Select Sport");
		
		System.out.println("1:Cricket");
		System.out.println("2:Football");
		System.out.println("3:Basketball");
		System.out.println("4:Volleyball");
		System.out.println("5.Tabletennis");
		System.out.println("6.Chess");
		System.out.println("7.Carrom");
		System.out.println("8.Badminton");
		System.out.println("9.Tennis");
		int choice=Integer.parseInt(op.readLine());
		System.out.println("Enter the round");
		int r=Integer.parseInt(op.readLine());
		
		switch(choice)
		{
	
		case 1:System.out.println("The Score for Cricket ");
		 sql="SELECT team1,team2,round,score FROM CRICKET WHERE r>round";
		stmt.executeUpdate(sql);
			   break;
		case 2:System.out.println("The Score for football");
		String sql1="SELECT team1,team2,round,score FROM FOOTBALL WHERE r>round";
		stmt.executeUpdate(sql1);
			   break;
		case 3:System.out.println("The Score for BasketBall");
		String sql2="SELECT team1,team2,round,score FROM BASKETBALL WHERE r>round";
		stmt.executeUpdate(sql2);
				break;
		case 4:	System.out.println("The Score for Volleyball");
		String sql3="SELECT team1,team2,round,score FROM VOLLEYBALL WHERE r>round";
		stmt.executeUpdate(sql3);
				break;
		case 5:	System.out.println("The Score for Tabletennis");
		String sql4="SELECT team1,team2,round,score FROM TABLETENNIS WHERE r>round";
		stmt.executeUpdate(sql4);
				break;
		case 6:	System.out.println("The Score for Chess");
		String sql5="SELECT team1,team2,round,score FROM CHESS WHERE r>round";
		stmt.executeUpdate(sql5);
			break;
		case 7:	System.out.println("The Score for Carrom");
		String sql6="SELECT team1,team2,round,score FROM CARROM WHERE r>round";
		stmt.executeUpdate(sql6);
			break;
		case 8:	System.out.println("The Score for Badminton");
		String sql7="SELECT team1,team2,round,score FROM BADMINTON WHERE r>round";
		stmt.executeUpdate(sql7);
			break;
		case 9:	System.out.println("The Score for Tennis");
		String sql8="SELECT team1,team2,round,score FROM TENNIS WHERE r>round";
		stmt.executeUpdate(sql8);
			break;
		default:System.out.println("INVALID CHOICE");
		
		}	   
		return "Done";
		
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