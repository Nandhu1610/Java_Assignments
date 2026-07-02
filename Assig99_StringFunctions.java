package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//WAP on string methods split (),isblank,()is empty()
public class Assig99_StringFunctions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.next();
		String[] s2=s1.split(":");
		System.out.println(Arrays.toString(s2));
		String s3=" ";
		boolean b1=s3.isBlank();
		System.out.println("Checking the string is blank: "+b1);
		boolean b2=s3.isEmpty();
		System.out.println("Checking the string is empty: "+b2);
		sc.close();
	}
}
