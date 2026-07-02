package java1_assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//WAP to Demonstration of Map Iteration Techniques 
public class Assig117_MapIteration
{
	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "Java");
		m1.put(2, "Python");
		m1.put(3, "Selenium");
		m1.put(4, "Ruby");
		m1.put(5, "Dotnet");
		System.out.println(m1);
		
		System.out.println("Iterating the keys");
		for(Integer i1:m1.keySet())
		{
			System.out.println(i1);
		}
		
		System.out.println("Iterating the values");
		for(String s1:m1.values())
		{
			System.out.println(s1);
		}
		
		System.out.println("Iterating the key and value");
		for(Entry<Integer,String> is:m1.entrySet())
		{
			System.out.println(is);
		}
	}
}
