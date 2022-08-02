package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x:  ");
		int x = input.nextInt();
		char ch;
		do 
		{
			if(positive(x) == true)
			{
				displayFactors(x);
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
	public static void displayFactors(int x)
	{
		System.out.println("Factors of the number " + x );
		for(int i=1; i<=x; ++i)
		{
			if(x % i == 0)
				System.out.print(i + "  ");
		}
	}

}
