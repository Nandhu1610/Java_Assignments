package java1_assignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//WAP to Demonstrate the Vector Class Using Iterator, ListIterator, and Enumeration.
public class Assig113_VectorIteration 
{
	public static void main(String[] args) 
	{
		Vector<Character> v1=new Vector<Character>();
		v1.addElement('J');
		v1.addElement('A');
		v1.addElement('V');
		v1.addElement('A');
		System.out.println(v1);
		System.out.println("Iteration using Iterator");
		System.out.println("========================");
		Iterator<Character> itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iteration using ListIterator");
		System.out.println("============================");
		ListIterator<Character> itr1=v1.listIterator();
		System.out.println("Forward Iteration");
		System.out.println("                 ");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Backward Iteration");
		System.out.println("                  ");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		System.out.println("Iteration using Enumeration");
		System.out.println("===========================");
		Enumeration<Character> en=v1.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
