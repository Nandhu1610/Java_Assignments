package java_assignments;

import java.util.Scanner;

//WAP to Demonstrate For Loop Using Scanner Class
public class Assig37_ForLoop3 
{
	//static int sum=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of n numbers is: "+sum);
		sc.close();
	}
}
