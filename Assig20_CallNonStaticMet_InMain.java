package java_assignments;

//WAP to call non static method inside the main method
public class Assig20_CallNonStaticMet_InMain 
{
	void display()
	{
		System.out.println("Calling Non Static Method1 Inside Main Method");
	}
	void isEnable()
	{
		System.out.println("Calling Non Static Method2 Inside Main Method");
	}
	public static void main(String[] args) 
	{
		Assig20_CallNonStaticMet_InMain ab=new Assig20_CallNonStaticMet_InMain();
		ab.display();
		ab.isEnable();
	}
}
