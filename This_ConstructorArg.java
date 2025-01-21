package CoreJava;

//Write a Java Program  to pass  this keyword as argument in the constructor call.

class ABC
{
	// Creating a variable of type This_ConstructorArg 
	This_ConstructorArg var;
	//Passing it as parameter to the constructor
	ABC(This_ConstructorArg var)
	{
		this.var=var;
	}
	void show()
	{
		System.out.println("The value of count variable is : "+var.count);	
	}	
}
public class This_ConstructorArg
{
	int count=1;
	This_ConstructorArg()
	{
		//Creating object of class ABC
		ABC abc=new ABC(this);
		abc.show();		
	}
	public static void main(String[] args) 
	{
		This_ConstructorArg obj=new This_ConstructorArg();
	}
}

/*Output:
 * The value of count variable is : 1
 */
