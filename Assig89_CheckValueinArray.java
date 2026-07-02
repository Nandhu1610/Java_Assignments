package java_assignments;

import java.util.Scanner;

//WAP to check if 100 is a part of your array
public class Assig89_CheckValueinArray 
{
	public static void main(String[] args) 
	{
		//int noToCheck=50;
		boolean b1=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int[] arr=new int[sc.nextInt()];
		System.out.print("Enter the no to check in an array: ");
		int noToCheck=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the values of an array: ");
			arr[i]=sc.nextInt();
			if(noToCheck==arr[i])
			{
				b1=true;
			}
		}
		if(b1)
		{
			System.out.println("Given number is part of the array");
		}
		else
		{
			System.out.println("Given number is not part of the array");
		}
		sc.close();
	}
}
