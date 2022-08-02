package exercise5;

import java.util.Scanner;
import java.lang.Math;

public class Accrued_Leave {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float hours_week;
		
		while(true)
		{
			System.out.println("Enter number of hours worked (-1 to end):  ");
			hours_week = input.nextFloat();

			if(hours_week <= 0)
				break;
			System.out.println("Accrued leave:  " + Math.round(hours_week * 0.1 + 2));
			
		}
		System.out.println("end of computations");
		
		
		input.close();

	}

}
