package java_assignments;

//WAP to access Public, protected, default & private methods within a class
public class Assig61_AccessSpecifierWithinClass 
{
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Adding two numbers: "+sum);
	}
	protected void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtracting two numbers: "+sub);
	}
	void mul(int a, int b)
	{
		int mul=a+b;
		System.out.println("Multiply two numbers: "+mul);
	}
	private void div(int a,int b)
	{
		int div=a+b;
		System.out.println("Dividing two numbers: "+div);
	}
	public static void main(String[] args) 
	{
		Assig61_AccessSpecifierWithinClass obj = new Assig61_AccessSpecifierWithinClass();
		obj.add(10, 20);
		obj.sub(30, 20);
		obj.mul(5, 3);
		obj.div(10, 5);
	}
}
