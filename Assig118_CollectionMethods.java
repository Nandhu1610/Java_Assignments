package java1_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//WAP to demonstrate Collections methods 
public class Assig118_CollectionMethods 
{
	public static void main(String[] args)
	{
		Collection<String> c1=new ArrayList<String>(Arrays.asList("Java","Kotlin","Python","Ruby",null));
		c1.add("Selenium");
		
		Collection<String> c2=new HashSet<String>();
		c2.add(null);
		c2.add("Intellegi");
		c1.addAll(c2);
		System.out.println("Collection 1: "+c1);
		c2.clear();
		System.out.println("Collection 2: "+c2);
		boolean b1=c1.contains("Nan");
		System.out.println("Contains: "+b1);
		boolean b2=c1.containsAll(c2);
		System.out.println("Contains All: "+b2);
		boolean b3=c1.equals(c2);
		System.out.println("Equals: "+b3);
		boolean b4=c2.isEmpty();
		System.out.println("Is Empty: "+b4);
		System.out.println("Size: "+c1.size());
		System.out.println("Iterating using Iterator: ");
		Iterator<String> itr=c1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		c1.remove(null);
		System.out.println(c1);
		c1.removeAll(c2);
		System.out.println(c1);
	}
}
