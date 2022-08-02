package exercise4;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("MULTIPLICATION TABLE");
		System.out.print("Enter the number:  ");
		n = input.nextInt();
		System.out.println("---------------------");
		
		
		for(int i=1; i<=9; ++i)
		{
			System.out.println(i + " * " + n + " = " + (i*n));
		}
		input.close();
	}

}
