package project;

import java.util.Scanner;

public class Student_view 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Student_controller sct=new Student_controller();
		while(true)
		{
			System.out.println("enter your choice-");
			System.out.println("1-insert ");
			System.out.println("2-update");
			System.out.println("3-delete");
			System.out.println("4-read data-");
			System.out.println("5-show all data-");
			System.out.println("6-exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				Student s=createStudentObject();
				sct.insert(s);
				break;
            case 2:
				System.out.println("enter the id-");
				int id=sc.nextInt();
				System.out.println("enter the new email-");
				sc.nextLine();
				String newEmail=sc.nextLine();
				sct.update(id, newEmail);
				break;
            case 3:
            	System.out.println("enter the id-");
            	sct.delete(sc.nextInt());
            	break;
            case 4:
            	System.out.println("enter the id-");
            	sct.read(sc.nextInt());
            	break;
            case 5:
            	sct.fetchAll();
            	break;
            case 6:
            	System.out.println("thank you");
            	return;

			default:
				break;
			}
		}
	}
	private static Student createStudentObject() {
		Student s= new Student();
		System.out.println("enter the id-");
		s.setId(sc.nextInt());
		System.out.println("enter the name-");
		sc.nextLine();
		s.setName(sc.nextLine());
		System.out.println("enter the email-");
		s.setEmail(sc.nextLine());
		
		return s;
	}
}
