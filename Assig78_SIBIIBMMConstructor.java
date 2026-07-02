package java_assignments;

//WAP to demonstrate the execution flow by including SIB, IIB, 
//Main Method and Constructor in a single program.
class Parent2
{
	char b='A';
	static String c="Nandhini";
	Parent2()
	{
		System.out.println("This is Parent Class Constructor");
	}
}
public class Assig78_SIBIIBMMConstructor extends Parent2
{
	int a=10;
	Assig78_SIBIIBMMConstructor()
	{
		this("Ram");
		System.out.println(a);
		System.out.println("This is Non Parameterized Constructor");
	}
	static
	{
		Assig78_SIBIIBMMConstructor obj=new Assig78_SIBIIBMMConstructor();
		obj.a=50;
		System.out.println(obj.a);
		System.out.println("This is SIB Block 1");
	}
	{
		System.out.println(b);
		System.out.println("This is IIB block 1");
	}
	public static void main(String[] args) 
	{
		new Assig78_SIBIIBMMConstructor();
		System.out.println("Main Method");
	}
	static
	{
		System.out.println(c);
		System.out.println("This is SIB Block 2");
	}
	{
		int a=50;
		System.out.println(a);
		System.out.println("This is IIB Block 2");
	}
	Assig78_SIBIIBMMConstructor(String name)
	{
		super();
		System.out.println("This is Parameterized constructor");
	}
}
