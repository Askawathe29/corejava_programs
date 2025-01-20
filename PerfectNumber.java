package CoreJava;

//Write a java program to check given number is perfect number or not

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int sum=0;
		//Logic of the code
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				//adding the divisor in sum variable
				sum=sum+i;
			}	
		}
		//Checking if the sum of all divisors equals to num
		if(sum==num)
		{
			System.out.println(+num+" is a perfect number");
		}
		else
		{
			System.out.println(+num+" is not a perfect number");
		}
	}
}

/*
Output:
Enter a number : 
6
6 is a perfect number

Enter a number : 
9
9 is not a perfect number
*/
