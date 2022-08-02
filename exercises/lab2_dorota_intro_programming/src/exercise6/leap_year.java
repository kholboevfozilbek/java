package exercise6;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		long year=0l;
		
		System.out.print("Enter the year:  ");
		year = input.nextLong();
		
		if(year % 4 == 0) // check whether year is divisible by 4
		{
			if(year % 100 == 0) // whether it is a century
			{
				if(year % 400 == 0) // after is divisible 400 then it is leap
				{
					System.out.print(year + " year is leap year");
				}
				else
				{
					System.out.print(year + " year is NOT leap year");
				}
			}
			else
			{
				System.out.print(year + " year is leap year");
			}
		}
		else
		{
			System.out.print(year + " year is NOT leap year");
		}
		
		input.close();

	}

}
