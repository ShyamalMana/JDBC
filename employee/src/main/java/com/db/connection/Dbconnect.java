package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbconnect 
{
	private static Connection con;
	public static  Connection getconnection()
	{
		try {
			if(con==null)
			{
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb", "postgres", "root");
			System.out.println("connection established....");
			}
			else
			{
				System.out.println("already connected..");
			}
		} catch (Exception e) {
			System.out.println(e);
		
		}
		
		
		return con;
		
	}
	public void createtable(String tname,Connection con)
	{
		Statement stmt;
		try 
		{
			String q="create table"+tname+"(sid SERIAL,name varchar(200),price integer(1000),primary key(sid));";
			stmt=con.createStatement();
			stmt.executeUpdate(q);
	 		System.out.println("table created successfully...");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}