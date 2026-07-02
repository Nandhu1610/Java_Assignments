package java_assignments;

//WAP to Demonstrate the Use of super and this in Constructors Within and Between Classes
class Account
{
	Account() 
	{
		System.out.println("Account created");
	}
	Account(long accNo, String accHolderName)
	{
		this();
		System.out.println("Account number: "+accNo);
		System.out.println("Account Holder: "+accHolderName);
	}
}
public class Assig53_SuperandThisCalling extends Account
{
	//double balance;
	Assig53_SuperandThisCalling()
	{
		System.out.println("No Data");
	}
	Assig53_SuperandThisCalling(double balance)
	{
		super(6852486255l, "Nandhini");
		System.out.println("Account Balance: "+balance);
	}
	public static void main(String[] args) 
	{
		new Assig53_SuperandThisCalling(50000.57);
	}
}
