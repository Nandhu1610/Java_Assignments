package java_assignments;

//WAP to Demonstrating Method Overriding Using 4 Classes
class Animal
{
	void sound()
	{
		System.out.println("Some generic animal sound");
	}
}
class Mammal extends Animal
{
	void sound()
	{
		System.out.println("Mammal sound");
	}
}
class Bird extends Animal
{
	void sound()
	{
		System.out.println("Bird sound");
	}
}
public class Assig54_MethodOverriding extends Mammal
{
	void sound()
	{
		System.out.println("Dog Barks");
	}
	public static void main(String[] args)
	{
		Assig54_MethodOverriding obj=new Assig54_MethodOverriding();
		Bird obj1=new Bird();
		Mammal obj2=new Mammal();
		Animal obj3=new Animal();
		obj.sound();
		obj1.sound();
		obj2.sound();
		obj3.sound();
	}
}
