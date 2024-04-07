package employee_view;
import java.util.*;
import employee.Employee;
import employee_controller.Econtroller;
public class Eview 
{
	 static Scanner sc=new Scanner(System.in);
	public static Employee create_employee()
	{
		System.out.println("enter the id-");
		int id=sc.nextInt();
		System.out.println("enter the name-");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("enter the shift time-");
		String shift=sc.nextLine();
		
		System.out.println("enter the sal value-");
		int sal=sc.nextInt();
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setShift(shift);
		e1.setSal(sal);
		return e1;
	}
	
	public static void main(String[] args) {
		Econtroller E=new Econtroller();
		while(true)
		{
			System.out.println("1-save emolyee");
			System.out.println("2-find employee");
			System.out.println("3-update employee");
			System.out.println("4-delete employee");
			System.out.println("enter the choice-");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				Employee s=create_employee();
				boolean b=E.save_employee(s);
				if(b)
				System.out.println("employee inserted successfully");
				else
					System.out.println("employee not inerted");
				break;
			case 2:
				System.out.println("enter the id");
				int id=sc.nextInt();
				Employee x=E.find_employee(id);
				if(x!=null)
				System.out.println(x);
				else
					System.out.println("employee is not present in the database-");
				break;
			case 3:
					System.out.println("enter the id-");
					int id1=sc.nextInt();
					System.out.println("enter the name-");
					String name=sc.nextLine();
					System.out.println("enter the sal-");
					int sal=sc.nextInt();
					System.out.println("enter the shift-");
					String shift=sc.nextLine();
					boolean result=E.update_employee(id1, name, shift, sal);
					if(result)
					System.out.println("employee updated");
					else
						System.out.println("employee is not present in the database-");
				break;
				
			case 4:
				System.out.println("enter the id-");
				int id2=sc.nextInt();
				boolean t=E.delete_employee(id2);
				if(t)
					System.out.println("deletation successfull");
				else
					System.out.println("employee is not present in the database-");
				break;
			case 5:
				System.out.println("Thank you");
				return ;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}
