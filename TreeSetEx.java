package CoreJava;

import java.util.TreeSet;

//Write a program using TreeSet to insert Integer values and print them.

public class TreeSetEx
{
	public static void main(String[] args) 
	{
		//Creating TreeSet to store Integer values
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//Adding Integer values to the TreeSet
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		//Displaying the Integer values from TreeSet
		System.out.println(ts);
	}
}

// Output : [10, 20, 30, 40, 50, 60]
