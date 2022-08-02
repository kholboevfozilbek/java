package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		char ch;
		do 
		{
			System.out.println("Enter x:  ");
			int x = input.nextInt();
			if(positive(x) == true)
			{
				if(isPrime(x) == true)
				{
					System.out.println("Number " + x + " is prime!");
				}
				else
				{
					System.out.println("Number " + x + " is NOT prime!");
				}
			}
			else
			{
				System.out.println("The number was negative please enter positive ");
			}
			
			System.out.print("You want to try again? [y/n]:  ");
			ch = input.next().charAt(0);
		} while(ch == 'y' || ch == 'Y');
		
		input.close();
	}
	
	public static boolean positive(int x)
	{
		if(x > 0)
			return true;
		return false;
	}
	public static boolean isPrime(int x)
	{
		for (int i = 2; i < x; i++) {
			if(x % i == 0)
				return false;
		}
		
		return true;
	}

}
