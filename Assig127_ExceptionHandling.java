package java1_assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//WAP on multiple catch blocks
public class Assig127_ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int[] i=new int[sc.nextInt()];
		for(int j=0;j<3;j++)
		{
			System.out.println("Enter the value at index position: "+j);
			i[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(i));
		sc.close();
		}
		catch(NegativeArraySizeException e1)
		{
			System.out.println("Handled Negative Array Size Exception");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Handled InputMismatch Exception");
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Handled ArrayIndexOutOfBounds Exception");
		}
	}
}
