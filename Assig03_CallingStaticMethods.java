package java_assignments;

//Call Static Methods inside the main method
public class Assig03_CallingStaticMethods 
{
	static int a=10;
	static int b=20;
	static void add()
	{
		int sum=a+b;
		System.out.println("Addition:"+sum);
	}
	static void sub()
	{
		int sub=a-b;
		System.out.println("Subtraction:"+sub);
	}	
	static void mul()
	{
		int mul=a*b;
		System.out.println("Multiplication:"+mul);
	}	
	static void div()
	{
		int div=a/b;
		System.out.println("Division:"+div);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}
