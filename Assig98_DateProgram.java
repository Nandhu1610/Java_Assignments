package java_assignments;

import java.util.Date;

//WAP to print future data and past date with different formats
public class Assig98_DateProgram 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		//System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String s1=d2.toString();
		System.out.println(s1);
		//String day=s1.substring(0, 3);
		String month=s1.substring(4, 7);
		String date=s1.substring(8, 10);
		//String hour=s1.substring(11, 13);
		//String min=s1.substring(14, 16);
		//String sec=s1.substring(17, 19);
		String year=s1.substring(s1.length()-4);
		String format1=date.concat(month).concat(year);
		System.out.println(format1);
		String format2=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format2);
		String format3=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		String format4=date.concat(".").concat(month).concat(".").concat(year);
		System.out.println(format4);
	}
}
