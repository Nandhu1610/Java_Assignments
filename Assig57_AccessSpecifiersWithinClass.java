package java_assignments;

//WAP to access Public, protected, default & private variables within a class
public class Assig57_AccessSpecifiersWithinClass 
{
	public String companyName="ABC TECH";
	public static String companyName1="ABC TECHNOLOGIES";
	protected String department="Testing";
	String designation="Tester";
	private double salary=80000;
	public static int age=30;
	/*void displayDetails()
	{
		companyName="ABC TECH";
		department="Software Testing";
		designation="Tester";
		salary=80000;
	}*/
	public static void main(String[] args) 
	{
		Assig57_AccessSpecifiersWithinClass obj=new Assig57_AccessSpecifiersWithinClass();
		//obj.displayDetails();
		System.out.println(obj.companyName);//Either directly print here or store it in a local variable and print the local variable.
		System.out.println(obj.department);
		System.out.println(obj.designation);
		double salary=obj.salary;
		System.out.println(salary);	
		System.out.println(age);
	}
}
