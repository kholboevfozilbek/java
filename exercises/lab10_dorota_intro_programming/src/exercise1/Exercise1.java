package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b;
		System.out.println("Enter the legs");
		System.out.print("a:  "); a = input.nextDouble();
		System.out.print("b:  "); b = input.nextDouble();
		
		System.out.println("\n--------------------");
		System.out.println("hypotenuse:  " + hypotenuse(a, b));
		
		input.close();

	}
	
	public static double hypotenuse(double a, double b)
	{
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

}
