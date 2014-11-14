
package oop;
import java.io.*;
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
	public static String processReimbursement(int ID)throws IOException
	{
		//Check if ID registered
		return "Approved";
	}
}
