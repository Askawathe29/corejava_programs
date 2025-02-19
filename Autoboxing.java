package CoreJava;

// Write  a java program for Autoboxing.(All Primitive Types)

public class Autoboxing
{
	public static void main(String[] args)
	{
		//Creating variables using primitive data types
		byte n1=10;
		int n2 = 10;  
		short n3=20;
		long n4=250;
		float n5=22.5f;
		double n6=120.2;
		char c='a';
		boolean b=true;
		
		/*now converting primitive data types into its corresponding wrapper class 
		objects*/
		Byte byteObj=n1;
		Integer intObj = n2;
		Short shortObj=n3;
		Long longObj=n4;
		Float floatObj=n5;
		Double doubleObj=n6;
		Character charObj=c;	
		Boolean boolObj=b;
		
		//Displaying the values of wrapper class objects
		System.out.println("Byte Object : "+byteObj);
		System.out.println("Integer Object : "+intObj);
		System.out.println("Short Object : "+shortObj);
		System.out.println("Long Object : "+longObj);
		System.out.println("Float Object : "+floatObj);
		System.out.println("Double Object : "+doubleObj);
		System.out.println("Character Object : "+charObj);		
	}
}

/*Output:
 * Byte Object : 10
 * Integer Object : 10
 * Short Object : 20
 * Long Object : 250
 * Float Object : 22.5
 * Double Object : 120.2
 * Character Object : a*/
