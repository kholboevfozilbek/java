package exercise9;

import java.util.Scanner;

public class earlier_date {

	static boolean leap_year(int year)
	{
		if(year % 4 == 0) // check whether year is divisible by 4
		{
			if(year % 100 == 0) // whether it is a century
			{
				if(year % 400 == 0) // after is divisible 400 then it is leap
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	static boolean valid_date(int day, int month, int year)
	{
		if(leap_year(year) == false)
		{
			if(month == 2 && day == 29)
			{
				return false;
			}
		}
		
		if(day>=1 && day<=31)
		{
			if(month>=1 && month <=12)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day=0, month=0, year=0;
		int day2=0, month2=0, year2=0;
		
		System.out.println("Enter date 1 ");
		System.out.print("Enter the day:  ");
		day = input.nextInt();
		System.out.print("Enter the month:  ");
		month = input.nextInt();
		System.out.print("Enter the year:  ");
		year = input.nextInt();
		
		System.out.println("Enter date 2 ");
		System.out.print("Enter the day:  ");
		day2 = input.nextInt();
		System.out.print("Enter the month:  ");
		month2 = input.nextInt();
		System.out.print("Enter the year:  ");
		year2 = input.nextInt();
		
		if(valid_date(day, month, year) == false)
		{
			System.out.println("INVALID DATE is entered");
			System.out.println(day + "." + month + "." + year);
			System.exit(1);
		}
		else if(valid_date(day2, month2, year2) == false)
		{
			System.out.println("INVALID DATE is entered");
			System.out.println(day2 + "." + month2 + "." + year2);
			System.exit(1);
		}
		
		if(year < year2)
		{
			System.out.println("\n\nEARLIER DATE:" + day + "." + month + "." + year );
		}
		else if(year2 < year)
		{
			System.out.println("\n\nEARLIER DATE:" + day2 + "." + month2 + "." + year2 );
		}
		else 
		{
			if(month < month2)
			{
				System.out.println("\n\nEARLIER DATE:" + day + "." + month + "." + year );
			}
			else if(month2 < month)
			{
				System.out.println("\n\nEARLIER DATE:" + day2 + "." + month2 + "." + year2 );
			}
			else
			{
				if(day < day2)
				{
					System.out.println("\n\nEARLIER DATE:" + day + "." + month + "." + year );
				}
				else if(day2 < day)
				{
					System.out.println("\n\nEARLIER DATE:" + day2 + "." + month2 + "." + year2 );
				}
				else
				{
					System.out.println("\n\nDATES ARE THE SAME!!!");
				}
			}
		}
		
		input.close();
	}

}
