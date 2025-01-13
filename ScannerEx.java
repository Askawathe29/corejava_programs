package CoreJava;

/*Write a Java program to take Employee id,name,address & salary from user and display on to screen.*/

import java.util.Scanner;

public class ScannerEx
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id=sc1.nextInt();
		System.out.println("Enter employee name : ");
		String name=sc2.nextLine();
		System.out.println("Enter employee address : ");
		String add=sc3.nextLine();
		System.out.println("Enter employee salary : ");
		int sal=sc4.nextInt();
		
		System.out.println();
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee address : "+add);
		System.out.println("Employee salary : "+sal);		
	}
}

/*Output:
Enter employee id : 
101
Enter employee name : 
akshu
Enter employee address : 
solpaur
Enter employee salary : 
25000

Employee id : 101
Employee name : akshu
Employee address : solpaur
Employee salary : 25000
*/
