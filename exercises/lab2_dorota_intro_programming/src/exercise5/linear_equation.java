package exercise5;

import java.util.Scanner;

public class linear_equation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float a=0.0f, b=0.0f;
		
		System.out.println("Program solves linear equation in form of ax + b = 0\n");
		System.out.print("Enter coefficient a:  ");
		a = input.nextFloat();
		System.out.print("Enter coefficient b:  ");
		b = input.nextFloat();
		
		b = b * -1;
		
		double x = b/a;
		
		System.out.println("value of x:  " + x);
		
		input.close();
	}

}
