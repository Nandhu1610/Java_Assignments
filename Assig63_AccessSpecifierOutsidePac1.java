package java1_assignments;
import java_assignments.Assig61_AccessSpecifierWithinClass;
//WAP to access Public, protected, default & private methods outside the package by becoming sub class
//-BY making Relation
public class Assig63_AccessSpecifierOutsidePac1 extends Assig61_AccessSpecifierWithinClass
{
	public static void main(String[] args) 
	{
		Assig63_AccessSpecifierOutsidePac1 obj=new Assig63_AccessSpecifierOutsidePac1();
		obj.add(1, 40);
		obj.sub(50, 30);
	}
}
