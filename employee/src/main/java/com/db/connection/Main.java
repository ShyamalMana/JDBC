package com.db.connection;

import java.sql.Connection;

public class Main 
{
	public static void main(String[] args) 
	{
		Dbconnect d= new Dbconnect();
		try {
		Connection	con=Dbconnect.getconnection();
		d.createtable("darru", con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
