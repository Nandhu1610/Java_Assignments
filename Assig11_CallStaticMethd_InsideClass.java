package java_assignments;

//WAP to call static method inside another static method within the class
public class Assig11_CallStaticMethd_InsideClass 
{
	static void display()
	{
		System.out.println("Welcome");
		calculate(10,20);
	}
	static void calculate(int a,int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	public static void main(String[] args) 
	{
		display();
	}
}
