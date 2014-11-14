package oop;
import java.io.*;
import java.sql.*;
public class Spree 
{
		//Database management
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://localhost/spree";
		static int exit=1;
		static BufferedReader op=new BufferedReader(new InputStreamReader(System.in));
		//  Database credentials
		static final String USER = "root";
		static final String PASS = "administrator";
		
		static Sport cricket,football,tt,basketball,badminton,tennis,volley,chess,carrom;
		static bank SBI;
		static convener Convener2015;
		public Spree()
		{
			//sports(football,cricket,table tennis,basketball,badminton,tennis,volleyball,chess and carrom).
			cricket=new Sport("Cricket",11,16,16,7,50);
			football=new Sport("Football",11,16,16,3,25);
			tt=new Sport("TT",1,32,32,2,40);
			basketball=new Sport("Basketball",7,16,16,4,20);
			badminton=new Sport("Badminton",1,32,32,3,25);
			tennis=new Sport("Tennis",1,32,32,5,50);
			volley=new Sport("Volleyball",6,16,16,3,15);
			chess=new Sport("Chess",1,32,32,1,10);
			carrom=new Sport("Carrom",2,32,32,1,20);
			Convener2015=new convener("Rohit Kumar");
			
			SBI=new bank(1000000);
			
		}
		public static void main(String[] args)throws IOException
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
      /*
				sql = "DROP TABLE PARTICIPANT ";
				stmt.executeUpdate(sql);
			    //System.out.println("Table  deleted in given database...");
				sql = "DROP TABLE NIGHTS ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE ACCO ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE ADMIN ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE SPOREG ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE ADMIN ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE CRICKET ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE FOOTBALL ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE TT ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE BASKETBALL ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE BADMINTON ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE TENNIS ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE VOLLEY ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE CHESS ";
				stmt.executeUpdate(sql);
				sql = "DROP TABLE CARROM ";
				stmt.executeUpdate(sql);
			    */
				sql = "CREATE TABLE PARTICIPANT " +
		                   "(id INTEGER NOT NULL, " +
		                   " name VARCHAR(255), " +
		                   " email VARCHAR(255), "+
		                   " mobile VARCHAR(255), "+
		                   " username VARCHAR(255), "+
		                   " password VARCHAR(255), "+
		                   " acco VARCHAR(255), "+
		                   " participations VARCHAR(255), "+
		                   " achievements VARCHAR(255), "+
		                   " PRIMARY KEY ( id ))";
				stmt.executeUpdate(sql);
				System.out.println("Participant Table created successfully...");
				
				sql = "CREATE TABLE NIGHTS " +
		                   "(id INTEGER NOT NULL, " +
		                   " passID INTEGER NOT NULL, "+
		                   " status VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Spree Nights Table created successfully...");		
				sql = "CREATE TABLE ACCO " +
		                   "(id INTEGER NOT NULL, " +
		                   " location VARCHAR(255), "+
		                   " status VARCHAR(255),"+
		                   " inloc VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Admin Table created successfully...");
				sql = "CREATE TABLE ADMIN " +
		                   "(name VARCHAR(255), " +
		                   " username VARCHAR(255), "+
		                   " pass VARCHAR(255),"+
		                   " role VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Accomodation Table created successfully...");
				
				sql = "CREATE TABLE SPOREG " +
		                   "(sid INTEGER NOT NULL, " +
		                   " total INTEGER NOT NULL, "+
		                   " avail INTEGER NOT NULL)";
				stmt.executeUpdate(sql);
				System.out.println("Sports Registration created successfully...");
				
				sql = "CREATE TABLE CRICKET " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Cricket table created successfully...");
				sql = "CREATE TABLE FOOTBALL " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Football table created successfully...");
				sql = "CREATE TABLE TT " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("TT table created successfully...");
				sql = "CREATE TABLE BASKETBALL " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Basketball table created successfully...");
				sql = "CREATE TABLE BADMINTON " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Badminton table created successfully...");
				sql = "CREATE TABLE TENNIS" +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Tennis table created successfully...");
				sql = "CREATE TABLE VOLLEY" +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Volleyball table created successfully...");
				sql = "CREATE TABLE CHESS" +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Chess table created successfully...");
				sql = "CREATE TABLE CARROM " +
		                   "(part INTEGER NOT NULL, " +
		                   " round INTEGER NOT NULL, "+
		                   " fixture VARCHAR(255), "+
		                   " scores VARCHAR(255))";
				stmt.executeUpdate(sql);
				System.out.println("Carrom table created successfully...");				
			}
			catch(SQLException se)
			{
				//Handle errors for JDBC
				se.printStackTrace();
			}
			catch(Exception e)
			{
				//Handle errors for Class.forName
				e.printStackTrace();
			}
			finally{
				//finally block used to close resources
				try{
					if(stmt!=null)
						stmt.close();
				}
				catch(SQLException se2)
				{
					se2.printStackTrace();
				}// nothing we can do
				try{
					if(conn!=null)
						conn.close();
				}
				catch(SQLException se){
					se.printStackTrace();
				}//end finally try
			}//end try
			showMenu();
		}//end main


		public static void showMenu()throws IOException
		{
			int userType;
			
			while(exit!=0)
			{
				System.out.println("SPREE HOME");
				System.out.println("SELECT YOUR USERTYPE:");
				System.out.println("1:New User");
				System.out.println("2:Registered User");
				System.out.println("3:Event Manager");
				System.out.println("4:Convener");
				System.out.println("0:EXIT");
				userType=Integer.parseInt(op.readLine());
				switch(userType)
				{
			
				case 1:System.out.println("Welcome New User");
					   newUser();break;
				case 2:System.out.println("Registered User");
					   regUser();break;
				case 3:System.out.println("Event Manager");
						em();break;
				case 4:	System.out.println("Convener");
						conv();break;
				case 0:exit=0;
						break;
				default:System.out.println("INVALID CHOICE");
				}	   
					   
			}
		}
		private static void newUser()throws IOException
		{
			nonParticipant np=new nonParticipant();
			nonSportEvent nights=new nonSportEvent("Special Nights","8 PM");
			int choice;
			System.out.println("Enter your choice:");
			System.out.println("1:Register for Spree");
			System.out.println("2:Register for Spree Nights");
			System.out.println("3:See Fixtures");
			System.out.println("4:See scores");
			System.out.println("5:See standings");
			System.out.println("6:Informal Event schedule");
			choice=Integer.parseInt(op.readLine());
			switch(choice)
			{
				case 1:np.register();
						break;
				case 2:np.regForNonSport(nights);
						break;
				case 3:np.getSchedule(cricket);
						break;
				case 4:np.getScore(cricket);
						break;
				case 5:np.getStandings(cricket);
						break;
				case 6:np.getNonSportSchedule(nights);
						break;
				default:System.out.println("INVALID");
			}
					
		}
		private static void regUser() throws NumberFormatException, IOException
		{
			int choice;
			String user,pass;
			participant lp=new participant();
			nonSportEvent nights=new nonSportEvent("Special Nights","8 PM");
			System.out.println("Enter your choice:");
			System.out.println("1:Login");
			System.out.println("2:Register for Spree Nights");
			System.out.println("3:See Fixtures");
			System.out.println("4:See scores");
			System.out.println("5:See standings");
			System.out.println("6:Informal Event schedule");
			System.out.println("7:Register for Sport");
			System.out.println("8:Cancel Registration");
			choice=Integer.parseInt(op.readLine());
			switch(choice)
			{
			case 1:System.out.print("Username:");
				user=op.readLine();
				System.out.print("\nPassword:");
				pass=op.readLine();
				lp=participant.login(user, pass);
				break;
			case 2:lp.regForNonSport(nights);
					break;
			case 3:lp.getSchedule(cricket);
					break;
			case 4:lp.getScore(cricket);
					break;
			case 5:lp.getStandings(cricket);
					break;
			case 6:lp.getNonSportSchedule(nights);
					break;
			case 7:lp.regForSport(cricket);
						SBI.payment();
					break;
			case 8:lp.cancelReg(cricket);
					break;
			default:System.out.println("INVALID");
			}

		}
		private static void em() throws IOException
		{
			String user,pass;
			int choice;
			boolean val;
			System.out.println("PLEASE LOGIN");
			System.out.println("Username:");
			user=op.readLine();
			System.out.println("Password");
			pass=op.readLine();
			val=eventManager.adminLogin(user,pass);
			if(val)
			{
				System.out.println("Enter your choice:");
				System.out.println("1:Schedule Update");
				System.out.println("2:Score Update");
				System.out.println("3:Standings Update");
				System.out.println("4:Issue Equipment from Inventory");
				System.out.println("4:Return Equipment to Inventory");
				choice=Integer.parseInt(op.readLine());
				switch(choice)
				{
					case 1:cricket.EM.scheduleUpdate(cricket);
							break;
					case 2:cricket.EM.scoreUpdate(cricket);
							break;
					case 3:cricket.EM.standings(cricket);
							break;
					case 4:cricket.EM.getFromInventory(cricket);
							break;
					case 5:cricket.EM.returnToInventory(cricket);
							break;
					default:System.out.print("INVALID");
					
				}
			}
			
		}
		private static void conv() throws IOException
		{
			String user,pass,cancel,reimburse;
			participant p=new participant();
			int choice,ID=10;
			boolean val;
			System.out.println("PLEASE LOGIN");
			System.out.println("Username:");
			user=op.readLine();
			System.out.println("Password");
			pass=op.readLine();
			val=eventManager.adminLogin(user,pass);
			if(val)
			{
				System.out.println("Enter your choice:");
				System.out.println("1.Approve Cancellation");
				System.out.println("2.Add To Inventory");
				System.out.println("3.Process Reimbursement");
				choice=Integer.parseInt(op.readLine());
				switch(choice)
				{
					case 1:cancel=convener.approveCancel(p);
							System.out.println(cancel);
							break;
					case 2:convener.addToInventory(cricket,10);
							break;
					case 3:reimburse=convener.processReimbursement(ID);
							System.out.println(reimburse);
							break;
					default:System.out.println("INVALID");
				}
		}
		
		}
}