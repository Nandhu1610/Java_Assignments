package java1_assignments;

//WAP on Primitive type Type Casting (Implicit and Explicit)
public class Assig132_PrimitiveTypeCasting
{
	public static void main(String[] args) 
	{
		//Widening
		int a=20;
		double b=a;
		double b1=(int) a;
		System.out.println(b);
		System.out.println(b1);
		
		//Narrowing
		float c=10.59f;
		int a1=(int) c;
		System.out.println(a1);
	}
}
