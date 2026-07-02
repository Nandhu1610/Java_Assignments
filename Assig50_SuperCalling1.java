package java_assignments;

//WAP where the parent class has a parameterized constructor 
//and the child class calls it using super().
class Student123
{
	Student123(int rollNo,String name)
	{
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
	}
}
public class Assig50_SuperCalling1 extends Student123
{

	Assig50_SuperCalling1(int rollNo,String name,int marks, char grade) 
	{
		super(rollNo,name);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
	}
	public static void main(String[] args) 
	{
		new Assig50_SuperCalling1(123,"Ram",50,'A');
	}
}
