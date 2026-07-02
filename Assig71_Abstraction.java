package java_assignments;

//WAP to Demonstrate Abstraction Using Interface and Abstract Class
interface A1
{
	void method1();
	void method2();
}
abstract class B1 implements A1
{
	abstract void method3();
	void method4()
	{
		System.out.println("Concrete Method4 from Abstract Class B1");
	}
}
public class Assig71_Abstraction extends B1
{
	@Override
	public void method1() 
	{
		System.out.println("Method1 from Interface A1");
	}
	@Override
	public void method2() 
	{
		System.out.println("Method2 from Interface A1");
	}
	@Override
	void method3() 
	{
		System.out.println("Method3 from Abstract Class B1");
	}
	public static void main(String[] args) 
	{
		Assig71_Abstraction obj=new Assig71_Abstraction();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
}
