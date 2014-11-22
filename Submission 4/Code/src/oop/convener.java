
package oop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class convener extends eventManager
{
	String convName;
	static int ind;
	public static participant queue[]=new participant[100];
	public convener(String name)
	{
		this.convName=name;
		ind=0;
	}
	public static String approveCancel(participant p)throws IOException
	{
		//get cancel queue
		return "";
	}
	
	public static void addToInventory(Sport s,int val)throws IOException
	{
		s.inv.updateStock(val);
	}
	public static String processReimbursement(int ID)throws IOException, SQLException
	{Connection conn = null;
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
	stmt = conn.createStatement();}catch(Exception e){
			}
	sql =" SELECT id FROM PARTICIPANT";
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()){
        //Retrieve by column name
        int id  = rs.getInt("id");
        if(id==ID){
        	
        
		//Check if ID registered
		return "Approved";}
        }
	return "request denied";
	}
}
