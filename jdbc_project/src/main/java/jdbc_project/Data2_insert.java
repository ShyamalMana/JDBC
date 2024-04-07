package jdbc_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data2_insert 
{
	public static void main(String[] args) 
	{
	
		try {
			Connection con=Dbconnection.getconnection();
			Statement stmt=con.createStatement();
			//insert data
//			String q="insert into crud values(102,'scott','scott@gmail.com',5000),(105,'arjun','arj@gmail.com',7000 ),(106,'smith','sm@gmail.com',6000)";
//			int n=stmt.executeUpdate(q);
//			System.out.println("inserted..");
//			System.out.println(n+"-row affected");
//			
			//update data---
//			String q1="update crud set sal=15000 where id=104"  
//		    int n=stmt.executeUpdate(q);
//		    System.out.println("updated..");
//		    System.out.println(n+"-row affected");
//		    
		    //delete data---
//		    String q2="delete from crud where id=102";
//		    int no=stmt.executeUpdate(q2);
//		    System.out.println("deleted..");
//		    System.out.println(no+"-row affected");
			String q="select * from crud";
			 boolean b=stmt.execute(q);
			 if(b) 
			 {
			ResultSet rs=stmt.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));}
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
