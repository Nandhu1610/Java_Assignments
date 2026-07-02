package java_assignments;

import java.util.Scanner;

//WAP to find out the average of all the values present in the array
public class Assig88_AverageInArray 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the values in an array: ");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the values in an array: "+sum);
		double average=sum/arr.length;
		System.out.println("Average of all the values in an array: "+average);
		sc.close();
	}
}
