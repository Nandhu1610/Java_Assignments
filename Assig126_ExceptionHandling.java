package java1_assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//WAP on InputMismatchException using try and catch block
public class Assig126_ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int s1=sc.nextInt();
		System.out.println(s1);
		sc.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Handled the Exception");
		}
	}
}
