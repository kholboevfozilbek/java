package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times you want to run?:  ");
		int n = input.nextInt();
		
		int count_odd=0;
		for(int i=0; i<n; ++i)
		{
			System.out.print("Enter x:  ");
			int x = input.nextInt();
			
			if(positive(x) == 1)
			{
				System.out.print(x + " is positive and ");
				if(even(x) == true)
					System.out.println("even");
				else
				{
					System.out.println("odd");
					++count_odd;
				}
			}
			else if(positive(x) == -1)
			{
				System.out.print(x + " is negative and ");
				if(even(x) == true)
					System.out.println("even");
				else
				{
					System.out.println("odd");
					++count_odd;
				}
			}
			else
			{
				System.out.println("zero");
			}
		}
		
		System.out.println("\n\nThe end of calculations");
		System.out.println("---------------------------");
		System.out.println("Number of odd elements: " + count_odd);
		
		input.close();

	}
	
	public static int positive(int x)
	{
		if(x > 0)
			return 1;
		else if(x < 0)
			return -1;
		else
			return 0;
	}
	
	public static boolean even(int x)
	{
		if(x % 2 == 0)
			return true;
		else 
			return false;
	}

}
