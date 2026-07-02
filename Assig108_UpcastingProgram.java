package java1_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Upcasting Program
public class Assig108_UpcastingProgram 
{
	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		l1.add(5, null);
		System.out.println(l1);
		
		Set<String> s1=new HashSet<String>(Arrays.asList("Java","Python","Ruby","DotNet","Angular JS"));
		s1.add("Javascript");
		System.out.println(s1);
		
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("English", 90);
		m1.put(null, null);
		m1.put(null, 30);
		m1.put("Science", null);
		System.out.println(m1);
	}
}
