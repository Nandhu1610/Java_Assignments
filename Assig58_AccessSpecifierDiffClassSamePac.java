package java_assignments;

//WAP to access Public, protected, default & private variables from different class 
//but within a package
public class Assig58_AccessSpecifierDiffClassSamePac extends Assig57_AccessSpecifiersWithinClass
{
	public static void main(String[] args) 
	{
		Assig58_AccessSpecifierDiffClassSamePac obj=new Assig58_AccessSpecifierDiffClassSamePac();
		System.out.println(obj.companyName);
		System.out.println(obj.department);
		System.out.println(obj.designation);
		//System.out.println(Assig58_AccessSpecifierDiffClassSamePac.age);
		System.out.println(age);
	}
}



//If i make the relation b/w two classes, i can access the variables directly or else i can access it by classname.variablename for global variables.