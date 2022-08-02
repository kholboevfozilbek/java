package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[5];
		float sum=0.0f;
		
		System.out.println("Enter 5 integer:  ");
		for(byte i=0; i<5; ++i)
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
