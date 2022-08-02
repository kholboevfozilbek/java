package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positve at-most 6digit number: ");
		int number = input.nextInt();
		
		if(number <= 0)
		{
			System.out.println("Please enter a positive number!");
			System.exit(-1);
		}
		else if(number > 999999)
		{
			System.out.println("at-most 6 digit number!");
			System.exit(-1);
		}
		
		String num = Integer.toString(number);
		boolean equal=true;
		
		for(int i=0, j=num.length() - 1; i<=num.length() / 2 && j > num.length()/2; ++i, --j)
		{
			if(num.charAt(i) != num.charAt(j))
			{
				equal = false;
				break;
			}
		}
		
		if(equal == true)
		{
			System.out.println("all digits of the number are same! ");
		}
		else
		{
			System.out.println("NOT ALL DIGITS ARE SAME IN NUMBER!");
		}
		input.close();

	}

}
