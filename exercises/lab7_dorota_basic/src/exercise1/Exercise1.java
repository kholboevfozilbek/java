package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the array:   ");
		int n = input.nextInt();
		System.out.println("Enter the range [a, b]   ");
		System.out.print("a:  "); int a = input.nextInt();
		System.out.print("b:  "); int b = input.nextInt();
		
		int arr[] = new int[n];
		
		generateArray(arr, a, b);
		displayArray(arr);
		
		System.out.println("Number of odd values: " + count_odd(arr));
		
		if(count_odd(arr) > 0)
		{
			System.out.println("Average of odd values:  " + average_odd(arr));
		}
		
		input.close();

	}
	
	public static void generateArray(int arr[], int a, int b)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.floor(Math.random() * (b - a+1)+a);
		}
	}
	public static void displayArray(int arr[])
	{
		System.out.println("\nThe array elements:  ");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
	}
	
	public static int count_odd(int arr[])
	{
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 != 0)
				++counter;
		}

		return counter;
	}
	public static float average_odd(int arr[])
	{
		float sum=0.0f;
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 != 0)
			{
				++counter;
				sum += arr[i];
			}
		}
		
		return sum / counter;
	}
}
