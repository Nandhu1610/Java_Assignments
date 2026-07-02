package java_assignments;

import java.util.Scanner;

//WAP to demonstrate single-level inheritance.
class Parent
{
	String name;
	int age;
	void displayPerson()
	{
		System.out.println("Student name is: "+name);
		System.out.println("Student age is: "+age);
	}
}
public class Assig43_SLInheritance extends Parent
{
	int rollNo;
	void displayStudent()
	{
		displayPerson();
		System.out.println("Student rollNo is: "+rollNo);
	}
	public static void main(String[] args) 
	{
		Assig43_SLInheritance obj=new Assig43_SLInheritance();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		obj.name=sc.next();
		System.out.print("Enter the age of the student: ");
		obj.age=sc.nextInt();
		System.out.print("Enter the roll no of the student: ");
		obj.rollNo=sc.nextInt();
		obj.displayStudent();
		sc.close();
	}
}
