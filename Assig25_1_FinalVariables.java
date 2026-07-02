package java_assignments;

//WAP that uses the final for both local  and global variables
public class Assig25_1_FinalVariables
{
	final static String name="ABC TECH";
	static void display()
	{
		final int year=2025;
		System.out.println(name);
		System.out.println(year);
		//year=2026;
	}
	public static void main(String[] args)
	{
		display();
		//name="ABC";
	}
}
