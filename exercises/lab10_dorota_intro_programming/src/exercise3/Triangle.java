package exercise3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		float a, b, c;
		System.out.println("Enter a: ");
		a = input.nextFloat();
		System.out.println("Enter b: ");
		b = input.nextFloat();
		System.out.println("Enter c: ");
		c = input.nextFloat();
		
		if(valid_triangle(a, b, c) == false)
		{
			System.out.println("\n\nWE CAN NOT BUILD WITH THESE LENGTHS!");
			System.exit(-2);
		}
		
		System.out.println("---------------------------");
		System.out.println("Circumference:  " + perimeter(a, b, c));
		System.out.println("Area:  " + area(a, b, c));
		
		
		input.close();

	}
	
	public static boolean valid_triangle(float a, float b, float c)
	{
		if(a + b < c || a + c < b || c + b < a)
			return false;
	
		return true;
	}
	
	public static float perimeter(float a, float b, float c)
	{
		return a + b + c;
	}
	public static float area(float a, float b, float c)
	{
		float s = (a+b+c) / 2.0f;
		
		return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
