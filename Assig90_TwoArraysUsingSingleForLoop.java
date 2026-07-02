package java_assignments;

import java.util.Arrays;
import java.util.Scanner;

//Define and Initialize two arrays of two different data type and
//iterate both the arrays using single for loop
public class Assig90_TwoArraysUsingSingleForLoop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=sc.nextInt();
		int[] rollNo=new int[size];
		String[] name=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the values of an array rollNo: ");
			rollNo[i]=sc.nextInt();
			System.out.print("Enter the values of an array name: ");
			name[i]=sc.next();
			//System.out.println(rollNo[i]);
        	//System.out.println(name[i]);
		}
        System.out.println(Arrays.toString(rollNo));
        System.out.println(Arrays.toString(name));
        sc.close();
        /*int [] rollno=new int[4];  
          rollno[0]=45;
          rollno[1]=100;
          rollno[2]=40;
          rollno[3]=90;
        
          String [] name=new String[4];
          name[0]="Akshay";
          name[1]="Pavan";
          name[2]="Sonali";
          name[3]="Deepika";

		for(int i=0;i<rollNo.length;i++)
        {
        	System.out.println(rollNo[i]);
        	System.out.println(name[i]);
        }  */           
	}
}
