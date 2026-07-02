package java_assignments;

//WAP to demonstrate the use of super() to call a parent class constructor.
class Employee
{
	Employee(int empId,String name)
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee name: "+name);
	}
}
public class Assig49_SuperCalling extends Employee
{
	Assig49_SuperCalling(String dept,double salary)
	{
		super(123,"Ram");
		System.out.println("Employee dept: "+dept);
		System.out.println("Employee salary: "+salary);
	}
	public static void main(String[] args)
	{
		new Assig49_SuperCalling("Testing",54450.50);
	}
}

/*package java_assignments;

import java.util.Scanner;

//WAP to demonstrate the use of super() to call a parent class constructor.
class Employee
{
	int employeeID;
	String name;
	String dept;
	double salary;
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		System.out.println("Enter the employee ID");
		employeeID=sc.nextInt();
		System.out.println("Enter the employee name");
		name=sc.next();
		System.out.println(employeeID);
		System.out.println(name);
	}
}
public class Assig49_SuperCalling extends Employee
{
	Assig49_SuperCalling()
	{
		super();
		System.out.println("Enter the employee department");
		dept=sc.next();
		System.out.println("Enter the employee salary");
		salary=sc.nextDouble();
		System.out.println(dept);
		System.out.println(salary);
	}
	public static void main(String[] args)
	{
		new Assig49_SuperCalling();
	}
}
*/