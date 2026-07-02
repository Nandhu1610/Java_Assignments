package java_assignments;

import java.util.Scanner;

//WAP to Check in the given String how many are special char present
public class Assig96_CountOfSpecCharInString 
{
	static int countOfAlphabet=0;
	static int countOfNumeric=0;
	static int countOfSpace=0;
	static int countOfSpecChar=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(Character.isAlphabetic(c1[i]))
			{
				countOfAlphabet++;
			}
			if(Character.isDigit(c1[i]))
			{
				countOfNumeric++;
			}
			if(Character.isSpaceChar(c1[i])) //if(Character.isWhitespace(c1[i]))==>this also checking the space
			{
				countOfSpace++;
			}
		}
		countOfSpecChar=c1.length-(countOfAlphabet+countOfNumeric+countOfSpace);
		System.out.println("Count of Special Character present in the given string is: "+countOfSpecChar);
		sc.close();
	}
}
