package java_assignments;
import java1_assignments.Assig13_2_CallStaticMethd_OutPac;
//WAP to call static method inside another static method outside the class but different package
public class Assig13_1_CallStaticMethd_OutPac 
{
	static void display()
	{
		System.out.println("Welcome");
		Assig13_2_CallStaticMethd_OutPac.add(25.5f, 10.5f);
	}
	public static void main(String[] args) 
	{
		display();
	}
}
