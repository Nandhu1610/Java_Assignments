package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to Check in the given String how many are alphabets present.
public class Assig94_CountOfAlphabetsInString 
{
	static int countOfAlphabet=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(c1[i]))
			{
				countOfAlphabet++;
			}
		}
		System.out.println("Count of Alphabet present in the given string is: "+countOfAlphabet);
		sc.close();
	}
}
