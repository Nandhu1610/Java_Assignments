package java_assignments;

import java.util.Scanner;

//Write a Program on nested if Else Block_Case
public class Assig08_NestedIfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice number:");
		int choice = sc.nextInt();
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		if(choice==1)
		{
			if(a>b)
			{
				int sub=a-b;
				System.out.println(sub);
			}
			else
			{
				int sum=a+b;
				System.out.println(sum);
			}
		}
			else if(choice==2)
			{
				if(a!=0 && b!=0)
				{
					int mul=a*b;
					System.out.println(mul);
				}
				else
				{
					System.out.println("Multiplication not possible");
				}
			}
			else if(choice==3)
			{
				if(b!=0)
				{
					int div=a/b;
					System.out.println(div);
				}
				else
				{
					System.out.println("Division by zero not allowed");
				}
			}
		else
		{
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}
