package oop;
import java.io.*;

public class Sport 
{
	@SuppressWarnings("unused")
	private String tableID;
	@SuppressWarnings("unused")
	private int numOfPlayers,max,round;
	int equipments,slots;
	private boolean ongoing=true;
	eventManager EM;
	inventory inv;
	public Sport(String name,int num,int smax,int slot,int eq,int inv)
	{
		//Sport attributes
		this.tableID=name;
		this.numOfPlayers=num;
		this.slots=slot;
		this.round=1;
		this.max=smax;
		this.equipments=eq;
		this.EM=new eventManager(name);
		this.inv=new inventory(inv);	
	}
	
	public int checkSlots()throws IOException
	{
		//Sport slot attribute comparison
		if(this.slots==0)
			return 0;
		else
			return 1;
	}
	public void playSport()throws IOException
	{
		if(ongoing)
			System.out.println("Ongoing");
	}

}
