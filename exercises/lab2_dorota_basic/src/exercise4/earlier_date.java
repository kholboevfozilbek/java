package exercise4;

import java.util.Scanner;

public class earlier_date {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int day1=0, month1=0, year1=0;
		int day2=0, month2=0, year2=0;
		
		System.out.println("EARLIER DATE");
		System.out.println("--------------");
		
		System.out.println("Enter the first date (dd/mm/yy)");
		System.out.println("day:  "); day1= input.nextInt();
		System.out.println("month:  "); month1= input.nextInt();
		System.out.println("year:  "); year1= input.nextInt();
		
		System.out.println("--------------");
		
		System.out.println("Enter the second date (dd/mm/yy)");
		System.out.println("day:  "); day2= input.nextInt();
		System.out.println("month:  "); month2= input.nextInt();
		System.out.println("year:  "); year2= input.nextInt();
		
		if(year1 < year2)
		{
			System.out.println(day1 + "/" + month1 + "/" + year1 + " is earlier");
		}
		else if(year2 < year1)
		{
			System.out.println(day2 + "/" + month2 + "/" + year2 + " is earlier");
		}
		else
		{
			if(month1 < month2)
			{
				System.out.println(day1 + "/" + month1 + "/" + year1 + " is earlier");
			}
			else if(month2 < month1)
			{
				System.out.println(day2 + "/" + month2 + "/" + year2 + " is earlier");
			}
			else
			{
				if(day1 < day2)
				{
					System.out.println(day1 + "/" + month1 + "/" + year1 + " is earlier");
				}
				else if(day2 < day1)
				{
					System.out.println(day2 + "/" + month2 + "/" + year2 + " is earlier");
				}
				else
				{
					System.out.println("\nDATES ARE SAME!");
				}
			}
		}
		input.close();
	}

}
