package java1_assignments;

import java.util.HashMap;
import java.util.Map;

//WAP to demonstrate Map interface methods like put(), putAll(), equal() and containsKey()
public class Assig115_MapInterfaceMethods 
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
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(4, null);
		m2.put(5, null);
		m2.put(6, "Unknown");
		System.out.println(m2);
		m1.putAll(m2);
		System.out.println(m1);
		
		System.out.println("Equals: "+m1.equals(m2));
		System.out.println("Contains key: "+m1.containsKey(2));
	}
}
