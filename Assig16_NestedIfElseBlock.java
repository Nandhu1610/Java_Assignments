package java_assignments;

import java.util.Scanner;

//WAP which there is if else if block present and 
//a) if block is present with 2 if blocks in it 
//b) else if block is present with another if else if block present in it 
//c) Last, else block is present with just if and else block in it
public class Assig16_NestedIfElseBlock 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks=sc.nextInt();
		if(marks>=90)
		{
			if(marks==100)
			{
				System.out.println("Perfect Score!");
			}
			if(marks<100)
			{
				System.out.println("Excellent!");
			}
		}
		else if(marks>=75 && marks<90)
		{
			if(marks>=85)
			{
				System.out.println("Very Good!");
			}
			else if(marks>=80)
			{
				System.out.println("Good");
			}
			else
			{
				System.out.println("Average");
			}
		}
		else
		{
			if(marks>=50)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		if(marks>100)
		{
			System.out.println("Invalid marks");
		}
		sc.close();
	}
}
