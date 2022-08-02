package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int quantity=0;
		float price_per_item = 0.0f;
		char choice;
		
		do {
			System.out.print("Enter quantity:  ");
			quantity = input.nextInt();
			System.out.print("Enter the price: ");
			price_per_item = input.nextFloat();
			
			if(quantity * price_per_item > 5000)
			{
				double disocunt = (quantity * price_per_item) * 0.1;
				System.out.println("Total expecnse:  " + (quantity * price_per_item - disocunt));
			}
			else
			{
				System.out.print("Total expense:  " + (quantity * price_per_item));
			}
			System.out.print("you want to repeat? [y/n]:  ");
			choice = input.next().charAt(0);
		} while(choice == 'y' || choice == 'Y');

		input.close();
	}

}
