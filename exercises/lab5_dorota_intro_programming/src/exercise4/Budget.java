package exercise4;

import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the budget for month:  ");
		float budget=input.nextFloat();
		float spent=0.0f, total=0.0f;
		
		
		do {
			System.out.print("Enter amount spent:  ");
			spent = input.nextFloat();
			total += spent;
		} while(spent > 0);
		
		System.out.println("Budgeted:  " + budget);
		if(total < budget)
		{
			System.out.println("Spent:  " + total);
			System.out.println("You are" + (budget-total) + " under budget. WELL DONE!");
		}
		else
		{
			System.out.println("Spent:  " + total);
			System.out.println("You are " + (total-budget) + " over budget. PLAN BETTER!");
		}
		input.close();

	}

}
