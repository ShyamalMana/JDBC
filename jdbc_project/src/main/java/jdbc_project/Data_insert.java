package jdbc_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Data_insert {
	public static void main(String[] args) {
		try {

			// insert data-----
//			Connection con=Dbconnection.getconnection();
//   		    String q="insert into crud values(101,'arnab','arnab@gmail.com',5000),(102,'aditya','adi@gmail.com',6000),(103,'goutam','goutam@gmail.com',4000),(104,'ram','ram@gmail.com',7000)";
//			
//			Statement stmt=con.createStatement();
//			boolean b=stmt.execute(q);
//			System.out.println("data inserted successfully..");

			// update data--

//			Connection con=Dbconnection.getconnection();
//			
//			Statement stmt=con.createStatement();
//		    String q="update crud set sal=8000 where id=103";
//		   boolean b=stmt.execute(q);
//		   System.out.println("updated...");

			// delete data form db
			Connection con = Dbconnection.getconnection();
			Statement stmt = con.createStatement();
			String q = "delete from crud where id=102";
			boolean b = stmt.execute(q);
			System.out.println("deleted ....");
 
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
