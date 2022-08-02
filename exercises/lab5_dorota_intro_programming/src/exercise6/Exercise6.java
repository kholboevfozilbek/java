package exercise6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double number;
		int positive=0, negative=0, total = 0;
		char choice;
		float sum_pos=0.0f, sum_neg=0.0f;
		
		do {
			System.out.print("Enter the number:  ");
			number = input.nextDouble();
			if(number > 0)
			{
				System.out.println(Math.sqrt(number));
				++positive;
				sum_pos += number;
				
			}
			else if(number < 0)
			{
				System.out.println(Math.pow(number, 2));
				++negative;
				sum_neg += number;
			}
			
			++total;
			System.out.print("You want to continue? [y/n]:  ");
			choice = input.next().charAt(0);
			
		} while (choice == 'y' || choice == 'Y');
		
		System.out.print(total + " numbers are given (" + positive + " positive, " );
		System.out.println(negative + " negative). ");
		
		System.out.println("-------------------------------------");
		System.out.println("Sum positive: " + sum_pos + " -> arithmetic av: " + (sum_pos/positive));
		System.out.println("Sum negative: " + sum_neg + " -> arithmetic av: " + (sum_neg/negative));
		
		input.close();

	}

}
