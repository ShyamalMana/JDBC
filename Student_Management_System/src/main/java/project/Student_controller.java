package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_controller 
{
	public void insert(Student st)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
		PreparedStatement	pstmt=con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1, st.getId());
			pstmt.setString(2, st.getName());
			pstmt.setString(3, st.getEmail());
			int n=pstmt.executeUpdate();
			System.out.println(n+"-row affected");
			con.close();
			
		} catch (Exception e) {
			
		}
	}
	public void update(int id,String newEmail)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
		PreparedStatement	pstmt=con.prepareStatement("update student set name=? where id=?");
			
			pstmt.setString(1, newEmail);
			pstmt.setInt(2, id);
			int n=pstmt.executeUpdate();
			System.out.println(n+"-row affected");
			con.close();
			
		} catch (Exception e) {
			
		}	
	}
	public void delete(int id)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
		PreparedStatement	pstmt=con.prepareStatement("delete from student where id=?");
			pstmt.setInt(2, id);
			int n=pstmt.executeUpdate();
			System.out.println(n+"-row affected");
			con.close();
			
		} catch (Exception e) {
			
		}	
	}
	public void read(int id)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
		PreparedStatement	pstmt=con.prepareStatement("select * from student where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" ,"+rs.getString(2)+" ,"+rs.getString(3));
			}
			else
			{
				System.out.println("record not found");
			}
			con.close();
			
		} catch (Exception e) {
			
		}	
	}
	public void fetchAll()
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","postgres","root");
		PreparedStatement	pstmt=con.prepareStatement("select * from student");
			ResultSet rs=pstmt.executeQuery();
		 while(rs.next())
			{
				System.out.println(rs.getInt(1)+" ,"+rs.getString(2)+" ,"+rs.getString(3));
			}
			con.close();
			
		} catch (Exception e) {
			
		}
	}
}
