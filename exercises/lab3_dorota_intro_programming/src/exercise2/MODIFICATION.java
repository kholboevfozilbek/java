package exercise2;

import java.util.Scanner;

public class MODIFICATION {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float cal=0.0f;
		
		System.out.println("CALORIES BURNED  PER MINUTE!");
		System.out.print("Enter amount of calories burned per minute: ");
		cal = input.nextFloat();
		System.out.println("-------------------------------");
		
		for(int i=5; i<=30; i+=5)
		{
			System.out.println("After " + i + " minutes:  " + (i*cal));
		}
		
		input.close();
	}

}
