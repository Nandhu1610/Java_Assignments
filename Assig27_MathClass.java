package java_assignments;

//WAP Using Math Class to Display PI, Random and addExact Values
public class Assig27_MathClass 
{
	public static void main(String[] args) 
	{
		double pivalue=Math.PI;
		System.out.println(pivalue);
		double randomValue=Math.random();
		System.out.println(randomValue);
		int add=Math.addExact(10, 20);
		System.out.println(add);
		long add1=Math.addExact(6565, add);
		System.out.println(add1);
	}
}
