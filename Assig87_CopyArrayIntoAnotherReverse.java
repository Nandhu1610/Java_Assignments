package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to copy the value of one array into another array in the reverse order
public class Assig87_CopyArrayIntoAnotherReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		String[] arr1=new String[sc.nextInt()];
		String[] arr2=new String[arr1.length];
		for(int i=0,j=arr1.length-1;i<arr1.length;i++,j--)
		{
			System.out.print("Enter the array value: ");
			arr1[i]=sc.next();
			arr2[j]=arr1[i];
		}
		System.out.println("Input Array is: "+Arrays.toString(arr1));
		System.out.println("Output Array is: "+Arrays.toString(arr2));
		sc.close();
	}
}
