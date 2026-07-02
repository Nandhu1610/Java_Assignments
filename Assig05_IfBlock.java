package java_assignments;

import java.util.Scanner;

//Write a Program on IF Block
public class Assig05_IfBlock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:-->");
		int s=sc.nextInt();
		if(s==10) 
		{
			System.out.println("Condition true");
		}
		sc.close();
	}
}
