package java1_assignments;

import java.util.HashMap;
import java.util.Map;

//WAP to demonstrate Map interface methods replace(), size(), isEmpty() and clear()
public class Assig116_MapInterfaceMethods 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "Java");
		m1.put(2, "Python");
		m1.put(3, "Selenium");
		m1.put(4, "Ruby");
		m1.put(5, "Dotnet");
		System.out.println(m1);

		System.out.println("Replace: "+m1.replace(3, null));
		System.out.println("Size: "+m1.size());
		boolean b1=m1.isEmpty();
		System.out.println("Is Empty: "+b1);
		m1.clear();
		System.out.println("After Clear the map: "+m1);
	}
}
