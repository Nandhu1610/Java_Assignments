package java1_assignments;

import java.util.Scanner;

//WAP on ArithmeticException and StringIndexOutOfBounds Exception
public class Assig128_ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value of a: ");
			int a=sc.nextInt();
			System.out.print("Enter the value of b: ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			sc.close();
			String s="Java";
			char ch=s.charAt(5);
			System.out.println(ch);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled the Arithmetic Exception");
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("Handled the StringIndexOutOfBounds Exception");
		}
	}
}
