package java1_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//WAP to check the given string is a part of the collection(ArrayList)  using iterator
public class Assig112_StringPartOfCollection
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.next();
		List<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("Python");
		l1.add("Selenium");
		l1.add("Dotnet");
		System.out.println(l1);
		Iterator<String> itr=l1.iterator();
		boolean found=false;
		while (itr.hasNext()) 
		{
			if(s1.equalsIgnoreCase(itr.next()))
			{
				found=true;
				break;
			}	
		}
		if(found)
		{
			System.out.println("Given String is part of the Collection");
		}
		else
		{
			System.out.println("Given String is not a part of the Collection");
		}
		sc.close();
	}
}
