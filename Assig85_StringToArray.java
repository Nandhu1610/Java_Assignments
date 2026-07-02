package java_assignments;
import java.util.Arrays;
import java.util.Scanner;
//WAP to convert string into array 
public class Assig85_StringToArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		String reverse="";
		for(int i=0;i<s1.length();i++)
		{
			//System.out.println(c1[i]);
		}
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+c1[i];
		}
		System.out.println(Arrays.toString(c1));
		sc.close();
		System.out.println(reverse);
	}
}
