package java_assignments;

//WAP to display the default values of global variables without initializing them.
public class Assig19_GlobalVariable 
{
	static byte a;
	short b;
	static int c;
	long d;
	static boolean b1;
	static String s;
	float f;
	double d1;
	public static void main(String[] args) 
	{
		System.out.println("Default value of byte:"+a);
		Assig19_GlobalVariable ab=new Assig19_GlobalVariable();
		System.out.println("Default value of short:"+ab.b);
		System.out.println("Default value of int:"+c);
		System.out.println("Default value of long:"+ab.d);
		System.out.println("Default value of boolean:"+b1);
		System.out.println("Default value of string:"+s);
		System.out.println("Default value of float:"+ab.f);
		System.out.println("Default value of double:"+ab.d1);
	}
}
