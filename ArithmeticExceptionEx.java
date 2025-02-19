package CoreJava;

/*Write a program demonstrating  Exception handling using try catch for Arithmetic 
Exception.*/

public class ArithmeticExceptionEx
{
	public static void main(String[] args) 
	{
		//try block
		try 
		{
			int ans=20/0;
		}
		//catch block
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("hiiii");
		System.out.println("hiiii");
		System.out.println("hiiii");
	}
}

/* Output:
 * java.lang.ArithmeticException: / by zero
 * hiiii
 * hiiii
 * hiiii
 */
