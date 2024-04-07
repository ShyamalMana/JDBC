package com.db.connection;


import java.sql.Connection;
import java.sql.Statement;

public class Insert_data 
{
	public static void main(String[] args) 
	{
		try(Connection con=Dbconnect.getconnection();
				Statement stmt=con.createStatement();)
		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the id -");
//			int id =sc.nextInt();
			
			
//			String q="insert into employee values(103,'shyam',15000,'day'),(104,'arnab',15500,'night')";
//			boolean b=stmt.execute(q);
//     		System.out.println("data inserted successfully...");
//			
//			
//			
			String q2="create table shyam(id int(100) primary key SERIAL,name varchar(200) not null,city varchar(400));";
			stmt.executeUpdate(q2);
			System.out.println("table created successfully...");
//			
//			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
