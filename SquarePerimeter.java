//write a program to find the perimeter of the square

package CoreJava;

import java.util.Scanner;

public class SquarePerimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the side of the square : ");
		int s=sc.nextInt();
		int peri=4*s;
		System.out.println("The perimeter of the square is :"+peri);
	}
}

/*Output:
Enter the side of the square : 
22
The perimeter of the square is :88
*/
