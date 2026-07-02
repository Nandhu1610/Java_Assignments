package java1_assignments;

//WAP to find ASCII values of the strings 'Apple' and 'Orange'.
public class Assig122_ASCIIValue 
{
	public static void main(String[] args) 
	{
		String s1="Apple";
		String s2="Orange";
		System.out.println("ASCII values of string \"" + s1 + "\":");
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch+" "+(int)ch);
		}
		System.out.println("ASCII values of string \"" + s2 + "\":");
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			System.out.println(ch+" "+(int)ch);
		}
	}
}
