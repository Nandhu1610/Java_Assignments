package java_assignments;

import java.util.Scanner;

//WAP to demonstrate multilevel inheritance.
class GParent
{
	String name;
	int age;
	void displayPerson()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
	}
}
class Parent1 extends GParent
{
	int rollNo;
	void displayStudent()
	{
		displayPerson();
		System.out.println("Student rollno: "+rollNo);
	}
}
public class Assig44_MultiLevelInheritance extends Parent1
{	
	String specialization;
	void displayGraduate()
	{
		displayStudent();
		System.out.println("Student Department: "+specialization);
	}
	public static void main(String[] args) 
	{
		Assig44_MultiLevelInheritance obj=new Assig44_MultiLevelInheritance();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		obj.name=sc.next();
		System.out.print("Enter the age of the student: ");
		obj.age=sc.nextInt();
		System.out.print("Enter the rollno of the student: ");
		obj.rollNo=sc.nextInt();
		System.out.print("Enter the department of the student: ");
		obj.specialization=sc.next();
		obj.displayGraduate();
		sc.close();
	}
}
