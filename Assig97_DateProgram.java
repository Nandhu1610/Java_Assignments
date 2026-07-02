package java_assignments;

import java.util.Date;

//WAP to find out the current time,past time and future time.
public class Assig97_DateProgram 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		//System.out.println(d1.getTime());
		Date currentTime=new Date(d1.getTime());
		System.out.println("Current Time: "+currentTime);
		Date pastTime=new Date(d1.getTime()-1000*60*60*24-10l);
		System.out.println("Past Time 10 days Before: "+pastTime);
		Date futureTime=new Date(d1.getTime()+1000*60*60*24+10l);
		System.out.println("Future Time 10 days After: "+futureTime);
	}
}
