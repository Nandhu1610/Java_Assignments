package java1_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//WAP to Demonstrate List Interface Methods
public class Assig110_ListInterfaceMethods
{
	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(6, 10);
		System.out.println("List 1: "+l1);
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(70);
		l2.add(1, null);
		System.out.println("List 2: "+l2);
		l2.addAll(l1);
		System.out.println("Add All List 2: "+l2);
		l1.clear();
		System.out.println("Clear List 1: "+l1);
		l1.addAll(0, l2);
		System.out.println("Add All at given index List 1: "+l1);
		System.out.println("Contains: "+l1.contains(10));
		System.out.println("Contains All: "+l1.containsAll(l2));
		boolean b1=l1.equals(l2);
		System.out.println("Equals: "+b1);
		System.out.println("Is Empty: "+l1.isEmpty());
		System.out.println("Index of: "+l1.indexOf(10));
		System.out.println("Last Index of: "+l1.lastIndexOf(10));
		System.out.println("Size: "+l1.size());
		System.out.println("Remove of index: "+l1.remove(1));
		System.out.println(l1);
		System.out.println("Remove of Object: "+l1.remove(null));
		System.out.println(l1);
		System.out.println("Iterating using Iterator: ");
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iterating using ListIterator: ");
		ListIterator<Integer> itr1=l1.listIterator();
		System.out.println("Forward Iteration");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("Backward Iteration");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
	}
}
