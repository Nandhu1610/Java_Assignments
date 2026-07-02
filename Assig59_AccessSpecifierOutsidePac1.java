package java1_assignments;

import java_assignments.Assig57_AccessSpecifiersWithinClass;

//WAP to access Public, protected, default & private variables outside the package by becoming sub class
//-BY making Relation
public class Assig59_AccessSpecifierOutsidePac1 extends Assig57_AccessSpecifiersWithinClass
{
	public static void main(String[] args) 
	{
		Assig59_AccessSpecifierOutsidePac1 obj=new Assig59_AccessSpecifierOutsidePac1();
		System.out.println(obj.companyName);
		System.out.println(obj.department);
	}
}
