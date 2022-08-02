package exercise5;

import java.util.Scanner;

public class Exercise5 {

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
		
		System.out.println("Number of odd values: " + num_odd(arr));
		System.out.println("Index  of largest odd value: " + largest_odd(arr));
		
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
	public static int num_odd(int arr[])
	{
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 != 0)
				++counter;
		}

		return counter;
	}
	public static int largest_odd(int arr[])
	{
		int large= -2147483648;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 != 0)
			{
				if(arr[i] > large)
				{
					large = arr[i];
					index = i;
				}
			}
				
		}
		
		return index;
	}

}
