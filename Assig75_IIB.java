package java_assignments;

//WAP to demonstrate instance initializing block (IIB)
public class Assig75_IIB 
{
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Assig75_IIB obj=new Assig75_IIB();
		System.out.println(obj);
	}
}
