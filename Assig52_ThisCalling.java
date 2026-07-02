package java_assignments;

//WAP to demonstrate the use of this() to call a constructor within the same class.
public class Assig52_ThisCalling 
{
	Assig52_ThisCalling()
	{
		System.out.println("Mobile details not available");
	}
	Assig52_ThisCalling(String brand, String model)
	{
		this();
		System.out.println("Brand and model are available");
	}
	Assig52_ThisCalling(String brand, String model, double price)
	{
		this(brand, model);
		System.out.println("Mobile details available");
	}
	public static void main(String[] args) 
	{
		new Assig52_ThisCalling("Samsung", "S24 Ultra", 100000);
	}
}
