package java1_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//WAP on checked Exceptions
public class Assig125_CheckedException 
{
	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		Thread.sleep(5000);
		FileInputStream fis=new FileInputStream(" ");
		System.out.println(fis);
	}
}
