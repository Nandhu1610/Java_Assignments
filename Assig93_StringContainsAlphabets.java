package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if the given string contains only alphabets
public class Assig93_StringContainsAlphabets 
{
	static int countOfAlphabet=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		System.out.println("Printing array in a readable format: "+Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
		if(Character.isAlphabetic(c1[i]))
		{
			countOfAlphabet++;	
		}
		}
		//System.out.println("Count of Alphabets in the given String is: "+countOfAlphabet);
		if(countOfAlphabet==s1.length())
		{
			System.out.println("String contains only Alphabets");
		}
		else
		{
			System.out.println("String contains Alphanumenic characters");
		}
		sc.close();
	}
}
