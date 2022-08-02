package exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Learn to walk before you run");
			System.out.print("You want to repeat? [y/n]: ");
			choice = input.next().charAt(0);
			
		} while (choice == 'y' || choice == 'Y');
		
		input.close();
	}

}
