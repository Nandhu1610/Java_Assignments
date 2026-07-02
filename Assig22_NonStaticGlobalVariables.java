package java_assignments;

//WAP on non static global variable or instance variable
public class Assig22_NonStaticGlobalVariables 
{
	int marks;
	void setMarks(int m)
	{
		marks=m;
	}
	void showMarks()
	{
		System.out.println(marks);
	}
	public static void main(String[] args) 
	{
		Assig22_NonStaticGlobalVariables obj1=new Assig22_NonStaticGlobalVariables();
		Assig22_NonStaticGlobalVariables obj2=new Assig22_NonStaticGlobalVariables();
		obj1.setMarks(95);
		obj2.setMarks(85);
		obj1.showMarks();
		obj2.showMarks();
	}
}
