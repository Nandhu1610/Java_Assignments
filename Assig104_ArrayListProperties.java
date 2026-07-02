package java1_assignments;

import java.util.ArrayList;

//WAP to Demonstrate All Remove Methods in ArrayList
public class Assig104_ArrayListProperties 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("Python");
		l1.add("Ruby");
		l1.add("Dot Net");
		l1.add("Javascript");
		System.out.println(l1);
		//Integer i1=l1.remove(1);
		System.out.println(l1.remove(1));
		System.out.println(l1.remove("Java"));
		System.out.println(l1.removeAll(l1));
		System.out.println(l1);
	}
}
