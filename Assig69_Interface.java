package java_assignments;

//WAP to demonstrate the use of an interface.
interface demoInterface
{
	void show();
	void display();
}
public class Assig69_Interface implements demoInterface
{
	@Override
	public void show() 
	{
		System.out.println("Method1");
	}

	@Override
	public void display() 
	{
		System.out.println("Method2");
	}
	public static void main(String[] args)
	{
		Assig69_Interface obj=new Assig69_Interface();
		obj.show();
		obj.display();
	}
}
