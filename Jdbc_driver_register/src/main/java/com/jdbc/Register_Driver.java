package com.jdbc;
import org.postgresql.Driver;
import java.sql.DriverManager;

public class Register_Driver 
{
	public static void main(String[] args) {
		Driver d= new Driver();
		
		try{
			
			
			DriverManager.registerDriver(d);
			System.out.println("registered the driver");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	}

}
