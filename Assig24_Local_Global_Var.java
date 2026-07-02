package java_assignments;

//WAP that declares an global variable and a local variable with the same name. 
//Display the value of local and global variable
public class Assig24_Local_Global_Var 
{
	static int a=10;
	int b=50;
	public static void main(String[] args)
	{
		int a=20;
		System.out.println("Local Variable:"+a);
		System.out.println("Global Variable:"+Assig24_Local_Global_Var.a);
		Assig24_Local_Global_Var obj=new Assig24_Local_Global_Var();
		System.out.println("Instance Variable:"+obj.b);
	}

}
