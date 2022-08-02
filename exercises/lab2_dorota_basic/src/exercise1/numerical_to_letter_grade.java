package exercise1;

import java.util.Scanner;

public class numerical_to_letter_grade {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Numeical Grade to Letter Grade Converter  ");
		System.out.println("----------------------------------------");
		
		int num_grade=0;
		System.out.print("Enter numerical grade:  ");
		num_grade = input.nextInt();
		
		if(num_grade > 100 || num_grade < 0)
		{
			System.out.println("INVALID GRADE!");
			System.exit(-1);
		}
		
		switch (num_grade/10) 
		{
			case 10: 
			case 9:
				System.out.println("Letter Grade: A");
				break;
			case 8:
				System.out.println("Letter Grade: B");
				break;
			case 7:
				System.out.println("Letter Grade: C");
				break;
			case 6:
				System.out.println("Letter Grade: D");
				break;
			default:
				System.out.println("Letter Grade: F");
				break;
		}
		
		input.close();

	}

}
