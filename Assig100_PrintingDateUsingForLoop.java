package java1_assignments;

import java.util.Arrays;

/*
WAP using for loop to print the output as :
Todays date is: 10
Month is: March
Year is: 2026
Hour is: 20
Min is: 53
Sec is"" 46
To print the above mentioned output use input string as :
String input="10 March 2026 20 53 46";
*/
public class Assig100_PrintingDateUsingForLoop 
{
	public static void main(String[] args) 
	{
		String input="10 March 2026 20 53 46";
		String[] s1=input.split(" ");
		System.out.println(Arrays.toString(s1));
		String[] s2= {"Todays date is: ", "Todays month is: ", "Year is: ", "Hour is: ","Min is: ","Sec is: "};
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s2[i]+s1[i]);
		}
		/*OTHER WAY TO WRITE THIS PROGRAM USING SWITCH CASE
		 * 
		 *  String input="10 March 2026 20 53 46";
			String[] s1=input.split(" ");
			System.out.println(Arrays.toString(s1));
			for(int i=0;i<s1.length;i++)
			{
				Switch(i)
				{
					case 0:
				        System.out.println("Todays date is: " + s1[i]);
				        break;
				    case 1:
				        System.out.println("Month is: " + s1[i]);
				        break;
				    case 2:
				        System.out.println("Year is: " + s1[i]);
				        break;
				    case 3:
				        System.out.println("Hour is: " + s1[i]);
				        break;
				    case 4:
				        System.out.println("Min is: " + s1[i]);
				        break;
				    case 5:
				        System.out.println("Sec is: " + s1[i]);
				        break;							
				}
			}
		 */
	}
}

