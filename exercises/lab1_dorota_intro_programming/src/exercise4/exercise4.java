package exercise4;

import java.util.Scanner;

public class exercise4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0, c=0;
		
		System.out.print("Enter three integers: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.println("Sum is " + (a+b+c));
		System.out.printf("Average is %.6f\n", (a+b+c)/3.0);
		System.out.println("Product is " + (a*b*c));
		
		input.close();
		
	}

}
