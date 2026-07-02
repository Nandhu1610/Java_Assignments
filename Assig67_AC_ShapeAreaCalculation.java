package java_assignments;

//Shape Area Calculation Using Abstract Class
abstract class Circle1
{
	abstract void areaOfCircle(double radius);
}
abstract class Rectangle1 extends Circle1
{
	abstract void areaOfRectangle(double length,double width);
}
abstract class Triangle1 extends Rectangle1
{
	abstract void areaOfTriangle(double base,double height);
}
public class Assig67_AC_ShapeAreaCalculation extends Triangle1
{
	@Override
	void areaOfCircle(double radius) 
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle :"+area);
	}

	@Override
	void areaOfTriangle(double base,double height) 
	{
		double area=1/2*base*height;
		System.out.println("Area of Triangle: "+area);
	}

	@Override
	void areaOfRectangle(double length,double width) 
	{
		double area=length*width;
		System.out.println("Area of Rectangle: "+area);
	}
	public static void main(String[] args) 
	{
		Assig67_AC_ShapeAreaCalculation obj=new Assig67_AC_ShapeAreaCalculation();
		obj.areaOfCircle(10);
		obj.areaOfRectangle(10, 2.450);
		obj.areaOfTriangle(15, 10);
	}	
}
