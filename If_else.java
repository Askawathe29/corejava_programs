package CoreJava;

//Write java program to check  candidate eligible for voting or not

import java.util.Scanner;

public class If_else 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the candidate's age : ");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Candidate is eligible for voting");
		}
		else
		{
			System.out.println("Candidate is not eligible for voting");
		}		
	}
}

/* Output:
Enter the candidate's age : 
12
Candidate is not eligible for voting
*/
