package java_assignments;

//WAP to demonstrate more than one instance initializing block (IIB)
public class Assig76_MultipleIIB 
{
	{
		System.out.println("IIB 1");
	}
	public static void main(String[] args) 
	{
		Assig76_MultipleIIB obj=new Assig76_MultipleIIB();
	
		System.out.println(obj);
		System.out.println("Main Method");
		new Assig76_MultipleIIB();
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
}
