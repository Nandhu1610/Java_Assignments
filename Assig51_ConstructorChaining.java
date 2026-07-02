package java_assignments;

//WAP demonstrating constructor chaining using this().
public class Assig51_ConstructorChaining 
{
	Assig51_ConstructorChaining()
	{
		System.out.println("Product details not available");
	}
	Assig51_ConstructorChaining(int productId, String productName)
	{
		this();
		System.out.println("Product details are available");
		//System.out.println(productId,productName); //Together in one line not accepting
	}
	Assig51_ConstructorChaining(int productId, String productName,double price)
	{
		this(productId,productName);
		System.out.println("Product details are available with price");
	}
	public static void main(String[] args) 
	{
		new Assig51_ConstructorChaining(12,"Charging Adapter",1000);
	}
}
