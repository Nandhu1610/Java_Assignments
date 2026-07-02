package java_assignments;

//WAP to demonstrate multilevel inheritance with method overloading 
class Person
{
	static void displayPerson(int age)
	{
		System.out.println("AGE: "+age);
	}
	static void displayPerson(String name)
	{
		System.out.println("NAME: "+name);
	}
}
class Student extends Person
{
	static void displayStudent(int rollno)
	{
		System.out.println("ROLLNO: "+rollno);
	}
	void displayStudent(String dept)
	{
		System.out.println("DEPT: "+dept);
	}
}
public class Assig46_MLIusingMethodOverloading extends Student
{
	public static void main(String[] args)
	{
		Assig46_MLIusingMethodOverloading obj=new Assig46_MLIusingMethodOverloading();
		displayPerson("Ram");
		displayPerson(20);
		displayStudent(546546546);
		obj.displayStudent("ECE");
	}
}
