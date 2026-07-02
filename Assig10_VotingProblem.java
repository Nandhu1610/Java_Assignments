package java_assignments;

import java.util.Scanner;

//WAP to check person can vote only if he/she is 18 or above and should not vote if age is less.
public class Assig10_VotingProblem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age of a person:==>");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Person can vote");
		}
		else
		{
			System.out.println("Person cannot vote");
		}
		sc.close();
	}
}
