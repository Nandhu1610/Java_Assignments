package java1_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//WAP to convert set to list 
public class Assig123_SetToList 
{
	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Java");
		s1.add("Java");
		s1.add("Python");
		s1.add("Selenium");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		List<String> l1=new ArrayList<String>(s1);
		System.out.println(l1);
		l1.add("Java");
		System.out.println(l1);
	}
}
