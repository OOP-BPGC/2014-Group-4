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
		return "Returned";
	}
	public int getBalance()
	{
		return spreeBalance;
	}
}
