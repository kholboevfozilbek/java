package if_else_if_statement;

import java.util.Scanner;

public class if_else_if_ladder_statements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter your age:  ");
		number = input.nextInt();
		
		if(number < 13)
		{
			System.out.println("You are child");
		}
		else if(number < 19)
		{
			System.out.println("You are teenager");
		}
		else 
		{
			System.out.println("You are an adult");
		}
		
		input.close();
	}

}
