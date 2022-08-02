package lab1_area_square;

import java.util.Scanner;

public class square_area_calculator {
	
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		double a;
		
		System.out.print("Enter side of the square: ");
		a = input.nextDouble();
		
		System.out.printf("\nArea of square: %.2f m2", a*a);
		
		input.close();
		
	}
}
