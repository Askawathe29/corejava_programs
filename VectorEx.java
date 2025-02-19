package CoreJava;

import java.util.Vector;

/*Write a program using Vector to store the list of students details and print the
details.*/

class Student_details
{
	String name;
	int roll_no;
	
	//Constructor
	public Student_details(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
	//Method to display student details
	public void display()
	{
		System.out.println(name+" "+roll_no);
	}
}

public class VectorEx 
{
	public static void main(String[] args)
	{
		//Creating a vector to store student details
		Vector<Student_details> v=new Vector<Student_details>();
		//Adding student details to the vector
		v.add(new Student_details("Neha",101));
		v.add(new Student_details("Akshu",102));
		v.add(new Student_details("Pooja",103));
		v.add(new Student_details("Riya",104));
		//Displaying the details
		for(Student_details s:v)
		{
			s.display();
		}
	}
}

/* Output:
 * Neha 101
 * Akshu 102
 * Pooja 103
 * Riya 104
 */ 
