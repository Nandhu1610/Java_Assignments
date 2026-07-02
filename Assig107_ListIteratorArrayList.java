package java1_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

//WAP to to Demonstrate listIterator and Its Methods in ArrayList
public class Assig107_ListIteratorArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a1=new ArrayList<Character>(Arrays.asList('A','B','C','D','E'));
		System.out.println(a1);
		ListIterator<Character> itr=a1.listIterator();
		System.out.println("Forward Iteration: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Backward Iteration: ");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
