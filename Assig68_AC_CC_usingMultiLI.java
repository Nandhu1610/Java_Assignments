package java_assignments;

//WAP to Demonstrate Multilevel Inheritance Using Concrete and Abstract Classes
//1. ConcreteClass → 2 concrete methods
//2. AbstractClass → 1 concrete method + 1 abstract method
//3. DerivedClass → Implements the abstract method
class A
{
	void method1()
	{
		System.out.println("Method 1");
	}
	void method2()
	{
		System.out.println("Method 2");
	}
}
abstract class B extends A
{
	void method3()
	{
		System.out.println("Method 3");
	}
	abstract void method4();
}
public class Assig68_AC_CC_usingMultiLI extends B
{
	@Override
	void method4() 
	{
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
		Assig68_AC_CC_usingMultiLI obj=new Assig68_AC_CC_usingMultiLI();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
}
