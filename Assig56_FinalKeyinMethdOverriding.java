package java_assignments;

//WAP to Illustrating the Use of Final Keyword to Prevent Method Overriding
class Bank
{
	final void loanPolicy()
	{
		System.out.println("Loan policy is fixed and cannot be changed");
	}
}
public class Assig56_FinalKeyinMethdOverriding extends Bank
{
	/*void loanPolicy() //final methods cannot be overridden
	{
		
	}*/
	public static void main(String[] args) 
	{
		Assig56_FinalKeyinMethdOverriding obj=new Assig56_FinalKeyinMethdOverriding();
		obj.loanPolicy();
	}

}
