package exercise5;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int number = input.nextInt();
		System.out.print("Enter one more number:  ");
		int n = input.nextInt();
		
		String org = Integer.toString(number);
		String last = Integer.toString(n%10);
		org += last;
		
		number = Integer.parseInt(org);
		
		System.out.println("\nDone: " + number);
		
		input.close();
	}
}
