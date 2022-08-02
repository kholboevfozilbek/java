package exercise2;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a nonnegative number:  ");
		int number = input.nextInt();
		
		if(number <= 0 )
		{
			System.out.println("POSITIVE NUMBER!");
			System.exit(-1);
		}
		
		float sum=0.0f;
		while(number > 0)
		{
			System.out.print(number%10 + " + ");
			sum += number%10;
			number = number / 10;
		}
		System.out.println(" : " + sum);
		input.close();

	}

}
