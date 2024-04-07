package jdbc_driver_load;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection 
{
	private static Connection con;
	public static Connection getconnection()
	{
		try {
			if(con==null)
			{
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
				System.out.println("connection established....");
			}
			else
			{
				System.out.println("already connected with database...");
			}
			
		} catch (Exception e) {
			System.out.println(e);		
			
		}
		return con;
	}
	
	}


