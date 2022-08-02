package exercise2;

import java.util.Scanner;

public class twoDigit_analyser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x=0;
		System.out.print("Enter some integer:  ");
		x = input.nextInt();
		
		if(x >= 10 && x <= 99)
		{
			System.out.println(x + " is two-digit number");
		}
		else if(x >= -99 && x <= -10)
		{
			System.out.println(x + " is two-digit number");
		}
		else 
		{
			System.out.println(x + " is NOT two-digit number");
		}
		input.close();
	}

}
