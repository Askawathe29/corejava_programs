package CoreJava;

//Write java program to invoke current class method using this keyword

public class ThisMethod
{
	void display()
	{
		System.out.println("I am display method");
	}	
	void show()
	{
		//Calling display method implicitly using this keyword
		this.display();
		System.out.println("I am show method");
	}
		
	public static void main(String[] args)
	{		
		//Creating object of ThisMethod class
		ThisMethod obj=new ThisMethod();
		obj.show();
	}
}

/* Output:
 * I am display method
 * I am show method
*/
