package CoreJava;

// Write a program to check given number is prime number or not

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		//Creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		boolean isPrime=true;
		
		//loop for checking if num is divided by any number
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				//Storing the value in isPrime variable
				isPrime=false;	
				break;
			}					
		}
		//Checking if the condition is true or false
		if (isPrime && num>1)
		{
			System.out.println(+num+" is a prime number");
		}
		else
		{
			System.out.println(+num+" is not a prime number");
		}
	}
}

/*Output:
Enter a number : 
9
9 is not a prime number

Enter a number : 
19
19 is a prime number
*/
