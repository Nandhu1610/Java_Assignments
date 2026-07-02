package java1_assignments;

import java.util.Scanner;

//WAP on assert keyword also show how to enable the arguments
public class Assig129_AssertKeyword 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.print("Enter the value of a: ");
		int b=sc.nextInt();
		assert a>b:"Condition is False";
		System.out.println("Condition is True");
		sc.close();
	}
}
