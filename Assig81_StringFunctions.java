package java_assignments;
import java.util.Scanner;
//WAP on string functions subString(index), subString(index, endIndex), reverse()
public class Assig81_StringFunctions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input=sc.nextLine();
		String s1=input.substring(8);
		System.out.println("Substring with StartIndex: "+s1);
		String s2=input.substring(0, 9);
		System.out.println("Substring with Start and End Index: "+s2);
		sc.close();
	}	
}
