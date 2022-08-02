package exercise4;

import java.util.Scanner;

public class VERSION2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n=0;
		System.out.print("How many integers? : ");
		n = input.nextInt();
		
		int arr[] = new int[n];
		float sum=0.0f;
		
		
		
		
		System.out.println("Enter " + n + " integers:  ");
		for(byte i=0; i<n; ++i)
		{
			System.out.print(i+1 + ": ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}	
		
		System.out.println("\nSum:  " + sum);
		System.out.println("\nAverage:  " + sum/arr.length);
		
		input.close();

	}

}
