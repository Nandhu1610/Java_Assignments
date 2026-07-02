package java_assignments;

//WAP to demonstrate multilevel inheritance with non static method 
class vehicle
{
	void start()
	{
		System.out.println("Vehicle is Starting");
	}
}
class Car extends vehicle
{
	void fuel()
	{
		System.out.println("Car is Fueled");
		start();
	}
}
public class Assig47_MLIusingNonStaticMethod extends Car
{
	void charge()
	{
		System.out.println("Electric car is charging");
	}
	public static void main(String[] args) 
	{
		Assig47_MLIusingNonStaticMethod obj=new Assig47_MLIusingNonStaticMethod();
		obj.charge();
		obj.fuel();
	}
}
