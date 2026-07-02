package java_assignments;

import java.util.Scanner;

//WAP on nested if else block with if block and else block 
//in which there are 3 if blocks present under else block                                               
public class Assig15_NestedIfElseBlock 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			if(n>0)
			{
				System.out.println("Number is Positive");
			}
			if(n<0)
			{
				System.out.println("Number is Negative");
			}
			if(n%2==0)
			{
				System.out.println("Number is even");
			}
		}
		sc.close();
	}
}
