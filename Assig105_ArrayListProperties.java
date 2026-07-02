package java1_assignments;

import java.util.ArrayList;
import java.util.Arrays;

//WAP to Demonstrate size(), get() and contains() Methods of ArrayList
public class Assig105_ArrayListProperties 
{
	public static void main(String[] args)
	{
		ArrayList<Character> a1=new ArrayList<Character>(Arrays.asList('A','B','C')) ;
		ArrayList<Character> a2=new ArrayList<Character>();
		a2.add('D');
		a2.add('E');
		a2.add('F');
		//List<Integer> a2=Arrays.asList(5,2,3,6,4);
		System.out.println(a1);
		System.out.println("Size is: "+a1.size());
		Character c1=a1.get(2);
		System.out.println("Getting the character at index position: "+c1);
		System.out.println("Contains: "+a2.contains('D'));
		System.out.println("Contains All: "+a1.containsAll(a2));
	}
}
