package exercise1;

import java.util.Scanner;

public class MODIFICATION {

	public static void main(String[] args) {
		
		System.out.println("OCEAN LEVELS ARE RISING BY 1.5 mm EACH YEAR!");
		System.out.println("--------------------------------------------\n");
		
		Scanner input = new Scanner(System.in);
		int year=0;
		System.out.print("How many years you want to see rise: ");
		year = input.nextInt();
		
		if(year < 1)
		{
			System.out.println("invalid number of years!");
			input.close();
			System.exit(-1);
		}
		
		
		for(int i=0; i<year; ++i)
		{
			System.out.println("Next " + (i+1) + " year:  " + (i*1.5));
		}
		
		input.close();
	}
	
}
