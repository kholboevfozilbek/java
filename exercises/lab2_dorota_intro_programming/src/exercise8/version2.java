package exercise8;

import java.util.Scanner;

public class version2 {

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

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day=0, month=0, year=0;
		int kun=0;
		System.out.print("Enter the day:  ");
		day = input.nextInt();
		System.out.print("Enter the month:  ");
		month = input.nextInt();
		System.out.print("Enter the year:  ");
		year = input.nextInt();
		
		if(day < 1 || day > 31 || month < 1 || month > 12)
		{
			System.out.println("INVALID DATE!");
			System.exit(1);
		}
		else if(year < 999 || year > 10000)
		{
			System.out.println("INVALID DATE!");
			System.exit(1);
		}
		
		if(leap_year(year) == false)
		{
			int days_31 = month/2;
			days_31 = days_31 * 31;
				
			int days_30 = month/2;
			days_30 -= 2;
				
			kun = days_31 + days_30 + day;
				
			System.out.println("DATE: " + day + "." + month + "." + year);
			System.out.println("Days passed since the beginning of the year:  " + kun);
		}
		else
		{
			int days_31 = month/2;
			days_31 = days_31 * 31;
			
			int days_30 = month/2;
			days_30 -= 1;
			
			kun = days_31 + days_30 + day;
			
			System.out.println("DATE: " + day + "." + month + "." + year);
			System.out.println("Days passed since the beginning of the year:  " + kun);
		}
		
		input.close();
	}
}
