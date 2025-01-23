package CoreJava;

class Person
{
	String name="Akshata";
	int age=21;
	void speak()
	{
		System.out.println("Person is speaking");		
	}
}
//Inheriting the properties of one class to another using extends keyword
public class Student extends Person
{
	char grade='A';
	void study()
	{
		System.out.println("Student is studying");
		System.out.println("Name : "+name+", Age: "+age+", Grade : "+grade);	
	}
	public static void main(String[] args)
	{
		//Creating object of child class
		Student obj=new Student();
		//Calling the methods of parent class and child class
		obj.speak();
		obj.study();
	}
}

/* Output:
 * Person is speaking
 * Student is studying
 * Name : Akshata, Age: 21, Grade : A
 * */
