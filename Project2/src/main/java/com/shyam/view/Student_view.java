package com.shyam.view;
import com.shyam.controller.Student_controller;
import java.util.*;
import com.shyam.dto.Student;
public class Student_view 
{
	static Scanner sc=new Scanner(System.in);
	public static Student CreateStudentObject()
	{
		System.out.println("enter the id-");
		int id=sc.nextInt();
		System.out.println("enter the name-");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("enter email_id-");
		String email=sc.nextLine();
		
		System.out.println("enter the password-");
		String password=sc.nextLine();
		System.out.println("enter the gender-");
		String gender=sc.nextLine();
		
		Student s1=new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setEmail(email);
		s1.setPassword(password);
		s1.setGender(gender);
		return s1;
		
	}
	
	public static void main(String[] args) 
	{
		Student_controller c=new Student_controller();
		while(true)
		{
			System.out.println("1. save student-");
			System.out.println("2. find student-");
			System.out.println("3. update student-");
			System.out.println("4. delete student-");
			System.out.println("5. exit");
			System.out.println("enter the choice-");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				Student s=CreateStudentObject();
				boolean b=c.saveStudent(s);
				if(b)
					System.out.println("student inserted successfully");
				else
					System.out.println("student not inserted");
				break;
				
			case 2:
				System.out.println("enter the id-");
				int id=sc.nextInt();
				Student Student=c.findStudentById(id);
				
				if(Student!=null)
					System.out.println(Student);
				else
					System.out.println("student is not present in the database");
				break;
			
           case 3:
        	   System.out.println("enter the id-");
        	   int id1=sc.nextInt();
        	   System.out.println("enter the password-");
        	   sc.nextLine();
        	   String newPassword=sc.nextLine();
        	   System.out.println("enter the gender-");
        	   String newGender=sc.nextLine();
        	   boolean result=c.UpdateStudentById(id1, newPassword, newGender);
        	   if(result)
        		   System.out.println("password updated");
        	   else
        		   System.out.println("student is not present in the database");
				break;
           case 4:
        	   System.out.println("enter the id to delete-");
        	   int id2=sc.nextInt();
        	   boolean res=c.DeleteById(id2);
        	   if(res)
        		   System.out.println("deleted successfully");
        	   else
        		   System.out.println("student is not present in the database");
				break;
           case 5:
        	   System.out.println("thank you");
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
		
	}
}
