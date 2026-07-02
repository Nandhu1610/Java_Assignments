package java_assignments;

//WAP to Show Relationship Between Two Interfaces
interface Interface1
{
	void methodA();
}
interface Interface2 extends Interface1
{
	void methodB();
}
public class Assig70_TwoInterfaces implements Interface2
{
	@Override
	public void methodA() 
	{
		System.out.println("Interface1 Implementation");
	}

	@Override
	public void methodB() 
	{
		System.out.println("Interface2 Implementation");
	}
	public static void main(String[] args)
	{
		Assig70_TwoInterfaces obj=new Assig70_TwoInterfaces();
		obj.methodA();
		obj.methodB();
	}
}
