package java_assignments;

//WAP For demonstrating multiple-level inheritance using 4 parent interfaces.
interface I1
{
	void method1();
}
interface I2
{
	void method2();
}
interface I3
{
	void method3();
}
interface I4
{
	void method4();
}
public class Assig72_MultipleLevelInheritance implements I1,I2,I3,I4
{
	public static void main(String[] args)
	{
		Assig72_MultipleLevelInheritance obj=new Assig72_MultipleLevelInheritance();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
	@Override
	public void method4() 
	{
		System.out.println("Method of I4");
	}
	@Override
	public void method3() 
	{
		System.out.println("Method of I3");
	}
	@Override
	public void method2() 
	{
		System.out.println("Method of I2");
	}
	@Override
	public void method1() 
	{
		System.out.println("Method of I1");
	}
}
