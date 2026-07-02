package java_assignments;

//WAP that declares a global variable and updates its value inside a method. 
//Display the value before and after the update.
public class Assig23_UpdateGlobalVariableValue 
{
	static int a=10;
	int b=20;
	public static void main(String[] args)
	{
		System.out.println("Before updating the global variable:");
		a=20;
		System.out.println("After updating the global variable:"+a);
		Assig23_UpdateGlobalVariableValue obj=new Assig23_UpdateGlobalVariableValue();
		System.out.println("Before updating the instance variable:"+obj.b);
		System.out.println("After updating the instance variable:"+(obj.b=30)); 
	}
}
