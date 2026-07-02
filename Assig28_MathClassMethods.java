package java_assignments;

import java.util.Scanner;

//WAP using the Math class to display its methods.
public class Assig28_MathClassMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Addition:"+Math.addExact(a, b));
		System.out.println("Subtraction:"+Math.subtractExact(a, b));
		System.out.println("Multiplication:"+Math.multiplyExact(a, b));
		System.out.println("Minimum:"+Math.min(a, b));
		System.out.println("Maximum:"+Math.max(a, b));
		System.out.println("Square Root:"+Math.sqrt(a));
		System.out.println("Absolute:"+Math.abs(a));
		sc.close();
	}
}
