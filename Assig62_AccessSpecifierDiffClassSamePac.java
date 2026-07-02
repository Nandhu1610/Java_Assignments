package java_assignments;

//WAP to access Public, protected, default & private methods from different class but within a package
public class Assig62_AccessSpecifierDiffClassSamePac extends Assig61_AccessSpecifierWithinClass
{
	public static void main(String[] args) 
	{
		Assig61_AccessSpecifierWithinClass obj=new Assig61_AccessSpecifierWithinClass();
		obj.add(10, 20);
		obj.sub(50, 20);
		obj.mul(5, 10);
	}
}
