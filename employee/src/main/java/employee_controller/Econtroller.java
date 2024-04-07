package employee_controller;
import java.util.*;

import employee.Employee;

public class Econtroller 
{
 private	ArrayList<Employee> a=new ArrayList<Employee>();
 public boolean save_employee(Employee s)
 {
	boolean b=a.add(s);
	return b;
 }
 
 public Employee find_employee(int n)
 {
	 for(Employee e: a)
	 {
		 if(e.getId()==n)
		 {
			 return e;
		 }
		 
	 }
	 return null;
 }
 
 public boolean update_employee(int n,String newName,String newShift,int newSal)
 {
	 Employee e=find_employee(n);
	 if(e!=null)
	 {
		 e.setName(newName);
		 e.setSal(newSal);
		 e.setShift(newShift);
		 return true;
	 }
	 return false;
 }
 
 public boolean delete_employee(int n)
 {
	 Employee e=find_employee(n);
	 if(e!=null)
	 {
		 a.remove(e);
		 return true;
	 }
	 return false;
 }
 public void find_employee_list(int n)
 {
	 for(Employee e: a)
	 {
		 System.out.println(e);
	 }
	 
 }
}
