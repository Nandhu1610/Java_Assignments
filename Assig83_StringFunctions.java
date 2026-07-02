package java_assignments;
import java.util.Scanner;
//WAP on string function matches(), replace(char a, char b), replace(charSeq a, charSeq b) 
//and replaceAll(string regex, string)
public class Assig83_StringFunctions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		if(s1.contains("a"))
		{
			System.out.println("String Contains the specified character: "+s1.matches("(.*)a(.*)"));
		}
		else
		{
			System.out.println("No such character present in the string");
		}
		System.out.println(s1.replace('N', 'n'));
		System.out.println(s1.replace("Nandhini", "Ram"));
		sc.close();
	}
}
