package java_assignments;

import java.util.Scanner;

//Write a Program on If else if Block
public class Assig07_IfElseIf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of b1:");
		byte b1=sc.nextByte();
		System.out.println("Enter the value of b2:");
		short b2=sc.nextShort();
		System.out.println("Enter the value of b3:");
		int b3=sc.nextInt();
		if(b1>b2)
		{
			System.out.println("b1 is greater than b2 and b3");
		}
		else if(b2>b3)
		{
			System.out.println("b2 is greater than b1 and b3");
		}
		else
		{
			System.out.println("b3 is greater than b1 and b2");
		}
		sc.close();
	}
}
