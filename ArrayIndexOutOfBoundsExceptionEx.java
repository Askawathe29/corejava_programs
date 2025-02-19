package CoreJava;

//Write a program using exception handling to handle array index out of bounds.

public class ArrayIndexOutOfBoundsExceptionEx
{
	public static void main(String[] args)
	{
		try
		{
			//Creating array
			int arr[]=new int[10];
			arr[20]=111;
		}
		//catch block
		catch(ArrayIndexOutOfBoundsException e)
		{
			//Displaying the exception message
			System.out.println(e);
		}
		System.out.println("hiiiiiii");
	}
}

/* Output:
 * java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
 * hiiiiiii
 */
