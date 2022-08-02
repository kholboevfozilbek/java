package com.exercise6.MODOFICATION;

import java.util.Scanner;

public class MODOFICATION {

	public static int gcd(int a, int b)
	{
		int x = a;
		int y=b;
		
		while(x != y)
		{
			if(x>y)
				x = x - y;
			else
				y = y - x;
		}
		
		return x;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, denom = 0;
		char choice;
		
		do {
			System.out.print("Enter numerator:  ");
			num = input.nextInt();
			System.out.print("Enter denominator:  ");
			denom = input.nextInt();
			
			
			if(denom == 0)
			{
				System.out.println("Denominator cantbbe 0!");
				System.exit(-1);
			}
			
			int gcdd = gcd(num, denom);
			
			System.out.print(num + " / " + denom + "  =  ");
			
			if(gcdd != 1)
			{
				num /= gcdd;
				denom /= gcdd;
			}
			System.out.print(num + " / " + denom);
			System.out.print("\n\nYou want to continue? [y/n]: ");
			choice = input.next().charAt(0);
		} while(choice == 'y' || choice == 'Y');
		
		input.close();
	}

}
