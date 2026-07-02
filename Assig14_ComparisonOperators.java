package java_assignments;

import java.util.Scanner;

//WAP on comparison operators (>,<,>=,<=,==,!=)
public class Assig14_ComparisonOperators 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a:-->");
		byte a=sc.nextByte();
		System.out.print("Enter the value of b:-->");
		short b=sc.nextShort();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		if (a<b)
		{
			System.out.println("a is less than b");
		}
		if(a>=b)
		{
			System.out.println("a is greater than or equal to b");
		}
		if(a<=b)
		{
			System.out.println("a is less than or equal to b");
		}
		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		if(a!=b)
		{
			System.out.println("a is not equal to b");
		}
		sc.close();
	}
}
