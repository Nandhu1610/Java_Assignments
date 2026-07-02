package java1_assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assig111_SetInterfaceMethods 
{
	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Java");
		s1.add("Selenium");
		s1.add("Python");
		s1.add("Javascript");
		s1.add("Ruby");
		System.out.println("Set 1 Collection: "+s1);
		
		Set<String> s2=new HashSet<String>();
		s2.add("java");
		s2.add("selenium");
		s2.add("python");
		s2.add("javascript");
		s2.add("ruby");
		System.out.println("Set 2 Collection: "+s2);
		s1.addAll(s2);
		System.out.println("Adding s2 into s1: "+s1);
		
		System.out.println("Contains: "+s1.contains("java"));
		System.out.println("Contains All: "+s1.containsAll(s2));
		System.out.println("Equals: "+s1.equals(s2));
		System.out.println("Is empty: "+s1.isEmpty());
		s1.remove("Java");
		System.out.println("After removing object: "+s1);
		s1.removeAll(s2);
		System.out.println("After removing entire collection: "+s1);
		System.out.println("Size: "+s1.size());
		System.out.println("Start of Iteration");
		System.out.println("==================");
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------End of Iteration-------");
		s2.clear();
		System.out.println("After clearing collection: "+s2);
	}
}
