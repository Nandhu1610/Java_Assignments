package java1_assignments;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to Demonstrate Iterator and Its Methods in ArrayList
public class Assig106_IteratorArrayList 
{
	public static void main(String[] args)
	{
	ArrayList<Float> a1=new ArrayList<Float>();
	a1.add(10.55f);
	a1.add(20.6712f);
	a1.add(01.5542f);
	a1.add(50.6885f);
	a1.add(80.5480f);
	System.out.println(a1);
	Iterator<Float> itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
