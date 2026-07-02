package java1_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//WAP How to convert list into set  
public class Assig119_ListToSet 
{
	public static void main(String[] args) 
	{
		List<Double> l1=new ArrayList<Double>();
		l1.add(10.50);
		l1.add(20.65);
		l1.add(20.65);
		l1.add(20.65);
		l1.add(20.65);
		System.out.println(l1);
		
		Set<Double> s1=new HashSet<Double>(l1);
		System.out.println(s1);
	}
}
