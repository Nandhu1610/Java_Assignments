package java_assignments;

import java.util.Scanner;

//WAP to check if any number is present multiple times in the array 
//also at which index position
public class Assig91_CheckValueInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int[] arr=new int[sc.nextInt()];
		System.out.print("Enter the no to check in an array: ");
		int noToCheck=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the values in an array: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(noToCheck==arr[i])
			{
				System.out.println("Given no is part of an array at the index position "+i);
			}
		}
		sc.close();
	}
}
