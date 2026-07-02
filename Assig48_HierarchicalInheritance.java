package java_assignments;

//WAP to demonstrate Hierarchical level inheritance 
class Shape
{
	void display()
	{
		System.out.println("This is the shape");
	}
}
class Circle extends Shape
{
	void area()
	{
		display();
		System.out.println("Area of Circle");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		display();
		System.out.println("Area of Rectangle");
	}
}
public class Assig48_HierarchicalInheritance extends Shape
{
	public static void main(String[] args) 
	{
		Rectangle obj1=new Rectangle();
		Circle obj2=new Circle();
		obj1.area();
		obj2.area();
	}
}
