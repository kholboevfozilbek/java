package basic_input;

import java.util.Scanner;

public class scanner_object {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//int
		int width;
		int height;
		
		System.out.print("Enter width: ");
		width = input.nextInt();
		System.out.print("Enter height: ");
		height = input.nextInt();
		
		System.out.println("Area: " + width*height);
		
		// double
		double a = 0.0;
		a = input.nextDouble();
		System.out.println("Double input: " + a);
		
		//float 
		
		float f = 0.0f;
		f = input.nextFloat();
		System.out.println("Float input: " + f);
		
		
		
		//char
		
		char c = 'F';
		c = input.next().charAt(0);
		System.out.println("Char input: " + c);
		
		// string 
		String word;
		word = input.next();
		System.out.println("String input: " + word);
		
		//bool
		
		Boolean choice;
		choice = input.nextBoolean();
		System.out.println("Bool: " + choice);
		
		input.close();
		
	}

}
