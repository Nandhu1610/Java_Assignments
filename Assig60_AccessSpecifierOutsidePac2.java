package java1_assignments;
import java_assignments.Assig57_AccessSpecifiersWithinClass;
//without becoming sub classWAP to access Public, protected, default & private variables outside the package 
public class Assig60_AccessSpecifierOutsidePac2 
{
	public static void main(String[] args) 
	{
		Assig57_AccessSpecifiersWithinClass obj=new Assig57_AccessSpecifiersWithinClass();
		System.out.println(Assig57_AccessSpecifiersWithinClass.companyName1);
		System.out.println(obj.companyName);
	}
}
