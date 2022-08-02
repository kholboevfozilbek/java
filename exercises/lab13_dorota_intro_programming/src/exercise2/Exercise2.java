package exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int p, q;
		System.out.print("Enter the length of the array:  ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the range [p, q]");
		System.out.print("Enter p:  "); p = input.nextInt();
		System.out.print("Enter q:  "); q = input.nextInt();
		
		random_gen(arr, p, q);
		display_array(arr);
		
		System.out.print("\nEnter a number to search:  ");
		int x = input.nextInt();
		
		System.out.println("Number of elements less than " + x + ":  " + count_less(arr, x));
		System.out.println("Index of largest among (less than x):  " + largest_less(arr, x));

	}

	public static void random_gen(int arr[], int p, int q)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)Math.floor(Math.random()*(q-p+1)+p);
		}
	}
	public static void display_array(int arr[])
	{
		System.out.println("\nArray elements:  ");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  " );
		}
	}
	
	public static int count_less(int arr[], int x)
	{
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < x)
				++counter;
		}
		
		return counter;
	}
	public static int largest_less(int arr[], int x)
	{
		int heighest = -2147483648;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < x)
			{
				if(arr[i] > heighest)
				{
					heighest  = arr[i];
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == heighest)
				return i;
		}
		
		return -1;
		
		
	}
}
