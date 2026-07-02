package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to Check in the given String how many are numeric present
public class Assig95_CountOfNumericInString
{
	static int countOfNumeric=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			if(Character.isDigit(c1[i]))
			{
				countOfNumeric++;
			}
		}
		System.out.println("Count of numbers present in the given string is: "+countOfNumeric);
		sc.close();
	}
}
