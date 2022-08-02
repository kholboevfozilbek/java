package exercise1;

import java.util.Scanner;

public class Exercise1 {

	static int greatest(int arr[])
	{
		int great = arr[0];
		for(int x : arr)
		{
			if(x > great)
				great = x;
		}
		
		return great;
	}
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Please enter 5 integers");
		System.out.println("-----------------------");
		
		for(int i=0; i<arr.length; ++i)
		{
			System.out.print(i+1 + ":  ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n\nThe array: ");
		System.out.println("-------------");
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		
		int big = greatest(arr);	
		int counter=0; 
		float sum=0.0f;
		for(int x : arr)
		{
			if(x != big)
			{
				sum += x;
				++counter;
			}
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("NUMBER OF ELEMENTS DIFFERENT THAN: " + big + " = " + counter);
		System.out.println("SUM OF ELEMENTS DIFFERENT THAN: " + big + " = " + sum);
		System.out.println("AVERAGE OF ELEMENTS DIFFERENT THAN: " + big + " = " + sum/counter);
		
		input.close();

	}

}
