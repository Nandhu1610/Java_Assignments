package java_assignments;

import java.util.Scanner;

//WAP to create a loop to print your name 5 times.
public class Assig34_ForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.next();
		for(int i=0;i<5;i++) 
		{
			System.out.println(name);
		}
		sc.close();
	}
}
