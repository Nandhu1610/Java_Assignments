package java1_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//WAP to call ArrayList methods
public class Assig103_ArrayListProperties 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> l1=new ArrayList<Character>();
		l1.add('A');
		l1.add('B');
		l1.add('C');
		l1.add(null);
		l1.add('D');
		System.out.println(l1);
		l1.add(3, 'D');
		System.out.println(l1);
		
		ArrayList<Character> l2=new ArrayList<Character>();
		l2.add('S');
		l2.addAll(l1);
		System.out.println(l2);
		
		l1.addAll(0, l2);
		System.out.println(l1);
		boolean b1=l1.contains('A');
		System.out.println(b1);
		boolean b2=l1.containsAll(l2);
		System.out.println(b2);
		boolean b3=l1.equals(l2);
		System.out.println(b3);
		System.out.println(l1.indexOf('A'));
		System.out.println(l1.isEmpty());
		System.out.println("Iterating using Iterator:");
		Iterator<Character> itr=l1.iterator();
		while (itr.hasNext()) 
		{
			Character ch=itr.next();
			System.out.println(ch);
		}
		System.out.println("Iterating using ListIterator Forward:");
		ListIterator<Character> itr1=l1.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Iterating using ListIterator Backward:");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
	}
}
