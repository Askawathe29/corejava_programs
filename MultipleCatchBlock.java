package CoreJava;

//Write a program demonstrating multiple catch statements and finally block.

public class MultipleCatchBlock
{
	public static void main(String[] args) 
	{
		try 
		{
			//Creating an array of size 10
			String str=null;
			System.out.println(str.length());
		}
		//Creating multiple catch blocks
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Global Exception");
		}
		//finally block
		finally
		{
			System.out.println("Finally block");
		}
	}
}

/* Output:
 * Null pointer exception
 * Finally block
 */
