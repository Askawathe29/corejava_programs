package CoreJava;

/*Write a program to check leap year using if else. 
 * How to check whether a given year is a leap year or not
 */

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(+year+" is a leap year");
		}
		else
		{
			System.out.println(+year+" is not a leap year");
		}
	}
}

/*Output:
 * Enter a year : 
2000
2000 is a leap year
 */
