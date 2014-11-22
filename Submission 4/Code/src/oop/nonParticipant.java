package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class nonParticipant implements proceedings
{Connection conn = null;
Statement stmt = null;
String sql;
	
 
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/spree";
	static final String USER = "root";
	static final String PASS = "administrator";
	static BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
	Spree spr;
	public nonParticipant()
	{
		String name="";
		String passID="";
	}
			   
	
	public String getSchedule(Sport s) throws NumberFormatException, IOException{
	
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
		
		   break;
	case 2:System.out.println("The Score for football");
		   break;
	case 3:System.out.println("The Score for BasketBall");
			break;
	case 4:	System.out.println("The Score for Volleyball");
			break;
	case 5:	System.out.println("The Score for Tabletennis");
			break;
	case 6:	System.out.println("The Score for Chess");
		break;
	case 7:	System.out.println("The Score for Carrom");
		break;
	case 8:	System.out.println("The Score for Badminton");
		break;
	case 9:	System.out.println("The Score for Tennis");
		break;
		default:System.out.println("INVALID CHOICE");
		
		}	   
		return "Done";
	}

		
		
	

	public String getStandings(Sport s) throws NumberFormatException, IOException {
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
		switch(choice)
		{
	
		case 1:System.out.println("The Score for Cricket ");
		
		   break;
	case 2:System.out.println("The Score for football");
		   break;
	case 3:System.out.println("The Score for BasketBall");
			break;
	case 4:	System.out.println("The Score for Volleyball");
			break;
	case 5:	System.out.println("The Score for Tabletennis");
			break;
	case 6:	System.out.println("The Score for Chess");
		break;
	case 7:	System.out.println("The Score for Carrom");
		break;
	case 8:	System.out.println("The Score for Badminton");
		break;
	case 9:	System.out.println("The Score for Tennis");
		break;
		default:System.out.println("INVALID CHOICE");
		
		}	   
		return "Done";
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
	
	










