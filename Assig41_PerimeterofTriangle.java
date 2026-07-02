package java_assignments;

import java.util.Scanner;
//WAP to Calculate the perimeter of triange using scanner class
public class Assig41_PerimeterofTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a=sc.nextDouble();
		System.out.print("Enter the value of b: ");
		double b=sc.nextDouble();
		System.out.print("Enter the value of c: ");
		double c=sc.nextDouble();
		double perimeter=a+b+c;
		System.out.println("Perimeter of a triangle is: "+perimeter);
		sc.close();
	}
}
