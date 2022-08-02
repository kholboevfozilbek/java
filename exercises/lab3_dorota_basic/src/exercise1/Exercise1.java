package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		int a, b;
		System.out.println("FUNCTION f(x) ax+b");
		System.out.println("------------------");
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		
		for(int i=0; i<=10; ++i)
		{
			System.out.println("f(x) " + a + "*" + i + " + " + b + " = " + (a*i+b));
		}
		input.close();

	}

}
