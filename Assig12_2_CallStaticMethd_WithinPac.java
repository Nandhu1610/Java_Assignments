package java_assignments;

public class Assig12_2_CallStaticMethd_WithinPac 
{
	static void display()
	{
		System.out.println("Welcome");
		Assig12_1_CallStaticMethd_WithinPac.add(5, 10);
	}
	public static void main(String[] args) 
	{
		display();
	}
}
