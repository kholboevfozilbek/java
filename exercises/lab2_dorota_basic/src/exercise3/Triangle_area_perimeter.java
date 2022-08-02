package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle_area_perimeter {

	static boolean valid_triangle(float a, float b, float c)
	{
		if (a + b < c || a + c < b || b + c < a)
            return false;
		else
			return true;
	}
	
	static float perimeter(float a, float b, float c)
	{
		return a+b+c;
	}
	static float area(float a, float b, float c)
	{
		float s = (a+b+c)/2.0f;
		return (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		float a=0.0f, b=0.0f, c=0.0f;
		
		System.out.println("TRIANGLE");
		System.out.println("-------------");
		System.out.println("Enter sides of the triangle");
		
		System.out.print("a:  "); a = input.nextFloat();
		System.out.print("b:  "); b = input.nextFloat();
		System.out.print("c:  "); c = input.nextFloat();
		
		if(valid_triangle(a, b, c) == false)
		{
			System.out.println("Can NOT make triangle with sides " + a + "  " + b + "  " + c);
			System.exit(-1);
		}
		
		System.out.println("\n\nArea of triangle:  " + area(a, b, c));
		System.out.println("Perimeter of triangle: " + perimeter(a, b, c));
		
			
		
		input.close();
	}

}
