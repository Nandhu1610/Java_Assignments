package java_assignments;

import java.util.Scanner;

//WAP on string function toUpperCase(), toLowerCase(), equal(),
//equalIgnoreCase(), Contain()
public class Assig80_StringFunctions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input=sc.nextLine();
		String uppercase=input.toUpperCase();
		System.out.println("All Uppercase: "+uppercase);
		String lowercase=input.toLowerCase();
		System.out.println("All Lowercase: "+lowercase);
		boolean b1=input.equals(lowercase);
		System.out.println("Equal or Not: "+b1);
		boolean b2=input.equalsIgnoreCase(lowercase);
		System.out.println("Equal Ignore Case: "+b2);
		boolean b3=input.contains("a");
		System.out.println("Contains: "+b3);
		String str1="hello";
		String str2="hello";
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println(str1==str2);
		sc.close();
	}
}
