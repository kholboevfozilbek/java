package exercise1;

import java.util.Scanner;

public class Learn_to_walk {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n:  ");
		int n  = input.nextInt();
		
		System.out.println("----------------------------");
		for(int i=0; i<n; ++i)
		{
			System.out.println( (i+1) + "." + "Learn to walk before you run");
		}
		input.close();

	}

}
