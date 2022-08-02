package exercise3;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0;
		
		System.out.print("Enter a:  ");
		a = input.nextInt();
		
		System.out.print("Enter b:  ");
		b = input.nextInt();
		
		System.out.println(a + " + " + b +" = " + (a+b));
		System.out.println(a + " - " + b +" = " + (a-b));
		System.out.println(a + " * " + b +" = " + (a*b));
		System.out.println(a + " / " + b +" = " + (a/b));
		System.out.println(a + " % " + b +" = " + (a%b));
		
		
		
		input.close();

	}

}
