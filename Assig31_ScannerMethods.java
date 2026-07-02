package java_assignments;

import java.util.Scanner;

//WAP to Demonstrate Methods of the Scanner Class
public class Assig31_ScannerMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roll no: ");
		int rollno=sc.nextInt();
		System.out.println(rollno);
		System.out.print("Enter the age: ");
		byte age=sc.nextByte();
		System.out.println(age);
		System.out.print("Enter the mobile no: ");
		long mblno=sc.nextLong();
		System.out.println(mblno);
		System.out.print("Enter the sno: ");
		short sno=sc.nextShort();
		System.out.println(sno);
		System.out.print("Enter the student name: ");
		String sname=sc.next();
		System.out.println(sname);
		/*System.out.println("Enter the student full name: ");
		String fname=sc.nextLine();
		System.out.println(fname);*/
		System.out.print("Enter the marks: ");
		float marks=sc.nextFloat();
		System.out.println(marks);
		System.out.print("Enter the percentage: ");
		double percentage=sc.nextDouble();
		System.out.println(percentage);
		System.out.print("Enter the pass/fail result: ");
		boolean result=sc.nextBoolean();
		System.out.println(result);
		sc.close();
	}
}
