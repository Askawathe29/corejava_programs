package CoreJava;

class Vechile
{
	String brand="Tata";
	String model="Punch";
	int year=2000;
	
	void drive()
	{
		System.out.println("This is drive method");
	}
}
//Inheriting the properties of one class to another using extends keyword
public class Car extends Vechile
{
	String color="white";
	
	void honk()
	{
		System.out.println("This is honk method");
		System.out.println("Brand : "+brand+", Model : "+model+", Year : "+year+", Color : "+color);
	}
	public static void main(String[] args)
	{
		//Creating object of child class
		Car obj=new Car();
		//Calling the methods of parent class and child class
		obj.drive();
		obj.honk();
	}
}

/* Output:
 * This is drive method
 * This is honk method
 * Brand : Tata, Model : Punch, Year : 2000, Color : white
 */
