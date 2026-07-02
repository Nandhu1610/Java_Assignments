package java_assignments;
import java.util.Arrays;
import java.util.Scanner;
//WAP to accept the values of array at run time
public class Assig84_ArrayRunTime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		String[] arr1=new String[sc.nextInt()];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("Enter the array values at the index position "+i);
			arr1[i]=sc.next();
		}
		System.out.println(Arrays.toString(arr1));
		sc.close();
		/*char arr[]=new char[2];
		System.out.println(Arrays.toString(arr));*/
	}
}
