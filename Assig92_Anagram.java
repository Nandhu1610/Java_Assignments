package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if the given string is anagram
public class Assig92_Anagram 
{
	public static void main(String[] args) 
	{
		//north and thorn
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string 1: ");
		String s1=sc.nextLine().toLowerCase();
		System.out.print("Enter the string 2: ");
		String s2=sc.nextLine().toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		}
		sc.close();
	}
}
