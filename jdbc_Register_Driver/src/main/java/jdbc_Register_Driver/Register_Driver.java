package jdbc_Register_Driver;

import java.sql.DriverManager;

import org.postgresql.Driver;

public class Register_Driver 
{
	public static void main(String[] args) {
		Driver d= new Driver();
		
		try {
			DriverManager.registerDriver(d);
			System.out.println("driver register successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
