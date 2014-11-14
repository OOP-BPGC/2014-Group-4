package oop;
import java.io.*;
public class inventory 
{
	private int stock;
	public inventory(int in)
	{
		this.stock=in;
	}
	public void updateStock(int val)throws IOException
	{
		stock+=val;
	}
}
