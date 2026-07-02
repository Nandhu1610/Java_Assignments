package java_assignments;

import java.util.Scanner;

//WAP on logical operators with AND, OR, NAND(AND-NOT) and NOR(Or-not)
public class Assig09_LogicalOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		boolean A = sc.nextBoolean();
		System.out.println("Enter B:");
		boolean B = sc.nextBoolean();
		if (A && B) 
		{
			System.out.println("AND condition true");
		}
		else
		{
			System.out.println("AND condition false");
		}
		if(A||B)
		{
			System.out.println("OR condition true");
		}
		else
		{
			System.out.println("OR condition false");
		}
		if (!(A && B)) 
		{
			System.out.println("NAND condition true");
		}
		else
		{
			System.out.println("NAND condition false");
		}
		if(!(A||B))
		{
			System.out.println("NOR condition true");
		}
		else
		{
			System.out.println("NOR condition false");
		}
		sc.close();
	}
}
