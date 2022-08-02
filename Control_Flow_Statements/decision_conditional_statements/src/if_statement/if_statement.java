package if_statement;

import java.util.Scanner;

public class if_statement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char choice;
		
		System.out.print("Is it raining? [y/n]: ");
		choice = input.next().charAt(0);
		
		if(choice == 'y' || choice == 'Y')
		{
			System.out.println("Take your umbrella and rain coat");
		}
		
		input.close();
		
	}

}
