package exercise7;

import java.util.Scanner;

public class triangle_isoscele {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.print("Enter side a: ");
		a = input.nextFloat();
		System.out.print("Enter side b: ");
		b = input.nextFloat();
		System.out.print("Enter side c: ");
		c = input.nextFloat();
		
		if(a == b || a == c)
		{
			System.out.println("\n\nYES THIS TRIANGLE IS ISOSCELE");
		}
		else if(b == c)
		{
			System.out.println("\\n\\nYES THIS TRIANGLE IS ISOSCELE");
		}
		else 
		{
			System.out.println("\n\nNO this triangle is not isoscele!");
		}
		
		
		input.close();
	}
}
