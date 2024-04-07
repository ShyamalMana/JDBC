package jdbc_driver_load;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Load_Driver 
{
////	public static void main(String[] args) {
////		try {
////			Class.forName("org.postgresql.Driver");
////			System.out.println("Driver class loaded");
////		} catch (ClassNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	}
//
	public static void main(String[] args) {
		try (Connection c=Dbconnection.getconnection();
				Statement stmt=c.createStatement();)
		{
			
//			String q="insert into student values(103,'arnab','shyam@gmail.com','shy1234','male'),(104,'aditya','shyam@gmail.com','shy1234','male'),(105,'goutam','shyam@gmail.com','shy1234','male'),(106,'shyam','shyam@gmail.com','shy1234','male')";
			String q2="update student set gender='others' where id=103";
//			System.out.println(stmt);
			boolean b2=stmt.execute(q2);
//			boolean b=stmt.execute(q);
			System.out.println(b2);
			System.out.println("insert data successfully");
			
//			c.close();
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
