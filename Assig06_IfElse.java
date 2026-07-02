package java_assignments;

import java.util.Scanner;

//Write a Program on If else Block
public class Assig06_IfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		float f=sc.nextFloat();
		if(f!=5)
		{
			System.out.println("Condition satisfied");
		}
		else
		{
			System.out.println("Condition not satisfied");
		}
		sc.close();
	}
}
