package java_assignments;

//WAP to Illustrate Abstract Method and Method Overriding
abstract class Banks
{
	abstract void calculateInterest(double amount);
	void displayBankName()
	{
		System.out.println("Welcome to the Bank");
	}
}
class SBI extends Banks
{
	void calculateInterest(double amount)
	{
		System.out.println("5% Interest: "+amount);
	}
}
public class Assig66_AbstractMethods_Overriding extends Banks
{
	void calculateInterest(double amount)
	{
		System.out.println("7% Interest: "+amount);
	}
	public static void main(String[] args) 
	{
		SBI obj=new SBI();
		obj.calculateInterest(5000.505);
		Assig66_AbstractMethods_Overriding obj1=new Assig66_AbstractMethods_Overriding();
		obj1.calculateInterest(6000.44);
		obj.displayBankName();
		obj1.displayBankName();
	}
}
