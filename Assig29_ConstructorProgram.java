package java_assignments;

import java.util.Scanner;

//WAP to Demonstrate Constructor in Java
public class Assig29_ConstructorProgram 
{
	String name;
	int rollNo;
	Assig29_ConstructorProgram(String studentname,int rollno) 
	{
		name=studentname;
		rollNo=rollno;
		display();
	}
	void display()
	{
		System.out.println("Student Details:");
		System.out.println("Student Name: "+name);
		System.out.println("Student Rollno: "+rollNo);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student name: ");
		String name=sc.next();
		System.out.print("Enter the student rollno: ");
		int rollno=sc.nextInt();
		new Assig29_ConstructorProgram(name, rollno);
		sc.close();
	}
}
