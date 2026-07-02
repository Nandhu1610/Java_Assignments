package java_assignments;
import java.util.Scanner;

//WAP to check the given string palindrome or not
public class Assig82_Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String s1=sc.next();
		System.out.print("Enter the String 2: ");
		String s2=sc.next();
		String reverse="";
		if(s1.length()!=s2.length())
		{
			System.out.println("Given Strings are Not Palindrome");
		}
		else
		{
			for(int i=s1.length()-1;i>=0;i--)
			{
				char c1=s1.charAt(i);
				reverse=reverse+c1;
			}
			System.out.println(reverse);
			if(reverse.equalsIgnoreCase(s2)) 
			{
				System.out.println("Given Strings are Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
		}
		sc.close();
	}
}
