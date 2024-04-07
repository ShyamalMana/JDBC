package com.shyam.controller;
import java.util.*;
import com.shyam.dto.Student;
public class Student_controller 
{
	private  ArrayList<Student> a=new ArrayList<Student>();// database
	

	public boolean saveStudent(Student s)
	{
		boolean b=a.add(s);
		return b;
	}
	public Student findStudentById(int n)
	{
		for ( Student s : a) 
		{
			if(s.getId() ==n)
			{
				
				return s;	
			}

		}
		
		return null;
	}
	public boolean UpdateStudentById(int id, String newPassword,String newGender)
	{
		Student s=findStudentById(id);
		if(s!=null)
		{
			
			s.setPassword(newPassword);
			s.setGender(newGender);
			
			return true;
		}
		return false;
	}
	public boolean DeleteById(int id)
	{
		Student s=findStudentById(id);
		if(s!=null)
		{
			a.remove(s);
			
			return true;
		}
		return false;
	}
	public void findAll()
	{
		for(Student s : a)
		{
			
			System.out.println(s);
		}
	}
}
