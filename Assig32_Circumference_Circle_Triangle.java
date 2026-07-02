package java_assignments;

import java.util.Scanner;

//WAP to Calculate the Circumference of a Circle and triange using scanner class
public class Assig32_Circumference_Circle_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius=sc.nextDouble();
		double cirofCircle=2*Math.PI*radius;
		System.out.println("Circumference of Circle is: "+cirofCircle);
		System.out.print("Enter the value of a: ");
		double a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		double b=sc.nextInt();
		System.out.print("Enter the value of c: ");
		double c=sc.nextInt();
		double cirofTriangle=a+b+c;
		System.out.println("Circumference of Triangle is: "+cirofTriangle);
		sc.close();
	}
}
