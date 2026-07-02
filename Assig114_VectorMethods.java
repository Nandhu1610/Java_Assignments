package java1_assignments;

import java.util.Vector;

//WAP to demonstrate all 5 add methods in vector
public class Assig114_VectorMethods 
{
	public static void main(String [] args)
	{
	Vector<Integer> v1=new Vector<Integer>();
	v1.addElement(10);
	v1.addElement(20);
	v1.addElement(30);
	v1.addElement(40);
	v1.addElement(50);
	System.out.println(v1);
	System.out.println("Capacity: "+v1.capacity());
	System.out.println("Contains: "+v1.contains(10));
	System.out.println("Index of object: "+v1.indexOf(10));
	System.out.println("Last Index of object: "+v1.lastIndexOf(20));	
	System.out.println("Element at given index: "+v1.elementAt(1));
	System.out.println("First Element: "+v1.firstElement());
	System.out.println("Last Element: "+v1.lastElement());
	}
}
