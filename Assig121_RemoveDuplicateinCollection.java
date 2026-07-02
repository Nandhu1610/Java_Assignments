package java1_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//WAP to remove all duplicates in the given Collection 
public class Assig121_RemoveDuplicateinCollection 
{
	public static void main(String[] args) 
	{
		List<Float> l1=new ArrayList<Float>();
		l1.add(10.50f);
		l1.add(20.65f);
		l1.add(20.65f);
		l1.add(20.65f);
		l1.add(20.65f);
		System.out.println(l1);
		
		Set<Float> s1=new HashSet<Float>(l1);
		System.out.println(s1);
	}
}
