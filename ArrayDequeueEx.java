package CoreJava;

import java.util.ArrayDeque;

/*Write a program using ArrayDeque to add book names and add,delete the values from 
 * both ends of queue.*/

public class ArrayDequeueEx 
{
	public static void main(String[] args) 
	{
		//Creating ArrayDeque
		ArrayDeque<String> a=new ArrayDeque<String>();
		//Adding books from both ends
		a.addFirst("C Programming");
		a.addFirst("Data Structures");
		a.addLast("Java");
		a.addLast("Basics of Python");
		//Displaying the name of books
		for(String i:a)
		{
			System.out.println(i);
		}
		//Removing books from both ends
		a.removeFirst();
		a.removeLast();
		System.out.println();
		System.out.println("ArrayDeque after removing books from both ends : ");
		for(String i:a)
		{
			System.out.println(i);
		}
	}
}

/* Output:
 * Data Structures
 * C Programming
 * Java
 * Basics of Python

 * ArrayDeque after removing books from both ends : 
 * C Programming
 * Java*/
