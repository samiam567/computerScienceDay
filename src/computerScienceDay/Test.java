package computerScienceDay;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		boolean myBool = false;
		
		int myInt = 100000;
		long myLong = 100000;
		
		float myFloat = 3.14f;
		double myDouble = 3.14159;
		
		
		
		String myString = "hi";
		char myChar = 'A';
		
		System.out.println(myString);
		
		Scanner key = new Scanner(System.in);
		myString = key.next();
		
		System.out.println(myString);
		
		myString = myString + "1";
		
		
		System.out.println(myString);
		
		
	}

}
