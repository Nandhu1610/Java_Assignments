package java1_assignments;

import java.util.ArrayList;
import java.util.List;

//WAP on Class type Type Casting (Upcasting and Downcasting)
public class Assig133_ClassTypeCasting 
{
	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		ArrayList<Integer> a1=(ArrayList<Integer>) l1;
		System.out.println(a1);
	}
}
