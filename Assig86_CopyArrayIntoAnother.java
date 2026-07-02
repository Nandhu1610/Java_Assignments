package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to copy the value of one array into another array
public class Assig86_CopyArrayIntoAnother
{
	public static void main(String[] args) 
	{
		//int[] arr1=new int[] {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		String[] arr1=new String[sc.nextInt()];
		String[] arr2=new String[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("Enter the Values of array: ");
			arr1[i]=sc.next();
			arr2[i]=arr1[i];
		}
		System.out.println("Input Array is: "+Arrays.toString(arr1));
		System.out.println("Output Array is: "+Arrays.toString(arr2));
		sc.close();
	}

}
