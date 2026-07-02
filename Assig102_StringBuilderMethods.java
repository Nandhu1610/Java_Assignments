package java1_assignments;

//WAP to demostrate the StringBuilder methods
public class Assig102_StringBuilderMethods 
{
	public static void main(String[] args)
	{
		StringBuilder s1=new StringBuilder(10);
		System.out.println(s1.append(10));
		System.out.println("Append the String: "+s1.append(" Selenium"));
		System.out.println("Append the String: "+s1.append(" Python"));
		System.out.println("Append the String: "+s1.append(" Selenium"));
		System.out.println("Capacity: "+s1.capacity());
		System.out.println("Char at specified index: "+s1.charAt(5));
		System.out.println("Equals: "+s1.equals(null));
		//System.out.println("Index of specified string: "+s1.indexOf(""));
		System.out.println("Empty or not: "+s1.isEmpty());
		System.out.println("Length of the string: "+s1.length());
		System.out.println("Substring at given index: "+s1.substring(5));
		System.out.println("Substring from start and end index: "+s1.substring(5, 8));
		System.out.println("Convert to string: "+s1.toString());
		System.out.println("Delete character at given index: "+ s1.deleteCharAt(1));
		System.out.println("Delete from start and end index: "+s1.delete(0, 4));
		System.out.println("Inserting: "+s1.insert(0, "Core Java "));
		System.out.println("Replace: "+s1.replace(5, 9, "Python"));
		System.out.println("Reverse: "+s1.reverse());
	}
}
