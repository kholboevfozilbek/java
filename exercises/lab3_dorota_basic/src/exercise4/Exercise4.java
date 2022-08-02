package exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x=0, n=0;
		float sum=0.0f;

		System.out.print("How many integers? : ");
		n = input.nextInt();
		
		for(int i=0; i<n; ++i)
		{
			System.out.println(i+1 + ":  ");
			x = input.nextInt();
			
			sum += x;
		}
		
		System.out.println("\nSum:  " + sum);
		System.out.println("Average:  " + sum/n);
		
		input.close();

	}

}
