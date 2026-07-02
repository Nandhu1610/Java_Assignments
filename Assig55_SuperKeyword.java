package java_assignments;

//WAP to Illustrating Use of Super Keyword in Method Overriding
class Employee1
{
	void role()
	{
		System.out.println("I'm an employee.");
	}
}
class Manager extends Employee1
{
	void role()
	{
		super.role();
		System.out.println("I manage a team");
	}
}
public class Assig55_SuperKeyword extends Manager
{
	void role()
	{
		super.role();
		System.out.println("I lead multiple departments");
	}
	public static void main(String[] args) 
	{
		Assig55_SuperKeyword obj=new Assig55_SuperKeyword();
		obj.role();
	}
}
