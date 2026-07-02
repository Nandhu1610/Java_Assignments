package java_assignments;

//WAP to Demonstrate Method Overloading Using Static and Non-Static Methods
public class Assig26_MethodOverloading
{
	static void add(int a,int b)
	{
		int sum =a+b;
		System.out.println("Sum of 2 ints:"+sum);
	}
	static void add(double a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of 2 double:"+sum);
	}
	void multiply(int a,int b)
	{
		int mul=a*b;
		System.out.println("Product of 2 ints:"+mul);
	}
	void multiply(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println("Product of 3 ints:"+mul);
	}
	public static void main(String[] args) 
	{
		add(10,20);
		add(15.25, 2.580);
		Assig26_MethodOverloading obj=new Assig26_MethodOverloading();
		obj.multiply(12, 12);
		obj.multiply(10, 20, 30);
	}
}
