package java1_assignments;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to remove all the NULL in the given collection
public class Assig120_RemoveNullInCollection
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==null)
			{
				itr.remove();
			}
		}
		System.out.println(a1);
	}
}
