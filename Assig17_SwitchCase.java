package java_assignments;

import java.util.Scanner;

//"WAP on switch case
//a) try switch case problem with int
//b) try switch case problem with String
//c) try switch case problem with char"
public class Assig17_SwitchCase 
{
	//static int a=10; 
	//static int b=20;
	//Switch case with int
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int sum=a+b;
			System.out.println("Addition of 2 numbers:-->"+sum);
			break;
		case 2:
			int sub=a-b;
			System.out.println("Subtraction of 2 numbers:-->"+sub);
			break;
		case 3:
			int mul=a*b;
			System.out.println("Multiplication of 2 numbers:-->"+mul);
			break;
		default:
			System.out.println("Invalid choice!");
		}
		
		//Switch case with char
		System.out.println("Enter the grade character:");
		String ch=sc.next();
		switch(ch)
		{
		case "A":
			System.out.println("Excellent");
		    break;
		case "B":
			System.out.println("Very Good");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("Pass");
			break;
		case "F":
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
		}
		
		//Switch case with String
		System.out.println("Enter day of the week");
		String day=sc.next();
		switch (day) 
		{
		case "Monday": 
		case "Tuesday": 
		case "Wednesday": 
		case "Thursday": 
		case "Friday":
			System.out.println("Weekdays");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid data");	
		}
		sc.close();
	}
	
	
}
