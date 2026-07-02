package java_assignments;

import java.util.Scanner;

//WAP to call 2 non static methods inside the main method by creating a single object
public class Assig21_CallNonStaticMet_InMain 
{
	 int a;
	 int b;
	public static void main(String[] args) 
	{
		Assig21_CallNonStaticMet_InMain ab=new Assig21_CallNonStaticMet_InMain();
		ab.input();
		ab.calculate();
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		sc.close();
	}
	void calculate()
	{
		int sum=a+b;
		System.out.println("Sum of 2 numbers:"+sum);
	}
}
