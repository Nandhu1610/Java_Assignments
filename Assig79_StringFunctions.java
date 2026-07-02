package java_assignments;

import java.util.Scanner;

//WAP on string functions length ,charAt() ,concat
public class Assig79_StringFunctions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String s=sc.next();
		System.out.print("Enter the String 2: ");
		String s1=sc.next();
		int length=s.length();
		System.out.println("Length of the String is: "+length);
		char position=s.charAt(5);
		System.out.println("Character at the given index position 5 is: "+position);
		String s2=s.concat(s1);
		System.out.println("Concat two strings: "+s2);
		sc.close();
	}
}
