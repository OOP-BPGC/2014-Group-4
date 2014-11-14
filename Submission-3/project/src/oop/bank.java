package oop;
import java.io.*;
public class bank
{
	private int spreeBalance;
	public bank(int bal)
	{
		this.spreeBalance=bal;
	}
	public String reimbursement(int amt)throws IOException
	{
		this.spreeBalance-=amt;
		return "Returned";
	}
	public int getBalance()
	{
		return spreeBalance;
	}
	public String payment()throws IOException
	{
		//Add to balance
		this.spreeBalance+=1000;
		return "Paid";
	}
}
