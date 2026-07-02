package java_assignments;

import java.util.Scanner;

//WAP to Illustrate Switch Case Statement Using Scanner Class
public class Assig33_SwitchusingScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int input=sc.nextInt();
		switch (input)
		{
		case 1: 
			System.out.println("Check Balance");
			break;
		case 2: 
			System.out.println("Deposit");
			break;
		case 3: 
			System.out.println("Withdraw");
			break;
		case 4: 
			System.out.println("Exit");
			break;
		default:
			System.out.println("Enter valid input");
		}
		sc.close();
	}
}
