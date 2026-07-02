package java1_assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//WAP to iterate HashSet using Iterator
public class Assig124_HashSetUsingIterator 
{
	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Java");
		s1.add("Python");
		s1.add("Selenium");
		s1.add("Ruby");
		s1.add("Dotnet");
		System.out.println(s1);
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
