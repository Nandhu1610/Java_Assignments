package java_assignments;

//WAP to Demonstrate Abstract Class and Concrete Class
abstract class Students
{
	abstract void studentDetails(String name,int rollNo);
	
}
public class Assig65_Abstract_ConcreteClass extends Students
{
	public static void main(String[] args) 
	{
		Assig65_Abstract_ConcreteClass obj=new Assig65_Abstract_ConcreteClass();
		obj.studentDetails("Ram", 784554);
	}
	@Override
	void studentDetails(String name,int rollNo) 
	{
		System.out.println("Student name: "+name);
		System.out.println("Student rollNo: "+rollNo);
	}

}
