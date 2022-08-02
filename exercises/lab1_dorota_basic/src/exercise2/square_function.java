package exercise2;

import java.util.Scanner;

public class square_function {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0, c=0;
		float x=0.0f;
		
		System.out.println("Program outputs the value of square function.");
		System.out.println("Enter coefficients of the square function.");
		System.out.print("a: ");
		a = input.nextInt();
		System.out.print("b: ");
		b = input.nextInt();
		System.out.print("c: ");
		c = input.nextInt();
		System.out.print("Enter value of argument:  ");
		x = input.nextFloat();	
		
		float y = (a* x*x) + (b*x) + c;
		
		System.out.println("Value of the square function:  " + y);
		
		input.close();
	}

}
