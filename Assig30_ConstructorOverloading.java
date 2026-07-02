package java_assignments;

import java.util.Scanner;

//WAP to Demonstrate Constructor Overloading in Java
public class Assig30_ConstructorOverloading 
{
	String name;
	int rollNo;
	String branch;
	Assig30_ConstructorOverloading() 
	{
		name="Unknown";
		rollNo=40;
		branch="Not assigned";
	}
	Assig30_ConstructorOverloading(String sname) 
	{
		name=sname;
		rollNo=10;
		branch="Not assigned";
	}
	Assig30_ConstructorOverloading(String sname,int rollno,String branch1) 
	{
		name=sname;
		rollNo=rollno;
		branch=branch1;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(branch);
	}
	public static void main(String[] args) 
	{
		Assig30_ConstructorOverloading obj1=new Assig30_ConstructorOverloading();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student name: ");
		String name=sc.next();
		System.out.print("Enter the student rollno: ");
		int rollno=sc.nextInt();System.out.print("Enter the student branch: ");
		String branch1=sc.next();
		Assig30_ConstructorOverloading obj2=new Assig30_ConstructorOverloading(name,rollno,branch1);
		Assig30_ConstructorOverloading obj3=new Assig30_ConstructorOverloading(name);
		obj1.display();
		obj2.display();
		obj3.display();
		sc.close();
	}
}
