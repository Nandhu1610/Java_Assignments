package java_assignments;

//WAP by creating 2 or multiple objects with multiple IIB blocks 
public class Assig77_MultipleIIB
{
	int a=20;
	static int b=30;
	static
	{
		Assig77_MultipleIIB obj=new Assig77_MultipleIIB();
		System.out.println(obj.a=50);
	}
	{
		a=100;
		b=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println("IIB Block 1");
	}
	{
		System.out.println("IIB Block 2");
	}
	{
		System.out.println("IIB Block 3");
	}
	Assig77_MultipleIIB() 
	{
		System.out.println("Constructor 1");
	}
	Assig77_MultipleIIB(char b) 
	{
		this();
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) 
	{
		Assig77_MultipleIIB obj= new Assig77_MultipleIIB();
		obj.a=500;
		System.out.println(obj.a);
		System.out.println("Main Method");
		new Assig77_MultipleIIB();
		new Assig77_MultipleIIB('A');
		System.out.println(obj.a=20);
		System.out.println(b);
	}
	{
		System.out.println("IIB Block 4");
	}
	{
		System.out.println("IIB Block 5");
	}
}
