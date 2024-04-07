package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class prepared_statement1 // USER TAKING INPUT PROCESS
{
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeedb","postgres","root");
		
//		PreparedStatement	ptmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");//  ?-this is a placeholder/delimeter--use to take dynamic input
//		ptmt.setInt(1, 101);
//		ptmt.setString(2, "rio");
//		ptmt.setString(3, "rio33@gmail.com");
//		ptmt.setString(4, "male");
//		ptmt.setInt(5, 5000);
		
		// insert data 2-----
//		ptmt.setInt(1, 103);
//		ptmt.setString(2, "spra");
//	    ptmt.setString(3, "rsp3433@gmail.com");
//		ptmt.setString(4, "female");
//		ptmt.setInt(5, 4000);
		//	int t=ptmt.executeUpdate();
			//System.out.println(t+"row affected..");
		
		// update data--
//			PreparedStatement pt=con.prepareStatement("update employee set sal=? where id=?");
//			pt.setInt(1, 8000);
//			pt.setInt(2,101);
//			
//		int n=pt.executeUpdate();
//		System.out.println(n+"-no of row affected");
//		
		
			
			// delete the data
//			PreparedStatement pt=con.prepareStatement("delete from employee where id=?");
//			pt.setInt(1, 102);
//			int n=pt.executeUpdate();
//			System.out.println(n+"- row affected& deleteted...");
			
			PreparedStatement pt=con.prepareStatement("select * from employee where id=?");
			pt.setInt(1, 101);
			ResultSet rs=pt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
		
			con.close();
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
